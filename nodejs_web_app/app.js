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
const host = '192.168.1.240'
const port = '1883'
const clientId = `mqtt_${Math.random().toString(16).slice(3)}`

const connectUrl = `${protocol}://${host}:${port}`

const topic = '/home/temperature'
const topic2 = '/home/humidity'
const topic3 = '/home/led'

let temperature;
let humidity;

const client = mqtt.connect(connectUrl, {
    clientId,
    clean: true,
    connectTimeout: 4000,
    username: 'emqx',
    password: 'public',
    reconnectPeriod: 1000,
})

client.on('connect', () => {
    console.log('Connected')
    client.subscribe([topic], () => {
        console.log(`Subscribe to topic '${topic}'`)
    })
    client.subscribe([topic2], () => {
        console.log(`Subscribe to topic '${topic2}'`)
    })

    io.on('connection', function(socket) {

        client.on('message', (topic, payload) => {
            console.log('Received Message:', topic, payload.toString())
            if (topic.localeCompare("/home/temperature") == 0) {
                temperature = payload.toString();
                socket.emit('temperature', payload.toString());
            }
            else if (topic.localeCompare("/home/humidity") == 0) {
                humidity = payload.toString();
                socket.emit('humidity', payload.toString());
            }
        })

        socket.on('getData', function() {
            socket.emit('temperature', temperature);
            socket.emit('humidity', humidity);
        })
    })
})

app.get('/', (req, res) => {
    res.sendFile(__dirname + '/views/index.html');
});

server.listen(3000, () => {
  console.log('listening on *:3000');
});