const {Router} = require("express");
const User = require("../models/user");
const router = Router();

router.get("/signin", (req,res) =>{
    return res.render("signin");
})
router.get("/signup", (req, res) =>{
    return res.render("signup");
})
router.post("/signup", async(req, res) => {
    const {Name, Email, Password} = req.body;
    await User.create({
        Name,
        Email,
        Password,
    });
    return res.redirect("/");
});

module.exports = router;