import express from "express";
import bodyParser from "body-parser";

const app = express();

app.use(bodyParser.json());

const PORT = process.env.PORT || 3000;

const data = "Initial data";

const waitingClients = [];

// READ
app.get("/getData", (req, res) => {
  if (req.params.data !== data) {
    res.json({ data });
  } else {
    // If the data is not changed, add the client to the waiting list
    waitingClients.push(res);
  }
});

// UPDATE
app.get("/updateData", (req, res) => {
    const data = req.params.data
    while (waitingClients.length > 0) {
        const client = waitingClients.shift();
        client.json({ data });
    }
    res.json({ message: "Data updated successfully" });
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
