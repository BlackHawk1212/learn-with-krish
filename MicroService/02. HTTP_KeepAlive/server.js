const express = require('express');
const app = express();

app.get('/wait', async (req, res) => {
    await new Promise((resolve) => setTimeout(resolve, 60000)) // Set time for 1 Minute
    res.send('Job Done');
});

app.listen(8191);