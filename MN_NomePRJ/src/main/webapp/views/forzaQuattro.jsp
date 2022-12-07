<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<script src="static/js/forza4.js"></script>
<style>
table, th, td {
  border: 1px solid black;
  width:30px;
  height:30px;
}

.cellaGialla{
   background-color:yellow;
}

.cellaRossa{
   background-color:red;
}

</style>
</head>


<body>
<p>ForzaQuattro!</p>
<div class="clearfix">
  <div class="row">
   <div class="col-md-4"></div>
   
   <div class="col-md-4">
      <table>
      <tr><td id="c11"></td><td id="c12"></td><td id="c13"></td><td id="c14"></td</tr>
      <tr><td id="c21"></td><td id="c22"></td><td id="c23"></td><td id="c24"></td</tr>
      <tr><td id="c31"></td><td id="c32"></td><td id="c33"></td><td id="c34"></td</tr>
      <tr><td id="c41"></td><td id="c42"></td><td id="c43"></td><td id="c44"></td</tr>

      <tr> <td><button  id="bg1" class="btn btn-warning"/><button  id="br1" class="btn btn-danger"/></td>
           <td><button id="bg2" class="btn btn-warning"/><button id="br2" class="btn btn-danger"/></td>
           <td><button id="bg3" class="btn btn-warning"/><button id="br3" class="btn btn-danger"/></td>
           <td><button id="bg4" class="btn btn-warning"/><button id="br4" class="btn btn-danger"/></td>
      </tr>
      </table>
   </div>
   
   <div class="col-md-4"></div> 
  
  </div>

</div>


</body>
</html>