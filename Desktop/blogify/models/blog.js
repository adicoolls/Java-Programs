const mongoose = require("mongoose");
const BlogSchema = mongoose.Schema({
    title : {
        type : String,
        required : true
    },
    body : {
        type : String ,
        required : true
    },
    coverImageURL : {
        type : String,
        required : false,
    },
    createdBy : {
        type : Schema.Types.ObjectId,
        ref : "user"
    }
}, {timestamps : true})

module.exports = mongoose.model("blog", BlogSchema);