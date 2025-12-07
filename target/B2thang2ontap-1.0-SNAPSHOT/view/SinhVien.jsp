<%--
  Created by IntelliJ IDEA.
  User: Binh
  Date: 12/2/2025
  Time: 8:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post">
    <label>ma sinh vien</label>
    <input type="text" name="masv" value="${detail.masv}"><br>
    <label>ho ten</label>
    <input type="text" name="hoten" value="${detail.hoten}"><br>
    <label>que</label>
    <input type="text" name="que" value="${detail.que}"><br>
    <label>nganh</label>
    <input type="text" name="nganh" value="${detail.nganh}"><br>
    <label>gioitinh</label>
    <input type="radio" name="gt" value="true"${detail.isGioitinh()? "checked" : ""}>Nam
    <input type="radio" name="gt" value="false"${detail.isGioitinh()==false? "checked" : ""}>Nu<br>
    <label>namsinh</label>
    <input type="text" name="namsinh" value="${detail.namsinh}"><br>



</form>

    <table style="border-collapse: collapse" border="1">
       <thead>
            <td>stt</td>
            <td>id</td>
            <td>masv</td>
            <td>hoten</td>
            <td>quequan</td>
            <td>nganh</td>
            <td>gioitinh</td>
            <td>namsinh</td>
            <td>Action</td>

        <tbody>
    <c:forEach items="${lstsv}" var="lst" varStatus="i">
        <tr>
            <td>${i.count}</td>
            <td>${lst.id}</td>
            <td>${lst.masv}</td>
            <td>${lst.hoten}</td>
            <td>${lst.que}</td>
            <td>${lst.nganh}</td>
            <td>${lst.isGioitinh()? "Nam" : "Nu"}</td>
            <td>${lst.namsinh}</td>
            <td><a href="/detail?id=${lst.id}"><button>detail</button></a></td>
            <td><a href="/delete?id=${lst.id}"><button>delete</button></a></td>
        </tr>


    </c:forEach>

    <a href="/read">hay bam vao day</a>
        </tbody>
        </thead>
    </table>
</body>
</html>
