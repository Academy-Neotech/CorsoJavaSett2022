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

</head>

<body>
	<div class="clearfix">
		<div class="row">
			<div class="col-md-4">
				<h1>Provvaaaaaaaa MAX !!!!</h1>
				<div class="spinner-border" role="status">
					<span class="visually-hidden">Loading...</span>
				</div>
			</div>
           <div class="col-md-8">
			<button type="button" class="btn btn-primary" onmouseenter="scriviSullEnter();" onCLick="scriviSulClick();">Primo pulsante</button>

			<button type="button" class="btn btn-secondary" onmouseout="scriviSulBlur();">Secondary</button>
			<button type="button" id="pulsante_verde" class="btn btn-success">Success</button>
			<button type="button" id="pulsante_rosso" class="btn btn-danger">Danger</button>
			<button type="button" id="pulsante_giallo" class="btn btn-warning">Warning</button>
			<button type="button" class="btn btn-info">Info</button>
			<button type="button" class="btn btn-light">Light</button>
			<button type="button" id="pulsante_nero" class="btn btn-dark">Dark</button>
			</div>
		</div>
       <div class="row">
       <div class="col-xl-10">
		<div class="toast fade show" role="alert" aria-live="assertive"
			aria-atomic="true">
			<div class="toast-header">
				<svg class="bd-placeholder-img rounded me-2" width="20" height="20"
					xmlns="http://www.w3.org/2000/svg" aria-hidden="true"
					preserveAspectRatio="xMidYMid slice" focusable="false">
					<rect width="100%" height="100%" fill="#007aff"></rect></svg>

				<strong class="me-auto">Bootstrap</strong> <small>11 mins
					ago</small>
				<button type="button" class="btn-close" data-bs-dismiss="toast"
					aria-label="Close"></button>
			</div>
			<div class="toast-body">Hello, world! This is a toast message.
			</div>
		</div>
		</div>
		<div class="col-xl-2">
		<div class="alert alert-primary" role="alert">A simple primary
			alert—check it out!</div>
		</div>
		</div>
		
	<div class="row">
	<div class="col-md-6">
	    <form class="row g-3 needs-validation" novalidate>
  <div class="col-md-4">
    <label for="validationCustom01" class="form-label">First name</label>
    <input type="text" class="form-control" id="validationCustom01" value="Mark" required>
    <div class="valid-feedback">
      Looks good!
    </div>
  </div>
  <div class="col-md-4">
    <label for="validationCustom02" class="form-label">Last name</label>
    <input type="text" class="form-control" id="validationCustom02" value="Otto" required>
    <div class="valid-feedback">
      Looks good!
    </div>
  </div>
  
  <div class="col-md-4">
    <label for="validationCustomUsername" class="form-label">Username</label>
    <div class="input-group has-validation">
      <span class="input-group-text" id="inputGroupPrepend">@</span>
      <input type="text" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required>
      <div class="invalid-feedback">
        Please choose a username.
      </div>
    </div>
  </div>
  
  <div class="col-md-6">
    <label for="validationCustom03" class="form-label">City</label>
    <input type="text" class="form-control" id="validationCustom03" required>
    <div class="invalid-feedback">
      Please provide a valid city.
    </div>
  </div>
  <div class="col-md-3">
    <label for="validationCustom04" class="form-label">State</label>
    <select class="form-select" id="validationCustom04" required>
      <option selected disabled value="">Choose...</option>
      <option>...</option>
    </select>
    <div class="invalid-feedback">
      Please select a valid state.
    </div>
  </div>
  <div class="col-md-3">
    <label for="validationCustom05" class="form-label">Zip</label>
    <input type="text" class="form-control" id="validationCustom05" required>
    <div class="invalid-feedback">
      Please provide a valid zip.
    </div>
  </div>
  <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
      <label class="form-check-label" for="invalidCheck">
        Agree to terms and conditions
      </label>
      <div class="invalid-feedback">
        You must agree before submitting.
      </div>
    </div>
  </div>
  <div class="col-12">
    <button class="btn btn-primary" type="submit">Submit form</button>
  </div>
</form>	
	</div>
	<div class="col-md-6"></div>
	</div>	
	</div>
</body>


<script src="static/js/test.js"></script>

<!-- JAvascript puro -->
<script>
function scriviSulClick(){
	alert("click premuto!");
}

function scriviSullEnter(){
	alert("sono entrato!");
}

function scriviSulBlur(){
	alert("sono uscito!");
}
</script>

<!-- con JQuery -->
<script>
//#  seleziona l'elemnto che ha id:
//.  seleziona l'elemento che ha class:	
$("#pulsante_verde,#pulsante_nero").click(
  function() {
  $("#pulsante_rosso").hide();
 });


$( "#pulsante_giallo" ).click(
	function() {
	  $("#pulsante_rosso").show();
	  $("#validationCustom01").val("ciaooooo");
	  var testo=$("#validationCustom01").val();
	  alert(testo);
	});
</script>



<script>
//Example starter JavaScript for disabling form submissions if there are invalid fields
(() => {
  'use strict'

  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  const forms = document.querySelectorAll('.needs-validation')

  // Loop over them and prevent submission
  Array.from(forms).forEach(form => {
    form.addEventListener('submit', event => {
      if (!form.checkValidity()) {
        event.preventDefault()
        event.stopPropagation()
      }

      form.classList.add('was-validated')
    }, false)
  })
})()

</script>
</html>