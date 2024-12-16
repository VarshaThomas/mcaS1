<?php
$host="localhost";
$username="root";
$password="";
$database="superMarket8999";
$conn=new mysqli($host,$username,$password,$database);
if($conn->connect_error){
   die("Connection failed".$conn->connect_error);
}
echo"connected successfully to the supermarket database.";
$conn->close();
?>