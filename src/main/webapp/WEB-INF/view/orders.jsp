<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Orders</title>
</head>

<body>
<h1>Orders</h1>
<ul>
    <c:forEach items="${orders}" var="order">
        <li>
            <p>ID:               <c:out value="${order.id}"/></p>
            <p>Дата:             <c:out value="${order.date}"/></p>
            <p>Стоимость заказа: <c:out value="${order.cost}"/></p>
            <p>Список продуктов в заказе:<br/> <c:out value="${order.productsList}"/></p>
        </li>
    </c:forEach>
</ul>
</body>
</html>
