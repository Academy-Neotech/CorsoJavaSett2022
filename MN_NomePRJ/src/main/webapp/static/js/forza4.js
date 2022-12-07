var ultimaCellaPienaC1=5;
var ultimaCellaPienaC2=5;
var ultimaCellaPienaC3=5;
var ultimaCellaPienaC4=5;


$(document).ready(function() {



$("#bg1").click(
function (){
	
    ultimaCellaPienaC1=ultimaCellaPienaC1-1;
    
	$("#c"+ultimaCellaPienaC1+"1").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC1+"1").addClass("cellaGialla");
}	
);


$("#br1").click(
function (){
	ultimaCellaPienaC1=ultimaCellaPienaC1-1;
    
	$("#c"+ultimaCellaPienaC1+"1").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC1+"1").addClass("cellaRossa");
	controllaVincita(1,ultimaCellaPienaC1);
}	
);


$("#bg2").click(
function (){
	
    ultimaCellaPienaC2=ultimaCellaPienaC2-1;
    
	$("#c"+ultimaCellaPienaC2+"2").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC2+"2").addClass("cellaGialla");
}	
);


$("#br2").click(
function (){
	ultimaCellaPienaC2=ultimaCellaPienaC2-1;
    
	$("#c"+ultimaCellaPienaC2+"2").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC2+"2").addClass("cellaRossa");
	controllaVincita(2,ultimaCellaPienaC2);
}	
);



$("#bg3").click(
function (){
	
    ultimaCellaPienaC3=ultimaCellaPienaC3-1;
    
	$("#c"+ultimaCellaPienaC3+"3").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC3+"3").addClass("cellaGialla");

}
);


$("#br3").click(
function (){
	ultimaCellaPienaC3=ultimaCellaPienaC3-1;
    
	$("#c"+ultimaCellaPienaC3+"3").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC3+"3").addClass("cellaRossa");
	controllaVincita(3,ultimaCellaPienaC3);
}	
);


$("#bg4").click(
function (){
	
    ultimaCellaPienaC4=ultimaCellaPienaC4-1;
    
	$("#c"+ultimaCellaPienaC4+"4").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC4+"4").addClass("cellaGialla");
}	
);


$("#br4").click(
function (){
	ultimaCellaPienaC4=ultimaCellaPienaC4-1;
    
	$("#c"+ultimaCellaPienaC4+"4").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC4+"4").addClass("cellaRossa");
	controllaVincita(4,ultimaCellaPienaC4);
}	
);


});


function controllaVincita(x,y){

//Verifica per colonna
var contacelleRosse=0;
for(var i=4;i>0;i--){
	if ($("#c"+i+x).hasClass("cellaRossa")) contacelleRosse++;
	if(contacelleRosse==4) alert("hai vinto");
}



//Verifica per riga
var contacelleRosse=0;
for(var i=0;i<5;i++){
	if ($("#c"+x+i).hasClass("cellaRossa")) contacelleRosse++;
	if(contacelleRosse==4) alert("hai vinto");
}

	
}




