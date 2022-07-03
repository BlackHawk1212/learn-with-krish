const express = require('express');
const app = express();

app.get('/wait', async (req, res) => {
    res.send('Job Done');
});

app.listen(8191);