const express = require('express');
const fs = require('fs');

const app = express();
const PORT = 3000;

function readHTML(filePath) {
    try {
        return fs.readFileSync(filePath, 'utf-8');
    } catch (err) {
        console.error('Error reading file:', err);
        return '<h1>Error loading page</h1>';
    }
}

app.get('/', (req, res) => res.json({ message: "Welcome to the Home Page" }));

app.get('/contact', (req, res) => res.send(readHTML('./contact.html')));

app.listen(PORT, () => console.log(`Server is running on port ${PORT}`));