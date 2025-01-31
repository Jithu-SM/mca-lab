<html>
<body>
	<form method="post">
		Enter Number N: <input type="number" name="number">
		<input type="submit" value="Calculate Sum">
	</form>
	<?php
		function isPrime($num) {
			if ($num <= 1) return false;
			for ($i = 2; $i <= sqrt($num); $i++) {
				if ($num % $i == 0) return false;
			}
			return true;
		}
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			$number = $_POST["number"];
			$sum = 0;	
			for ($i = 2; $i < $number; $i++) {
				if (isPrime($i)) {
					$sum += $i;
				}
			}
			echo "The sum of prime numbers less than $number is $sum";
		}
	?>
</body>
</html>
