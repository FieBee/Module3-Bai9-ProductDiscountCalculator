<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ứng dụng Product Discount Calculator</title>

</head>
<body>
<div>
    <form action="/product" method = "get" >
        <H3>Nhập mô tả sản phẩm: </H3>
        <input type="text" name="description" placeholder = "Product Description">
        <br>
        <input type="text" name ="price" placeholder = "List Price">
        <br>
        <input type="text" name ="percent" placeholder = "Discount Percent">
        <br>
        <input type="submit" value="Discount Percent" >


    </form>
</div>

</body>
</html>