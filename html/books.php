<?php
$host="localhost";
$username="root";
$password="";
$database="Book";
$conn=new mysqli($host,$username,$password,$database);
if($conn->connect_error){
 die("Connection failed:".$conn->connect_error);
}
$sql="SELECT id,title,author,price FROM books";
$result=$conn->query($sql);
if($result->num_rows>0){
 echo"<table border='1'cellpadding='10'>";
 echo"<tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th></tr>";
 while($row=$result->fetch_assoc()){
 echo"<tr><td>".$row['id']."</td>
      <td>".$row['title']."</td>
      <td>".$row['author']."</td>
      <td>".$row['price']."</td>
      </tr>";
 }
 echo"</table>";
}else{
 echo"No items found.";
}
$conn->close();
?>