
<html>
	<head>
		<title>Student Details</title>
	</head>
	<body>
		<form method="post">
		Enter Id:<input type="text" name="id"><br>
		Enter Name:<input type="text" name="name"><br>
		Enter Department:<input type="text" name="dept"><br>
		<input type="submit" value="Submit">
		</form>
<?php
	if($_SERVER["REQUEST_METHOD"]=="POST"){
		$id=$_POST["id"];
		$name=$_POST["name"];
		$dept=$_POST["dept"];
		
		
	}
	echo("<h3>STUDENT DETAILS</h3>
		<table>
		<tr><td>
			ID:</td><td>$id</td></tr>
		<tr><td>
			NAME:</td><td>$name</td></tr>
		<tr><td>
			DEPARTMENT:</td><td>$dept</td></tr>
		</table>
		")
?>
			
	</body>
</html>
