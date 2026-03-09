const {Router} = require("express");

const router = Routerr();

router.get("/add-new", (req, res) => {
    return res.render("addBlog", {
        user : res.user,
    });
});
module.exports = router;