const http = require('http');

const PORT = 3000;
const server = http.createServer((req, res) => {
    if(req.url === '/') {
        // res.writeHead(200, {'Content-Type': 'application/json'});
        // res.write('<h1>Welcome to the Home Page</h1>');
        res.end("Welcome to the Home Page");
    }
    if(req.url === '/contact') {
        // res.writeHead(200, {'Content-Type': 'text/html'});
        // res.write('<h1>Contact Us</h1>');
        res.end("Contact Us");
    } else {
        // res.writeHead(404, {'Content-Type': 'text/html'});
        // res.write('<h1>Page Not Found</h1>');
        res.end("Page Not Found");
    }
});

server.listen(PORT, () => console.log(`Server is running on port ${PORT}`));