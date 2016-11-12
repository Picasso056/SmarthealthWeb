<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.Post"%>
<%@page import="java.sql.Timestamp" %>
<%@page import="java.util.*" %>
<%@page import="java.text.*" %>
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


.auto-style1 {
    text-align: center;
}


.auto-style2 {
    font-size: x-large;
}


.auto-style3 {
	font-family: Arial, Helvetica, sans-serif;
}
.auto-style4 {
	font-size: large;
}
.auto-style5 {
	text-align: left;
	font-size: x-large;
}
.auto-style6 {
	margin-left: 98px;
}
.auto-style7 {
	text-align: left;
}


.auto-style8 {
	margin-left: 24px;
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

                
                                

<div class="head3">            
            
        <div class="g1">    
                                            
            </div>

            
                                    
                                    
                <h1  style="color: #000000;" class="auto-style1">All 
				Post</h1>
                                                            
                                                                
                                                        
                                                                          
                                                                                                           
                                                                          
                                    </div>
                
                
                
                                
        
    
<div id="London" class="tabcontent">
                
                
                <div id="form">
                                
	
<div class="head3">			
			
		<div class="g1">	
											
			</div>

			
									
									
				<br>
				<br>
															
																<%  ArrayList<Post> post = (ArrayList<Post>)request.getAttribute("allPost");%>
																<table align="center" border="0">
																<col width="120">
																<col width="150">
																<th>Post Text</th>
																<th>Rating</th>
																<%for(Post i : post){ %>
																	<form action="ratePost" >    	
																	<tr>
																	<td align="center">
																	<a href="GetAllComment?name=<%=i.getUsername()%>&time=<%=i.getTimeCreated()%>"><%= i.getText() %>
																	 </a> &nbsp;&nbsp;&nbsp;&nbsp;
																	 </td>
																	
																	 <td align="center">
																	<select name="rate" id="rate" >
																	<option value="1">1</option>
																	<option value="2">2</option>
																	<option value="3">3</option>
																	<option value="4">4</option>
																	<option value="5">5</option>
																	
																	</select>
																	
																	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																	<input type="hidden" name="Username" value=<%= i.getUsername() %>>
																	
																	<%Timestamp x =  i.getTimeCreated(); %>
																	<% SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");%>
																	<%String string  = dateFormat.format(i.getTimeCreated());%>
																	<% string = string.replace(' ','@'); %>
																	<%System.out.println("Date is " + x); %>
																	<input type="hidden" name="Time" value=<%= string %>>
																	
																	<input name="Submit<%=i%>" type= "submit" value="Rate" style="width: px">
																	</td>
																	</tr>
																	</form>
																	<%} %>
																	
																
																
														
															</table>
														
																		  
																		  								 
																		  
									</div>
									



	  <br>
	  <br><br>
	  
	<form action="addpost.jsp">
	<div class="auto-style1">
	<input name="Submit1" type= "submit" value="Add Post" style="width: 196px"></div>
</form>
				
	
				
								
		
	
                
 </div>
</div>
</body>
</html>