<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <title>Secret Code</title>
</head>
<body>

<div class="container mx-auto m-5 p-5 text-center d-block">
    <p class="text-danger fs-3">
        <c:out value="${error}" />
    </p>

    <form method="POST" action="/login">
        <label class="fs-2 d-block p-4 m-2">What is the code?<input
                type="password" name="password"
                class="container col-5 text-center d-block "></label>
        <button>Try Code</button>
    </form>
</div>

</body>
</html>

