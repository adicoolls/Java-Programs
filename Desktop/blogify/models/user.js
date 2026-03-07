const {createHmac, randomBytes} = require("crypto")
const mongoose = require("mongoose");
const { stringify } = require("querystring");

const UserSchema = mongoose.Schema({
    name : {
        type : String,
        require : true,

    },
    email :{
        type : String,
        require:true,
        unique : true
    },
    salt : {
        type : String,
      
    },
    password : {
        type : String,
        require : true
    },
    profileImageURL : {
        type: String,
        default : "/public/images/userprofile.jpg"
    },
    role:{
        type: String,
        enum : ["USER", "ADMIN"],
        default:"USER",
    }

}, {timeStamp : true});

UserSchema.pre("save", function(){
    const user = this;

    if(!this.isModified("password")) return ;

    const salt = randomBytes(16).toString("hex");
    const hashedPassword = createHmac("sha256", salt)
     .update(this.password)
     .digest("hex");

    this.salt = salt;
    this.password = hashedPassword;
    


})

module.exports = mongoose.model("User", UserSchema);