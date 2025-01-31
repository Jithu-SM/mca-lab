<html>
<body>
	<form method="post">
		Enter Number:<input type="number" name="num">
		<input type="submit" value="Check">
	</form>
	<?php
		if($_SERVER["REQUEST_METHOD"]=="POST"){
			$num=$_POST["num"];
			if($num>0){
				echo "Positive";
			}elseif($num<0){
				echo "Negative";
			}else{
				echo "Zero";
			}
		}
	?>
</body>
<html>
