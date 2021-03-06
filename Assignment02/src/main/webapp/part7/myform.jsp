<%--
  Created by IntelliJ IDEA.
  User: declan
  Date: 2/9/2021
  Time: 1:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../lib/css/form.css">
</head>
<body>

<div class="container">
    <form action="../part7.jsp" method="post">

        <label for="fname">Email</label>
        <input type="text" id="fname" name="email" placeholder="Your email">

        <label for="lpwd">Password</label>
        <input type="password" id="lpwd" name="password" placeholder="Your password">

        <label for="lcpwd">Confirm Password</label>
        <input type="password" id="lcpwd" name="confirm_password" placeholder="Confirm your password">

        <label for="filebox">Upload Your Picture</label>
        <div id="filebox" class="container2">
            <input type="file" id="myFile" name="filename">
        </div>


        <label for="gender">Gender</label>
        <div id="gender" class="container2">

        <label class="lable2">
            <input type="radio" name="gender" value="male" checked="checked">
            Male
            <span class="checkmark"></span>
        </label>


        <label class="lable2">
            <input type="radio" value="female" name="gender" >
            Female
            <span class="checkmark"></span>
        </label>
        </div>
        <label for="country">Country</label>
        <select id="country" name="country">
            <option value="United States">United States</option>
            <option value="China">China</option>
            <option value="Canada">Canada</option>
        </select>

        <label for="hobby">Hobby</label>
        <div id="hobby" class="container2">
        <label class="lable2">
            <input type="checkbox" name="cricket"  checked="checked">
            Cricket
            <span class="checkmark"></span>
        </label>
        <label class="lable2">
            <input type="checkbox" name="football" >
            Football
            <span class="checkmark"></span>
        </label>
        </div>

        <label for="Address">Address</label>
        <textarea id="Address" name="address" placeholder="Write your address." style="height:200px"></textarea>

        <input type="submit" value="Submit">

    </form>
</div>

</body>
</html>
