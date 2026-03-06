const express = require('express');
const bodyParser = require('body-parser');
require('dotenv').config();

const app = express();
app.use(bodyParser.json());
app.use(express.static('public'));

// app.get('/', (req, res) => {
//   res.json({ message: 'Hello, Aryan!' });
// });

app.get('/info', (req, res) => {
    const qp = req.query;
    const name = qp.name || 'Unknown';
    const role = qp.role || 'Unknown';
  res.json({ name: name, role: role });
});

app.post('/data', (req, res) => {
  const body = req.body;
  const name = body.name || 'Unknown';
  const role = body.role || 'Unknown';
  res.json({ message: 'Data received successfully!', name: name, role: role });
});

app.post('/login', (req, res) => {
    const body = req.body;
    const username = body.username;
    const pass = body.password;

    if (username === 'admin' && pass === 'password') {
        res.json({ message: 'Login successful!' });
    } else {
        res.status(401).json({ message: 'Invalid credentials' });
    }
});

const PORT = process.env.PORT || 8000;
app.listen(PORT, () =>console.log(`Server is running on port ${PORT}`));