<html>
<body>
	<form method="post">
		Enter numbers separated by commas: <input type="text" name="numbers">
		<input type="submit" value="Sort Array">
	</form>
	<?php
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			$input = $_POST["numbers"];
			$array = explode(",", $input);
			$array = array_map('trim', $array);
			$array = array_map('intval', $array);
			rsort($array);
			echo "Array in reverse order: " . implode(", ", $array);
		}
	?>
</body>
</html>
