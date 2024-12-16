<?php
$host="localhost";
$username="root";
$password="";
$database="studentdb";
$conn=new mysqli($host,$username,$password,$database);
if($conn->connect_error){
 die("connection failed:".$conn->connect_error);
}
$id=$_POST['id'];
$name=$_POST['name'];
$age=$_POST['age'];
$grade=$_POST['grade'];
$sql="UPDATE students SET name=?,age=?,grade=? WHERE id=?";
$stmt=$conn->prepare($sql);
$stmt->bind_param("sisi",$name,$age,$grade,$id);
if($stmt->execute()){
 echo"student record updated successfully.";
}else{
 echo"error updating record:".$conn->error;
}
$stmt->close();
$conn->close();
?>


