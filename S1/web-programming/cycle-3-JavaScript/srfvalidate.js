function validateForm(){
	let isValid=true;
	document.getElementById("fnameError").innerText="";
	document.getElementById("lnameError").innerText="";
	document.getElementById("emailError").innerText="";
	document.getElementById("mobileError").innerText="";
	
	let namePattern=/^[a-zA-Z\s]+$/;
	let fname=document.getElementById("fname").value;
	if(fname===""){
		document.getElementById("fnameError").innerText="First Name is required.";
		isValid=false;
	}else if(!namePattern.test(fname)){
		document.getElementById("fnameError").innerText="First name must contain only letters and spaces.";
		isValid=false;
	}
	let lname=document.getElementById("lname").value;
	if(lname===""){
		document.getElementById("lnameError").innerText="Last Name is required.";
		isValid=false;
	}else if(!namePattern.test(lname)){
		document.getElementById("lnameError").innerText="Last name must contain only letters and spaces.";
		isValid=false;
	}
	
	let emailPattern=/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
	let email=document.getElementById("email").value;
	if(email===""){
		document.getElementById("emailError").innerText="Email is required.";
		isValid=false;
	}else if(!emailPattern.test(email)){
		document.getElementById("emailError").innerText="Enter a valid email address.";
		isValid=false;
	}
	
	let mobilePattern=/^[0-9]{10}$/;
	let mobile=document.getElementById("mobile").value;
	if(mobile===""){
		document.getElementById("mobileError").innerText="Mobile Number is required.";
		isValid=false;
	}else if(!mobilePattern.test(mobile)){
		document.getElementById("mobileError").innerText="Mobile Number must be 10 digits.";
		isValid=false;
	}
	return isValid;
}
