<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Results</title>
    <style>
        .centered-anchor {
            display: block;
            text-align: center;
        }
    </style>
    <style>
        body {
            background-image: url("resbg.jpg");
            background-size: cover; /* Optional: Cover the entire background */
            /* Other background properties can be added as needed */
        }
    </style>
</head>
<body>

    <h1 style="font-size: 45px";>Search Results</h1>

   
    <%-- Retrieve the search query from the request --%>
    <% String searchQuery = request.getParameter("query"); %>

    <%
    // Display the result if it's available in the request attribute
    List<String> result = (List<String>) request.getAttribute("result");
    List<String> result2 = (List<String>) request.getAttribute("result2");
    int i = 0;

%>
    <ul>
        <% while(i != result.size()){ %>
            <li><a href="<%= result2.get(i) %>" style="font-size: 25px;"><%= result.get(i) %></a></li>
            <% i = i + 1; %>
        <% } %>
    </ul>
</body>
</html>