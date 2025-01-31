<html>
<body>
	<form method="post">
		Enter First Number:<input type="number" name="num1">
		Enter Second Number:<input type="number" name="num2">
		<input type="submit" value="Add">
	</form>
	<?php
		if($_SERVER["REQUEST_METHOD"]=="POST"){
			$num1=$_POST["num1"];
			$num2=$_POST["num2"];
			$sum=$num1+$num2;
			echo "Sum is $sum";
		}
	?>
</body>
<html>
