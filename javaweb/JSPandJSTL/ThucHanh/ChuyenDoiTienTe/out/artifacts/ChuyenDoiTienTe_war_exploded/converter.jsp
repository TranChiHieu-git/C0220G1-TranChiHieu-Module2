<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
    double rate = Double.parseDouble(request.getParameter("rate"));
    double usd = Double.parseDouble(request.getParameter("usd"));
    double vnd = (rate * usd);
%>
<h1>Rate: <%=rate%></h1>
<h1>USD: <%=usd%></h1>
<div>VND: <%=vnd%></div>
</body>
</html>
