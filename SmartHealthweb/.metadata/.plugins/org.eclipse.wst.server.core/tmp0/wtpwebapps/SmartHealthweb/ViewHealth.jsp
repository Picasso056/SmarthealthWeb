<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Friends</title>
</head>


<style>

#logo{
    position: absolute;
    right:10px;
    bottom: 10px;
}
body{
    margin: 0;
    padding: 0;
    font-size: 15px;
    font-family: "Lucida Grande", "Helvetica Nueue", Arial, sans-serif;
}
nav {
    background-color: #333;
    border: 1px solid #333;
    color: #fff;
    display: block;
    margin: 0;
    overflow: hidden;
}
nav ul{
    margin: 0;
    padding: 0;
    list-style: none;
}
nav ul li {
    margin: 0;
    display: inline-block;
    list-style-type: none;
    transition: all 0.2s;
}

nav > ul > li > a {
    color: #aaa;
    display: block;
    line-height: 2em;
    padding: 0.5em 2em;
    text-decoration: none;

}

nav li > ul{
    display : none;
    margin-top:1px;
    background-color: #bbb;

}

nav li > ul li{
    display: block;
}

nav  li > ul li a {
    color: #111;
    display: block;
    line-height: 2em;
    padding: 0.5em 2em;
    text-decoration: none;
}

nav li:hover {
    background-color: #666;
}
nav li:hover > ul{
    position:absolute;
    display : block;
}
nav li > ul > li ul  {
    display: none;
    background-color: #888;
}
nav li > ul > li:hover > ul  {
    position:absolute;
    display : block;
    margin-left:100%;
    margin-top:-3em;
}

.auto-style2 {
	margin-left: 0px;
}

.auto-style1 {
    text-align: center;
}


</style>


<body>
        
<nav>
    <ul>
     <li>
            <a href="homeservlet">SmartHealth</a>
            
        </li>
        <li>
            <a href="homeservlet">Home</a>
            
        </li>
        <li>
            <a href="ViewFriends">Friends</a>
            <ul>
                <li><a href="ViewFriends">View Friends</a></li>
                <li><a href="friendservlet">Add Friends</a></li>
<li><a href="AllUser">See All Friends</a></li>
                <li><a href="RequestView">View Friend Request</a></li>
            </ul>
        </li>
        <li>
            <a href="GetAllForum">Discussions</a>
            <ul>
            <li><a href ="CreateForum">Add Forum</a></li>
            <li><a href="GetAllForum">View Forums</a></li>
            </ul>
        </li>
        <li>
        <a id="logout" href="logoutservlet" >Logout</a>
        </li>
        
    </ul>
</nav>

                
                                

<div class="head3" style="width:100%; height: 418px;">            
            
       <div style="float:left; width:48%; height: 340px;">
        

            
                                    
                                    
                <h1  style="color: #000000;" class="auto-style1"><b>My Friends</b></h1>
                    
                                                                <%  ArrayList<String> friends = (ArrayList<String>)request.getAttribute("myfriends");%>
                                                                <label class="control-label col-sm-2" for="username" style="width: 24.666667%;">
        UserName</label><br><br>
                                                            <form  action="healthdata" method="post">
                                                                <%for(String user : friends){ %>
                                                                        
                                                                    <div class="form-group">
                                                                         <label class="control-label col-sm-2" for="username" style="width: 24.666667%;"><%= user %> </label>
                                                                         <input name="health[<%=user %>]" type="submit" value="ViewHealth">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       
                                                                    </div>
                                                                    <br>
                                                                <%} %></form>
                       </div>
                     
                                                               
                                                        
                                                        
                                                        
                                                                          
                                                                                                           
                                                                          
                                    </div>
                
                
                
                                
        
    

</body>
</html>