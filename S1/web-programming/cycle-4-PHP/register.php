<?php
session_start();

require 'db.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $fname = $_POST['fname'];
    $lname = $_POST['lname'];
    $dob = $_POST['year'] . '-' . $_POST['month'] . '-' . $_POST['day'];
    $email = $_POST['email'];
    $mobile = $_POST['mobile'];
    $gender = $_POST['gender'];
    $username = $_POST['username'];
    $password = $_POST['password'];

    $sql = "INSERT INTO student (fname, lname, dob, email, mobile, gender, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param('ssssssss', $fname, $lname, $dob, $email, $mobile, $gender, $username, $password);

    if ($stmt->execute()) {
        echo "User registered successfully!";
    } else {
        echo "Error: " . $stmt->error;
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Register User</title>
</head>
<body>
    <h2>STUDENT REGISTRATION FORM</h2>
    <form method="POST" action="">
        <label for="fname">First Name:</label>
        <input type="text" name="fname" maxlength="30" required><br><br>

        <label for="lname">Last Name:</label>
        <input type="text" name="lname" maxlength="30" required><br><br>

        <label>Date of Birth:</label>
        <select name="day" required>
            <option value="">Day</option>
            <?php for ($i = 1; $i <= 31; $i++) echo "<option value='$i'>$i</option>"; ?>
        </select>
        <select name="month" required>
            <option value="">Month</option>
            <?php for ($i = 1; $i <= 12; $i++) echo "<option value='$i'>$i</option>"; ?>
        </select>
        <select name="year" required>
            <option value="">Year</option>
            <?php for ($i = 1980; $i <= 2025; $i++) echo "<option value='$i'>$i</option>"; ?>
        </select><br><br>

        <label>Email:</label>
        <input type="email" name="email" required><br><br>

        <label>Mobile Number:</label>
        <input type="text" name="mobile" maxlength="10" required><br><br>

        <label>Gender:</label>
        <label>Male</label><input type="radio" name="gender" value="Male" required>
        <label>Female</label><input type="radio" name="gender" value="Female" required><br><br>

        <label for="username">Username:</label>
        <input type="text" name="username" maxlength="50" required><br><br>

        <label for="password">Password:</label>
        <input type="password" name="password" required><br><br>

        <button type="submit">Register</button>
        
        <br><a href="studentlogin.php">Login Cookie</a>
        <br><a href="studentloginsession.php">Login Session</a>
    </form>
</body>
</html>

