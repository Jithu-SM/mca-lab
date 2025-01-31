<html>
<body>
	<form method="post">
		Enter Email: <input type="email" name="email">
		<input type="submit" value="Extract Username">
	</form>
	<?php
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			$email = $_POST["email"];
			$username = strstr($email, '@', true);
			echo "Username: $username";
		}
	?>
</body>
</html>
