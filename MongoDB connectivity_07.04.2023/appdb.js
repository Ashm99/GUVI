const express = require('express') //kind of an import statement to include express module for this project

const{getDb, connectToDb} = require('./db')//Requires the mongodb connection through db.js file present in the same path

const app = express(); //creating an express application and assigning it to the app constant

let db;
//Calling the connection property to 
// 1. establish a connection
// 2. start the server
// 3. Assign the connection to a const object

//Establishing a connection with a callback
connectToDb((err)=>{
    if(!err){
        //Starting the server
        app.listen(3000, function(){
            console.log("App listening on port 3000");
        })
         //Assigning the connection
        db = getDb()
    }
})

//Route handler - get
app.get('/text1',function(req, res){
    res.json({msg: "Yo! Took you long enough!"}) //Message to be printed on the page when someone calls the '/text1' api
})