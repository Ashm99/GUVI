const express = require('express')//kind of an import statement to include express module for this project
const { getDb, connectToDb } = require('./db')//Requires the mongodb connection through db.js file present in the same path

const app = express(); //creating an express application and assigning it to the app constant

let db
//Calling the connection property to 
// 1. establish a connection
// 2. start the server
// 3. Assign the connection to a const object

//Establishing a connection with a callback
connectToDb((err) => {
    if(!err){
        console.log("Trying to establish connection to database from application...")
        //Starting the server
        app.listen(3000, function(){
            console.log("App listening on port 3000");
        })
        //Assigning the connection
        db = getDb()
        console.log("Database object:\n" + db)
    }
})

//Route handler - Get all docs
app.get('/text2',function(req, res){
    let userList = []
    db.collection('dummy')
    .find()
    .forEach(elem => userList.push(elem))
    .then( () => {
        res.status(200).json(userList)
    } )
    .catch( () => {
        res.status(500).json({error:"Couldn't fetch the documents"})
    } )
})