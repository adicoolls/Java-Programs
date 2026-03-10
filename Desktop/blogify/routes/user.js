const {Router} = require("express");
const User = require("../models/user");
const router = Router();

router.get("/signin", (req,res) =>{
   return res.render("signin")
});
router.get("/signup", (req, res) =>{
    return res.render("signup");
});
router.post("/signin", async (req, res) => {
    const { email, password } = req.body;
   try{
 // fix spelling and destructuring
    
    const token = await User.matchPasswordAndGenerateToken(email, password);
    
    return res.cookie("token", token).redirect("/");
   }catch(error){
     return res.render("signin",{
        error:"incorrect email or password",
     });
   }

   
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

router.get("/logout", (req, res) => {
   return res.clearCookie("token").redirect("/");
})

module.exports = router;