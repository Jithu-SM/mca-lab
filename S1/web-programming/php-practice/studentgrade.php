<html>
<body>
	<form method="post">
		Enter marks: <input type="number" name="marks">
		<input type="submit" value="Check Grade">
	</form>
	<?php
		if($_SERVER["REQUEST_METHOD"]=="POST"){
			$marks=$_POST["marks"];
			if($marks>=60){
				echo "First Division";
			}elseif($marks>=45){
				echo "Second Division";
			}elseif($marks>=33){
				echo "Third Division";
			}else{
				echo "Failed";
			}
		}
	?>
</body>
</html>	
