<html>
<body>
	<form method="post">
		Enter Base:<input type="number" name="base">
		Enter Height:<input type="number" name="height">
		<input type="submit" value="Calculate Area">
	</form>
	<?php
		if($_SERVER["REQUEST_METHOD"]=="POST"){
			$base=$_POST["base"];
			$height=$_POST["height"];
			$area=0.5*$base*$height;
			echo "Area of the triangle is $area";
		}
	?>
</body>
<html>
