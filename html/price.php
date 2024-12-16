<?php
$price_per_item=20.5;
$quantity=3;
$total_cost=$price_per_item*$quantity;
echo"Price per item:$".number_format($price_per_item,2)."<br>";
echo"Quantity:".$quantity."<br>";
echo"Total cost:$".number_format($total_cost,2);
?>