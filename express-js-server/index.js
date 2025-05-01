import express from "express";
import bodyParser from "body-parser";

const app = express();

app.use(bodyParser.json());

const PORT = process.env.PORT || 3000;

const todos = [
  { id: 1, task: "Learn Node.js", completed: false },
  { id: 2, task: "Learn Express.js", completed: false },
];


// READ
app.get("/todos", (req, res) => {
    res.json(todos);
});

// CREATE
app.post("/todos", (req, res) => {
    const todoBody = req.body;
    
    todos.push({
        id: todos.length + 1,
        task: todoBody.task,
        completed: todoBody.completed || false,
    });

    res.json({
        message: "Todo created successfully", 
    });
});

// UPDATE
app.put("/todos/:id", (req, res) => {
    const todoId = parseInt(req.params.id);
    
    const todoIndex = todos.findIndex((todo) => todo.id === todoId);
    if(todoIndex === -1) {
        return res.status(404).json({ message: "Todo not found" });
    }
    todos[todoIndex] = {
        ...todos[todoIndex],
        task: req.body.task || todos[todoIndex].task,
        completed: req.body.completed !== undefined ? req.body.completed : todos[todoIndex].completed,
    };
    res.json({
        message: "Todo updated successfully",
    });
})

//DELETE
app.delete("/todos/:id", (req, res) => {
    const todoId = parseInt(req.params.id);
    
    const todoIndex = todos.findIndex((todo) => todo.id === todoId);
    if(todoIndex === -1) {
        return res.status(404).json({ message: "Todo not found" });
    }
    todos.splice(todoIndex, 1);
    res.json({
        message: "Todo deleted successfully",
    });
})

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
