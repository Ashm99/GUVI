const{MongoClient} = require('mongodb') //Including MongoClient from the node.js's mongodb module, for creating connection

let dbConnection;
//Creating export methods (custom made) so that they can be imported in other modules
module.exports = {
    // Establishing a connection
    connectToDb:(cb) => {
        console.log("Connecting to database...")
        MongoClient.connect('mongodb://localhost:27017/admin')
        .then((client) => {
            dbConnection = client.db();
            // console.log(dbConnection)
            console.log("Successfully established connection with database!")
            return cb()
        })
        .catch((err) => {
            console.log("Error occurred during connection!!\n" + err);
            return cb(err);
        })
    },
    // Assigning the database connection to a property
    getDb: () => dbConnection
}