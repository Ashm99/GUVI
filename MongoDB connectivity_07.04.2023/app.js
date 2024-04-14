const express = require('express') //kind of an import statement to include express module for this project

const app = express(); //creating an express application and assigning it to the app constant

//STARTING THE SERVER
app.listen(3000, function(){
    console.log("App listening on port 3000");
})
//Defining the get method(API call or endpoint)
app.get('/text',function(req, res){
    res.json({msg: "Yo! Where were you, Took you long enough!"}) //Message to be printed on the page when someone calls the '/text' api
})