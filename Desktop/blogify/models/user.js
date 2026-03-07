const {createHmac, randomBytes} = require("crypto")
const mongoose = require("mongoose");
const { stringify } = require("querystring");
const { createTokenForUser } = require("../services/auth");

const UserSchema = mongoose.Schema({
    name : {
        type : String,
        required : true,

    },
    email :{
        type : String,
        required:true,
        unique : true
    },
    salt : {
        type : String,
      
    },
    password : {
        type : String,
        required : true
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

}, {timeStamps : true});

UserSchema.pre("save", function(){
    const user = this;

    if(!this.isModified("password")) return ;

    const salt = randomBytes(16).toString("hex");
    const hashedPassword = createHmac("sha256", salt)
     .update(this.password)
     .digest("hex");

    this.salt = salt;
    this.password = hashedPassword;
    


});

UserSchema.static("matchPasswordAndGenerateToken", async function(email,password){
    const user = await this.findOne({email});
    if(!user)throw new Error('User not found');
    console.log(user);
    const salt = user.salt;
    const hashedPassword = user.password;
    
    const userProvideedHash = createHmac("sha256", salt)
    .update(password)
    .digest("hex");
      if(hashedPassword !== userProvideedHash) throw new Error("user not found");
    
      const token = createTokenForUser(user);
      return token;

});

module.exports = mongoose.model("User", UserSchema);