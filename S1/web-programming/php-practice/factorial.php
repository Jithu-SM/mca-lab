<html>
<body>
	<form method="post">
		Enter Number:<input type="number" name="num">
		<input type="submit" value="Calculate Factorial">
	</form>
	<?php
		if($_SERVER["REQUEST_METHOD"]=="POST"){
			$num=$_POST["num"];
			$factorial=1;
			for($i=1;$i<=$num;$i++){
				$factorial*=$i;
			}
			echo "Factorial of $num is $factorial";
		}
	?>
</body>
</html>
