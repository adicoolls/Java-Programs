const express = require("express");
const path = require("path");
const mongoose = require("mongoose");

const cookieParser = require("cookie-parser");
const jwt = require("jsonwebtoken");
const Blog = require("./models/blog");
const UserRoute = require("./routes/user");
const BlogRoute = require("./routes/blog");

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

app.use(cookieParser());
app.use(checkForAuthenticationCookie("token"));
app.use(express.static(path.resolve('./public')));
app.use("/user", UserRoute);
app.use("/blog", BlogRoute);

app.get("/", async(req, res) =>{
   const allBlogs = await Blog.find({});
   console.log("hello world");
   res.render("home", {
    user: req.user,
    blogs : allBlogs,
   })
})

app.listen(PORT, () => console.log(`server started at ${PORT}`));