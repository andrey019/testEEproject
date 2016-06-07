
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Research</title>
</head>
<body>
    <form action="/quest" method="post">
        what is your name?
        <br> <input type="text" name="name"/> <br>
        <br> what is your surname?
        <br> <input type="text" name="surname"/> <br>
        <br> what is your age?
        <br> <input type="number" name="age"/> <br>
        <br> do you like your experience so far at the java courses?
        <br> yes <input type="radio" name="courses" value="yes" />
             no <input type="radio" name="courses" value="no" /> <br>
        <br> do you attend english classes?
        <br> yes <input type="radio" name="english" value="yes" />
             no <input type="radio" name="english" value="no" /> <br>
        <br> <input type="submit" value="submit" />
    </form>
</body>
</html>
