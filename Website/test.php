<?php
$dbhost = "dmysql01.westbahr.com";
$dbuser = "system_dev";
$dbpassword = '98dSSCX9ryYLUwv8';
$db= 'system_dev';

mysql_connect($dbhost,$dbuser,$dbpassword);
mysql_select_db($db);

if (isset($_POST['username'] )) {
	$username=$_POST['username'];
	$password=$_POST['password'];
	$sql ="Select * FROM Company WHERE username='".$username."'AND password = '".$password."'LIMIT 1";
	$result = mysql_query($sql);
	if ( mysql_num_rows ($result)==1){
	echo "you have succesfully logged in";	
	exit();	
	
	}
	else {
		
	echo "Invalid input";
	exit();	
		
	}
	
}

?>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<form method="post" action ="test.php" > 

Username: <input type="text" name ="username" /> <br/><br/>
Password: <input type="password" name ="password" /> <br/><br/>
<input type="submit" name ="Submit" value ="Log in" />

</form>
</body>
</html>