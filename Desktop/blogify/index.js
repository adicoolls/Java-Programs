const express = require("express");
const path = require("path");
const mongoose = require("mongoose");
const UserRoute = require("./routes/user");
const { error } = require("console");
const app = express();
const PORT = 8000;
mongoose
 .connect("mongodb://localhost:27017/blogify")
 .then(() => console.log("mongodb connected") ) ;
app.set("views", path.resolve("./views"));
app.set("view engine", "ejs");
app.use(express.urlencoded({extended:false}));
app.use("/user", UserRoute);
app.get("/", (req, res) =>{
    console.log("hello world");
    res.render("home");
})

app.listen(PORT, () => console.log(`server started at ${PORT}`));