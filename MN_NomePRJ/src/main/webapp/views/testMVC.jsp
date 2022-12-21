<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- JQuery -->
<script src="https://code.jquery.com/jquery-3.6.1.min.js" type="text/javascript"></script>

<!-- Boostrap -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>


<!-- font awesome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
</head>

<body>

<h1>Bravo sei Arrivato alla JSP!!!</h1>
<h1>${testodiBenvenuto}</h1>
<c:for Automobile:${listaAutomobili}>
    "<tr><td>auto.targa</td><td>auto.costruttore</td></tr>"
</c:for>

<form:form action="mvcPost" modelAttribute="ciccio" method="POST">

<form:input  id="cilindrata"  path="cilindrata" cssClass="form-control"/>  
<form:input  id="costruttore" path="costruttore" cssClass="form-control"/>  
<form:input  id="carburante"  path="carburante" cssClass="form-control"/>  
<form:input  id="kmPercorsi"  path="kmPercorsi" cssClass="form-control"/>    
<form:select id="immagine"  path="immagine" cssClass="form-control">
    <option value="BMW">BMW</option>
    <option value="Ferrari">Ferrari</option>
    <option value="Porche">Porche</option>
</form:select>

<button id="sottomettiForm">invia</button>
</form:form>
<img src="${immagine}"/>
${testoHTML}
</body>
</html>




