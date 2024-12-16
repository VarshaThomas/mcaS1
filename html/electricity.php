<?php
$units_consumed=$_GET['units_consumed'];
$tariff_per_unit=$GET['tariff_per_unit'];
$total_cost=$units_consumed*$tariff_per_unit;
echo"<h3>Electricity bill</h3>";
echo"units consumed:".$units_consumed."kwh<br>";
echo"tariff rate:$".number_format($tariff_per_unit,2)."perkwh<br>";
echo"total cost:$".number_format($total_cost,2)."<br>";
?>


