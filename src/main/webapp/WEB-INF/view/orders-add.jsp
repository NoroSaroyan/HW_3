<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add new order</title>
    <meta charset="UTF-8">
</head>

<body>

<form:form modelAttribute="order" method="post">
    Введите айди заказа: <form:input path="id"/>
    <br/>
    <p>Введите ID продуктов через пробел</p>
    Список продуктов: <form:input path="productsFromForm"/>
    <br/>
    <input type="submit" value="Save">
</form:form>

<br/>
<br/>
<h2>Доступные к добавлению продукты</h2>
<ul>
    <c:forEach items="${products}" var="product">
        <li>
            <p>ID: <c:out value="${product.id}"/></p>
            <p>NAME: <c:out value="${product.name}"/></p>
            <p>PRICE: <c:out value="${product.price}"/></p>
        </li>
    </c:forEach>
</ul>


</body>
</html>