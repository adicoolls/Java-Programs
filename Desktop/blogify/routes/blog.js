const {Router} = require("express");
const blog = require("../models/blog");
const multer = require("multer");
const router = Router();
const path = require("path")
const storage = multer.diskStorage({
    destination : function(req, file, cb){
        cb(null, path.resolve(`./public/uploads/`));
    },
    filename : function(req, file, cb){
        const fileName = `${Date.now()}-${file.originalname}`;
        cb(null, fileName)
    },
});

const upload = multer({storage : storage});

router.get("/add-new", (req, res) => {
    return res.render("addBlog", {
        user : req.user,
    });
});

router.post("/", upload.single("coverImage"), async (req, res) => {
   const { title, body } = req.body;

   if (!req.user) {
      return res.redirect("/");
   }
        console.log("route hit");
   const newBlog = await blog.create({
      title,
      body,
      createdBy: req.user._id,
      coverImageURL: req.file ? `/uploads/${req.file.filename}` : null
   });

   return res.redirect(`/blog/${newBlog._id}`);
   //return res.redirect("/");
});

router.get("/:id", async (req, res) => {
   const blogPost = await blog.findById(req.params.id).populate("createdBy");
   if (!blogPost) {
      return res.status(404).render("404", { error: "Blog not found" });
   }
   return res.render("blog", {
      user: req.user,
      blog: blogPost,
   });
});

module.exports = router;