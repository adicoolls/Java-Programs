const {Router} = require("express");
const User = require("../models/user");
const router = Router();

router.get("/signin", (req,res) =>{
    return res.render("signin");
});
router.get("/signup", (req, res) =>{
    return res.render("signup");
});
router.post("/signin", async(req,res)=> {
    const {email, passowrd} = req.body;
    const ismatched = User.matchPassword(email, password);
    
    res.redirect("/").render("signin successfully");
});

router.post("/signup", async(req, res) => {
    const {Name, Email, Password} = req.body;
    await User.create({
       name : req.body.name,
       email : req.body.email,
       password : req.body.password,
    });
    return res.redirect("/");
});

module.exports = router;