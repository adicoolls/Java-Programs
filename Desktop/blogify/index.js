const express = require("express");
const path = require("path");
const mongoose = require("mongoose");

const cookieParser = require("cookie-parser");
const jwt = require("jsonwebtoken");
const UserRoute = require("./routes/user");

const { checkForAuthenticationCookie } = require("./middlewares/authentication");
const app = express();
const PORT = 8000;
mongoose
 .connect("mongodb://localhost:27017/blogify")
 .then(() => console.log("mongodb connected") ) ;
app.set("views", path.resolve("./views"));
app.set("view engine", "ejs");
app.use(express.json());
app.use(express.urlencoded({extended:false}));
app.use("/user", UserRoute);

app.use(cookieParser());
app.use(checkForAuthenticationCookie("token"));
app.get("/", (req, res) =>{
    res.render("home", { user: req.user });
})

app.listen(PORT, () => console.log(`server started at ${PORT}`));