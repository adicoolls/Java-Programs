const { validateToken } = require("../services/auth");

function checkForAuthenticationCookie(cookieName){
    return (req, res, next) => {
        const tokenCookieValue = req.cookeies[cookieName];
        if(!tokenCookieValue){
            next();
        }
        try{
            const userPayload = validateToken(tokenCookieValue);
            req.user = userPayload;
         
        }catch(error){}
        next();
    }
}

module.exports = {
    checkForAuthenticationCookie,
}