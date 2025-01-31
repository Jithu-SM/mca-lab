<?php
session_start();

require 'db.php';

/*if (!isset($_SESSON['user_id'])) {
    header("Location: studentloginsession.php");
    exit;
}*/

$user_id = $_SESSION['user_id'];
$sql = "SELECT * FROM student WHERE id = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param('i', $user_id);
$stmt->execute();
$result = $stmt->get_result();

if ($result->num_rows > 0) {
    $user = $result->fetch_assoc();
} else {
    header("Location: studentloginsession.php");
    echo "No student found.";
    exit;
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>User Information</title>
</head>
<body>
    <h2>Welcome, <?php echo htmlspecialchars($user['fname'] . ' ' . $user['lname']); ?>!</h2>
    <h3>Your Information</h3>
    <p><strong>First Name:</strong> <?php echo htmlspecialchars($user['fname']); ?></p>
    <p><strong>Last Name:</strong> <?php echo htmlspecialchars($user['lname']); ?></p>
    <p><strong>Date of Birth:</strong> <?php echo htmlspecialchars($user['dob']); ?></p>
    <p><strong>Email:</strong> <?php echo htmlspecialchars($user['email']); ?></p>
    <p><strong>Mobile:</strong> <?php echo htmlspecialchars($user['mobile']); ?></p>
    <p><strong>Gender:</strong> <?php echo htmlspecialchars($user['gender']); ?></p>
</body>
</html>
