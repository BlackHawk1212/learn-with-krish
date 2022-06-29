var net = require('net');

var port = 42181;
var host = '127.0.0.1';

var server = net.createServer((Socket) => {
    Socket.on('end', () => {
        console.log('Server: Client Disconnected');
    });
});

server.on('connection', (socket) => {
    console.log(`connected from: ${socket.remoteAddress}:${socket.remotePort}`);
    socket.write('Hello Client');
    socket.end;
});

server.on('error', (error) => {
    throw error;
});

server.listen(port, host);
