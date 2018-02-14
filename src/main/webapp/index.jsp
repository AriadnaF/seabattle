<%--
  Created by IntelliJ IDEA.
  User: JavaCourses1
  Date: 25.01.2018.
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="main.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway:400,800,900" rel="stylesheet">
    <title>Welcome - Sea Battle</title>
    <style>
        .box {
            background-color: black;
            opacity: 0.5;
            width: 500px;
            height: 300px;
        }

        .container {
            background: url('img/Days-End-2400px.png') center;
            background-size: cover;
        }
    </style>
</head>
<body>

<div class="container w3-display-container w3-animate-opacity w3-text-white">

    <div class="box w3-display-middle w3-round-large"> </div>
    <div class="w3-display-middle w3-center">
        <h1 class="w3-xlarge w3-animate-top w3-center w3-text-brown">WELCOME TO</h1>
        <h1 class="w3-jumbo w3-animate-top w3-center w3-text-orange">SEA BATTLE</h1>
        <a class="w3-button w3-large w3-brown w3-animate-top w3-round" href="register">Start the game</a>
    </div>
    <div class="w3-display-bottomleft w3-black" style="width:250px;height:50px;opacity: 0.5"> </div>
    <div class="w3-display-bottomleft w3-padding-large">
        Powered by <a href="https://www.facebook.com/developithecus/" target="_blank">developithecus</a>
    </div>
</div>

</body>
</html>
