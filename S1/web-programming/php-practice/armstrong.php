<html>
<body>
	<form method="post">
		Enter Number:<input type="number" name="num">
		<input type="submit" value="Check Armstrong">
	</form>
	<?php
		if($_SERVER["REQUEST_METHOD"]=="POST"){
			$num=$_POST["num"];
			$sum=0;
			$temp=$num;
			$numdig=strlen((string)$num);
			while($temp!=0){
				$dig=$temp%10;
				$sum+=pow($dig,$numdig);
				$temp=intval($temp/10);
			}
			if($sum==$num){
				echo "$num is an Armstrong number";
			}else{
				echo "$num is not an Armstrong number";
			}
		}
	?>
</body>
<html>
