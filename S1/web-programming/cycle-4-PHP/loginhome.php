<?php
	session_start();
	if(!isset($_SESSION['user_id'])){
		header("Location:login.php");
		exit();
	}
?>
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h3>Welcome <?=$_SESSION['username']?>
	</body>
</html>
