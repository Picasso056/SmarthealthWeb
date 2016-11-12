<%@page import="dataObject.smarthealthDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
 input#mail::-webkit-input-placeholder{
            
                color:white;
            }
                input#r{

                border: solid 1px #ffa62f;
                width: 400px;
                height:28px;
                
                padding:6px;
                margin-left: 300px; 
                margin-top:5px;
                font-family: Tahoma, Geneva, sans-serif;
                color:grey;
                border-radius:4px;
            }
            form#f1{
            margin-top:-62px;
            
            }
            input#user{

                border: solid 1px #ffa62f;
                width: 400px;
                height:28px;
                
                padding:6px;
                margin-left: 300px; 
                margin-top:5px;
                font-family: Tahoma, Geneva, sans-serif;
                color:grey;
                border-radius:4px;
            }
            input#r1{

                border: solid 1px #ffa62f;
                width: 400px;
                height:28px;
                
                padding:6px;  
                margin-left: 300px;
                margin-top:25px;
                font-family: Tahoma, Geneva, sans-serif;
                color:grey;
                border-radius:4px;
            }
            div#q{
            margin-left:300px;
            }
               input#register
            {	
                Background:#38acec;
                padding:2px;
                color:white;
                width:200px;
                transition:1s;
                margin-left:203px; 
                margin-top:10px; 
               
            }
             input#loginbutton
            {	
                Background:#38acec;
                padding:3px;
                color:white;
                width:100px;
                height:28px;
                 transition:1s; 
                margin-left:1203px;  
                
                 margin-top:-42px;
               
            }
            .button,.button1{
               background-color:#38acec;
              left:1500px;
                top:11px;
                width:70px;
                height:30px;
            	
                position: absolute; 
                left:1000px;
                top:9px;
                border-radius:4px;
                display:inline-block;
                 color:#e8cd15;
                font-family:Helvetica;
                font-size:20px;
                font-weight:700;
                padding:6px 24px;
                text-decoration:none;
               margin-left:150px;
                text-align:center;
                line-height:30px;
            }
            
input#mail{

                border: solid 1px #ffa62f;
                width: 400px;
                height:28px;
                padding:6px;
                margin-left: 300px; 
                margin-top:5px;
                font-family: Tahoma, Geneva, sans-serif;
                color:grey;
                border-radius:4px;
            }
         
            input#password{
            border: solid 1px #ffa62f;
               
                height:28px;
                padding:6px;
                
             
                font-family: Tahoma, Geneva, sans-serif;
                color:grey;
                border-radius:4px;
                margin-left:20px;
            
            }
               input#login{
            border: solid 1px #ffa62f;
                
                height:28px;
                padding:6px;
       
           
                font-family: Tahoma, Geneva, sans-serif;
                color:grey;
                border-radius:4px;
            margin-left:800px; 
            
            }
            div#form{
             background-color: #307493;
             width:750px; 
             margin-left:300px; 
             z-index: 1;
            }
            div#header{
                position:absolute;
                top:0px;
                left:0px;
                right:0px;
           
                background-color: #307493;
               
                height:60px;
                color : white;
                text-align:left;
                line-height:60px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
            }
            div#username{
               position:absolute;
                top:102px;
                left:350px;
                right:750px;
               background-color: #fd5d54;
                height:40px;
                 color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            } 
           
            div#password{
               position:absolute;
                top:169px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                 color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#password1{
               position:absolute;
                top:234px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                 color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#pemail{
             position:absolute;
                top:299px;
                left:350px;
                right:750px;
               background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
                visibilty:hidden;
            }
             div#semail{
             position:absolute;
                top:364px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#fname{
              position:absolute;
                top:429px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#lname{
               position:absolute;
                top:494px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#aboutme{
              position:absolute;
                top:559px;
                left:350px;
                right:750px;
                background-color: #fd5d54; 
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#url1{
               position:absolute;
                top:624px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#url2{
              position:absolute;
                top:689px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#url3{
               position:absolute;
                top:754px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#address{
                position:absolute;
                top:817px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
            div#enduser{
                position:absolute;
                top:882px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
             div#contact{
                position:absolute;
                top:944px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
            div#qualifications{
                position:absolute;
                top:1008px;
                left:350px;
                right:750px;
                background-color: #fd5d54;
                height:40px;
                color : #ffa62f;
                text-align:center;
                line-height:40px;
                font-family: "Comic Sans MS", cursive, sans-serif;;
                font-size: 20px;
                font-weight:700;
                transition: 1s;
            }
            select{
             border: solid 1px #ffa62f;
                width: 415px;
                height:38px;
                
                padding:6px;
                margin-left: 300px;
                margin-top:5px;
                font-family: Tahoma, Geneva, sans-serif;
                color:grey;
                border-radius:4px;
            }
           
            
            
            
            </style>
</head>
<body background="http://media.istockphoto.com/photos/blue-abstract-background-picture-id511118930?k=6&m=511118930&s=170667a&w=0&h=z58au5RIB3pC59sXootnpxxMPpf619syyBH5yoX-uBA=">
 <h1>Register Yourself!</h1>
        <div id="header" >Smart Health
<form id="f1" action="loginservlet" method="POST">
      
        <input id="login" type="text" placeholder="Enter UserName" name="unamelogin" autofocus required>
       <input id="password" type="text" placeholder="Enter Password" name="passwordlogin" required>
 <input id="loginbutton" type="submit" value="Login" style="height: 32px" name="login" >
      
   </form>    
        </div>
       
  
        <div id="form" >
            <form action="register" method="POST">

       <div id="username">Username </div><br> 
       <input id="user" type="text" placeholder="Enter UserName" name="uname" autofocus required><br><br>
       <div id="password">Password </div> 
       <input id="r" type="password" placeholder="Enter your Password" name="pwd" required><br><br>
       <div id="password1">Password </div>   
        <input id="r" type="password" placeholder="ReEnter your Password" name="pwd2" required><br><br>
        <div id="pemail">EmailId 1&nbsp; </div> 
        <input id="mail" type="email" placeholder="Enter your email-id" name="pemail" required><br><br>
         <div id="semail">EmailId 2&nbsp; </div>
          <input id="mail" type="email" placeholder="Enter your secondary email-id" name="semail" required><br><br>
         <div id="fname">First Name </div>
         <input id="r" type="text" placeholder="Enter your First Name" name="fname" autofocus required><br><br>
         <div id="lname">Last Name </div>
          <input id="r" type="text" placeholder="Enter your Last Name" name="lname" required><br><br>
         <div id="aboutme">About Me&nbsp; </div>
          <input id="r" type="text" placeholder="Enter about me" name="aboutme" required><br><br>
         <div id="url1">Photo url1&nbsp; </div>
         <input id="r" type="text" placeholder="Enter your URL1" name="url1" autofocus required><br><br>
         <div id="url2">Photo url2&nbsp; </div> 
         <input id="r" type="text" placeholder="Enter your URL2" name="url2" required><br><br>
         <div id="url3">Photo url3&nbsp; </div>
         <input id="r" type="text" placeholder="Enter your URL3" name="url3" autofocus required><br><br>
         <div id="address">Address&nbsp;&nbsp;&nbsp; </div>
			<input id="r" type="text" placeholder="Enter your address" name="address" required><br><br>
              <div id="enduser">Register as&nbsp; </div>
               <select id="myselect" name="type" onchange="myFunction()">
				<option value="User" >User</option>
				<option value="Admin">Admin</option>
				<option value="Moderator" selected>Moderator</option>
			</select>
			
			<div id="contact" style="visiblity:hidden">Contact </div> 
         <input id="r1" type="text"  placeholder="Enter your Contact no." name="contact" style="visiblity:hidden"><br><br>
         <div id="qualifications" style="visiblity:hidden">Qualifications </div> 
         <div id="q" style="visiblity:hidden">
         <input   type="checkbox" name="qual1" value="Btech">Btech
		<input   type="checkbox" name="qual2" value="Mtech">Mtech
		<input   type="checkbox" name="qual3" value="Phd">Phd<br>
		<input   type="checkbox" name="qual4" value="BA">BA
		<input    type="checkbox" name="qual5" value="LLB">LLB
		<input   type="checkbox" name="qual6" value="Bcom">Bcom
			</div>
			
              
                
                <input id="register" type="submit" value="Register Me" style="height: 32px" name="register" >
              </form>
        </div>
       


<script>
function myFunction() {
    var x = document.getElementById("myselect").value;
  
    if (x.localeCompare("User")==0) {
        document.getElementById('contact').style.visibility = "hidden";
        document.getElementById('r1').style.visibility = "hidden";
        document.getElementById('qualifications').style.visibility = "hidden";
        document.getElementById('q').style.visibility = "hidden";
         // document.getElementById("demo").innerHTML = "hell "+document.getElementById('contact').style.visibility;
    } else if (x.localeCompare("Admin")==0){
        document.getElementById('contact').style.visibility = "visible";
        document.getElementById('r1').style.visibility = "visible";
        document.getElementById('qualifications').style.visibility = "hidden";
        document.getElementById('q').style.visibility = "hidden";
        //  document.getElementById("demo").innerHTML = "You selected: " + x;
    }
    else if (x.localeCompare("Moderator")==0){
    
    document.getElementById('contact').style.visibility = "visible";
        document.getElementById('r1').style.visibility = "visible";
        document.getElementById('qualifications').style.visibility = "visible";
        document.getElementById('q').style.visibility = "visible";
    }
}

</script>
</body>
</html>