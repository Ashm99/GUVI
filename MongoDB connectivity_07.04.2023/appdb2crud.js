const express = require('express')// kind of an import statement to include express module for this project
const { connectToDb, getDb } = require('./db')// Requires the mongodb connection through db.js file present in the same path
const { ObjectId } = require('mongodb') // Including ObjectId from the node.js's mongodb module, for use in our route handlers
const app = express()// creating an express application and assigning it to the app constant
let db
// Calling the connection property to 
// 1. establish a connection
// 2. start the server
// 3. Assign the connection to a const object

// Establishing a connection with a callback
connectToDb(err=>{
    if(!err){
        console.log("Starting port 3000")
        // Starting the server
        app.listen(3000, () => {
            console.log("App listening on port 3000...")
        })
         // Assigning the connection
        console.log("Connecting app with database object...")
        db = getDb()
        // console.log("db: ")
        // console.log(db)
        console.log("Successfully connected app with db object!")
    }
})

// Route handler - Post
app.use(express.json())//Required for post
app.post('/crud', (req, res) => {
    const user = req.body
    // console.log("Log:" + user)
    db.collection('dummy')
    .insertOne(user)
    .then(result => {
        res.status(200).json(result)
    })
    .catch(err => {
        res.status(500).json({err:'Could not create document'})
    })
})

// Route handler - Get all docs
app.get('/crud', (req, res) => {
    // res.json({msg:"Hi Yo!"})
    let arr = []
    db.collection('dummy')
    .find()
    .forEach(elem => {
        arr.push(elem)
    })
    .then(cb => {
        res.status(200).json(arr)
    })
    .catch(cb => {
        res.status(500).json({cb})
    })
})

// Route handler - get
// with ObjectId
app.get('/crud/:id', (req, res) => {
    if(ObjectId.isValid(req.params.id)){
        db.collection('dummy')
        .findOne({_id: new ObjectId(req.params.id)})
        .then(doc => {
            res.status(200).json(doc)
        })
        .catch(err => {
            res.status(500).json({catch:'Could not fetch document'})
        })
    }
    else{
        res.status(500).json({Error:'Could not fetch document'})
    }
})
// with name
// At a time only a single endpoint for a method was supported
// (Exception - get-> crud and crud/:id), as both these are differentiated during the API call in the client

// app.get('/crud/:name', (req, res) => {
//     // if(isValid(req.params.name)){
//         db.collection('dummy')
//         .findOne({Name: req.params.name})
//         .then(doc => {
//             if (doc) {
//                 res.status(200).json(doc);
//             } else {
//                 res.status(404).json({ Error: 'Document not found' });
//             }
//         })
//         .catch(err => {
//             res.status(500).json(err)
//         })
// })

//Route handler - Delete
//With ID
app.delete('/crud/:id', (req, res) => {
    if(ObjectId.isValid(req.params.id)){
        db.collection('dummy')
        .deleteOne({_id: new ObjectId(req.params.id)})
        .then(result => {
            res.status(200).json(result)
        })
        .catch(err => {
            res.status(404).json({err:'Could not find document'})
        })
    }
    else{
        res.status(500).json({Error:'Invalid ID'})
    }
})
//With name
// app.delete('/crud/:name', (req, res) => {
//         db.collection('dummy')
//         .deleteOne({Name: req.params.name})
//         .then(doc => {
//             if (doc) {
//                 res.status(200).json(doc);
//             } else {
//                 res.status(404).json({ Error: 'Document not found' });
//             }
//         })
//         .catch(err => {
//             res.status(500).json(err)
//         })
//     // }
// })