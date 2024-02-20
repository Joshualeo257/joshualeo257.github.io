<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Search Engine</title>
    <style>
        .centered-heading {
            display: block;
            text-align: center;
        }
    </style>
    <style>
        body {
            background-image: url("wallpaper.jpg");
            background-size: cover; /* Optional: Cover the entire background */
            /* Other background properties can be added as needed */
        }
    </style>
</head>
<body>

    <h1 style="font-size: 50px;"class="centered-heading" >Simple Search Engine</h1>
    
<form style="font-size: 20px;" class="centered-heading" action="SearchServlet" method="post">
     <input style="font-size: 20px;" type="text" name="inputValue">
    <input style="font-size: 20px;" type="submit" value="Submit">
</form>

</body>
</html> 