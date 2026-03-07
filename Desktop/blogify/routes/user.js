const {Router} = require("express");
const User = require("../models/user");
const router = Router();

router.get("/signin", (req,res) =>{
    return res.render("signin");
});
router.get("/signup", (req, res) =>{
    return res.render("signup");
});
router.post("/signin", async (req, res) => {
    // fix spelling and destructuring
    const { email, password } = req.body;
    const ismatched = await User.matchPassword(email, password);
    console.log(email, password);
    console.log("user", User);
    // redirect or render, not both
    // assuming you want to redirect on success
    res.redirect("/");
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