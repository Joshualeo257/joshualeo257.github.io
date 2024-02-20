<!DOCTYPE html>
<html>
<head>
    <title>Calling Java Servlet from JSP</title>
</head>
<body>
    <h2>Calling Java Servlet from JSP</h2>
    
    <form action="MyServlet" method="post">
        <label for="inputData">Enter data:</label>
        <input type="text" id="inputData" name="data" required>
        <br>
        <input type="submit" value="Submit">
    </form>
    
    <div>
        <p>Response from Servlet: ${responseFromServlet}</p>
    </div>
</body>
</html>