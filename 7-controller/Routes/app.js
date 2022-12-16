const http=require('http');
const express= require('express');
const app=express();
//Neu khac nhau giua var , let , const
 const port = 8080;

 const empRouter= require('./Routes/empRoute')
 http.createServer(app).listen(port,()=>{
    console.log('Sever is running at http://localhost:${post}');
 });
//
app.get('/',(req,res)=>{
    res.end('welcome back home');
})
//routes
//
app.use('/emp',empRouter);

