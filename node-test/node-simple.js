//just a simple test with routing
//Remember: npm install express --save
 
const express = require('express')
const app = express()
const port = 8080

var cluster = require('cluster');  
var numCPUs = require('os').cpus().length;

if (cluster.isMaster) {  
  for (var i = 0; i < (numCPUs-1); i++) {
  // Create a worker
  cluster.fork();
  }
} else {

  app.get('/SimpleHttp/speedtest', (request, response) => {
    response.send('NodeJS. Time on the server is ' + getDateTime() )
  })
  
  app.listen(port, (err) => {
    if (err) {
      return console.log('ERROR:', err)
    }
  
    console.log(`Node.js is listening on ${port}`)
  })
}

function getDateTime() {

    var date = new Date();

    var hour = date.getHours();
    hour = (hour < 10 ? "0" : "") + hour;

    var min  = date.getMinutes();
    min = (min < 10 ? "0" : "") + min;

    var sec  = date.getSeconds();
    sec = (sec < 10 ? "0" : "") + sec;

    var msec  = date.getMilliseconds();
    msec = (msec < 10 ? "00" : (msec < 100 ? "0" : "")) + msec;

    var year = date.getFullYear();

    var month = date.getMonth() + 1;
    month = (month < 10 ? "0" : "") + month;

    var day  = date.getDate();
    day = (day < 10 ? "0" : "") + day;

    return year + ":" + month + ":" + day + ":" + hour + ":" + min + ":" + sec + ":" + msec;
}
