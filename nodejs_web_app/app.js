const express = require('express');
const app = express();
const http = require('http');
const server = http.createServer(app);

const { Server } = require('socket.io');

const io = new Server(server);

app.use(express.static('views'));

app.get('/', (req, res) => {
res.sendFile(__dirname + '/views/index.html');
});

const mqtt = require('mqtt');

const protocol = 'mqtt'
const host = 'xxx.xxx.xx.xx'
const port = 'xxxx'
const clientId = `mqtt_${Math.random().toString(16).slice(3)}`

const connectUrl = `${protocol}://${host}:${port}`

const client = mqtt.connect(connectUrl, {
    clientId,
    clean: true,
    connectTimeout: 4000,
    username: 'emqx',
    password: 'public',
    reconnectPeriod: 1000,
})

let scenes = [];


client.on('connect', () => {

    console.log('Connected')
    client.subscribe(['/ready'], () => {
        console.log(`Subscribe to topic /ready`)
    })

    io.on('connection', function(socket) {

        client.on('message', (topic, payload) => {
            console.log('Received Message:', topic, payload.toString())

            let mess = topic.split('/');

            for (let i = 0; i < scenes.length; i++) {
                if (mess[1].localeCompare(scenes[i].name) == 0) {
                    if (mess[2].localeCompare("humidity") == 0) {
                        scenes[i].humidity.push(payload.toString());
                        scenes[i].timestampsHum.push(new Date());
                    } else if (mess[2].localeCompare("temperature") == 0) {
                        scenes[i].temperature.push(payload.toString());
                        scenes[i].timestampsTemp.push(new Date());
                    }
                    socket.emit('data/returnData', scenes);
                    console.log(scenes[i]);
                }
            }
            
            if (topic.localeCompare("/ready") == 0) {
                socket.emit('/ready');
            }
        })

        socket.on('data/getDataInit', function() {
            socket.emit('data/returnDataInit', scenes);
        })

        socket.on('scenes/saveScene', function(scene) {
            scenes.push(scene);

            client.publish('/createScene', `${scene.name}`);
            client.subscribe([`/${scene.name}/temperature`], () => {
                console.log(`Subscribe to topic /${scene.name}/temperature`);
            })
            client.subscribe([`/${scene.name}/humidity`], () => {
                console.log(`Subscribe to topic /${scene.name}/humidity`);
            })
        })
    })
})

app.get('/', (req, res) => {
    res.sendFile(__dirname + '/views/index.html');
});

server.listen(3000, () => {
  console.log('listening on port 3000');
});