const {createHmac, randomBytes} = require("crypto")
const mongoose = require("mongoose");
const { stringify } = require("querystring");

const UserSchema = mongoose.Schema({
    Name : {
        type : String,
        require : true,

    },
    Email :{
        type : String,
        require:true,
        unique : true
    },
    Salt : {
        type : String,
      
    },
    Password : {
        type : String,
        require : true
    },
    profileImageURL : {
        type: String,
        default : "/public/images/userprofile.jpg"
    },
    Role:{
        type: String,
        enum : ["USER", "ADMIN"],
        default:"USER",
    }

}, {timeStamp : true});

UserSchema.pre("save", function(next){
    const user = this;

    if(!this.isModified("password")) return;

    const salt = randomBytes(16).toString();
    const hashedPassword = createHmac("sha256", salt)
     .update(this.password)
     .digest("hex");

    this.salt = salt;
    this.password = hashedPassword;
    next();


})

module.exports = mongoose.model("User", UserSchema);