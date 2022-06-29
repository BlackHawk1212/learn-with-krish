var net = require('net');

var port = 42181;
var host = '127.0.0.1';

var server = net.createServer((socket) => {
    socket.on('end', () => {
        console.log('Server: Client Disconnected');
    });
});

server.on('connection', (socket) => {
    console.log(`Connected from: ${socket.remoteAddress}:${socket.remotePort}`);
    socket.write('Hello Client');
    socket.end;
});

server.on('error', (err) => {
    throw err;
});

server.listen(port, host);
