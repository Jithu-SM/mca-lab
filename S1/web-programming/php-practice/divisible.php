<html>
<body>
	<form method="post">
		Enter Number:<input type="number" name="num">
		Enter Divisor:<input type="number" name="div">
		<input type="submit" value="Check Divisibility">
	</form>
	<?php
		if($_SERVER["REQUEST_METHOD"]=="POST"){
			$num=$_POST["num"];
			$div=$_POST["div"];
			if($num%$div==0){
				echo "$num is divisible by $div";
			}else{
				echo "$num is not divisible by $div";
			}
		}
	?>
</body>
<html>
