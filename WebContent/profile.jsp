<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.Person"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--theme-style-->
<link href="css/style4.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<script src="js/jquery.min.js"></script>
<!--- start-rate---->
<script src="js/jstarbox.js"></script>
	<link rel="stylesheet" href="css/jstarbox.css" type="text/css" media="screen" charset="utf-8" />
		<script type="text/javascript">
			jQuery(function() {
			jQuery('.starbox').each(function() {
				var starbox = jQuery(this);
					starbox.starbox({
					average: starbox.attr('data-start-value'),
					changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
					ghosting: starbox.hasClass('ghosting'),
					autoUpdateAverage: starbox.hasClass('autoupdate'),
					buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
					stars: starbox.attr('data-star-count') || 5
					}).bind('starbox-value-changed', function(event, value) {
					if(starbox.hasClass('random')) {
					var val = Math.random();
					starbox.next().text(' '+val);
					return val;
					} 
				})
			});
		});
		</script>
<!---//End-rate---->
</head>


<body>
<%
response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
String userName = (String) session.getAttribute("email");
String useradmin=(String) session.getAttribute("emailAdmin");
if (null == userName&&useradmin==null) {
   request.setAttribute("Error", "Session has ended.  Please login.");
   RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
   rd.forward(request, response);
}

%>
<!--header-->
<div class="header">
<div class="container">
		<div class="head">
			<div class=" logo">
				<a href="index.jsp"><img src="images/logo.png" alt=""></a>	
			</div>
		</div>
	</div>
	<div class="header-top">
		<div class="container">
		<div class="col-sm-5 col-md-offset-2  header-login">
					<ul >
						<li><a href="login.html">Login</a></li>
						<li><a href="register.html">Register</a></li>
						
					</ul>
				</div>
				
			<div class="col-sm-5 header-social">		
					<ul >
						<li><a href="#"><i></i></a></li>
						<li><a href="#"><i class="ic1"></i></a></li>
						<li><a href="#"><i class="ic2"></i></a></li>
						<li><a href="#"><i class="ic3"></i></a></li>
						<li><a href="#"><i class="ic4"></i></a></li>
					</ul>
					
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		
		<div class="container">
		
			<div class="head-top">
			
		 <div class="col-sm-8 col-md-offset-2 h_menu4">
				<nav class="navbar nav_bottom" role="navigation">
 
 <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header nav_2">
      <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     
   </div> 
   <!-- Collect the nav links, forms, and other content for toggling -->
   <%
             HttpSession hs=request.getSession();
		   if(hs.getAttribute("emailAdmin")==null){%>
		   <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
            <ul class="nav navbar-nav nav_1">
		   <li><a class="color" href="index.jsp">Home</a></li>
    		<li class="dropdown mega-dropdown active">
			    <a class="color1" href="" class="dropdown-toggle" data-toggle="dropdown">Product<span class="caret"></span></a>				
				<div class="dropdown-menu ">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>Category</h4>
									<ul>
										<li><a href="product.html">dress</a></li>
										<li><a href="product.html">Bags</a></li>
										<li><a href="product.html">Caps</a></li>
										<li><a href="product.html">Hoodies</a></li>
                                        <li><a href="product.html">vest</a></li>
										<li><a href="product.html">shoses</a></li>										
									</ul>	
							</div>							
						</div>
						
						<div class="clearfix"></div>
					</div>                 
				</div>				
			</li>
			<li><a class="color4" href="about.jsp">About</a></li>
            <li><a class="color5" href="contact.jsp">Contact</a></li>
           
		   <% 
		   if(hs.getAttribute("email")!=null){
		   %>
		     <li><a class="color6" href="profileServlet"><%=hs.getAttribute("name")%></a></li>
		  <%}%>
		      </ul>
		     </div><!-- /.navbar-collapse -->
              </nav>
              </div>
		   <div class="col-sm-2 search-right">
				<ul class="heart">
				<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> </i></a></li>
					</ul>
					<div class="cart box_1">
					<%if(hs.getAttribute("email")!=null){ %>
						<a href="checkout.html">
						<h3> <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">My Cart</a></p>
                     <%} %>
					</div>
					<div class="clearfix"> </div>
						<!----->
						<!---pop-up-box---->					  
			<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
			<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
			<!---//pop-up-box---->
			<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
					<div class="login-search">
					<form action="SearchingServlet" method="post">
						<input type="submit" value="">
						<input type="text" name="searching" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}">		
					</form>
					</div>
					<p>Shopin</p>
				</div>				
			</div>
		  <%}%>   
			<% if(hs.getAttribute("emailAdmin")!=null){%>
			<!-- Collect the nav links, forms, and other content for toggling -->
                   <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                   <ul class="nav navbar-nav nav_1">
				    <li><a class="color" href="index.jsp">Home</a></li>
					<li><a class="color1" href="viewAccountServlet">Personal Accounts</a></li>
					<li><a class="color2" href="Viewproduct">View Products</a></li>
		            <li><a class="color3" href="Addproduct.jsp">Add Product</a></li>
		            <li ><a class="color4" href="register.html">Add Admin</a></li>
		            <li><a class="color" href="profileServlet"><%=hs.getAttribute("nameAdmin")%></a></li>
				     </ul>
	                  </div><!-- /.navbar-collapse -->
	                </nav>
	                </div>
				    <div class="col-sm-2 search-right">
					<ul class="heart">
					<li>
					<a href="" >
					<span class="glyphicon glyphicon-home" aria-hidden="true"></span>
					  Web Site
					</a>
					<a href="LogoutServlet"><i class="glyphicon glyphicon-user"></i>Log Out</a>
					</li>	
					</ul>
				    <div class="clearfix"> </div>
				    </div> 
				    <!---pop-up-box---->					  
			<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
			<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
			<!---//pop-up-box---->
			<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
					<div class="login-search">
						<input type="submit" value="">
						<input type="text" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}">		
					</div>
					<p>Shopin</p>
				</div>				
			</div>
		 
				    <%} %> 	    				
						<!----->
			<script>
			$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
			});																					
			});
		   </script>
			</div>
			<div class="clearfix"></div>
		</div>	
	</div>	
<!--banner-->
<div class="banner-top">
	<div class="container">
		<h1>profile</h1>
		<em></em>
		<h2><a href="index.jsp">Home</a><label>/</label>profile</h2>
	</div>
</div>
<!--login-->
<div class="container">
		<div class="login">
		
			<div class="col-md-6 login-do">
				<div class="login-mail">
				   <table>
				   <%
                    Person person=(Person)request.getAttribute("data");%>
				   <tr>
				   <td><i class="glyphicon glyphicon-user"></i></td>
				   <td>Name</td>
				   <td><%=person.getFirstName() %> <%=person.getLastName() %></td>
				   </tr>
				   <tr>
				   <td><i  class="glyphicon glyphicon-lock"></i></td>
				   <td>Password</td>
				   <td><%=person.getPassword()%></td>
				   </tr>
				   <tr>
				   <td><i  class="glyphicon glyphicon-envelope"></i></td>
				   <td>Email Address</td>
				   <td><%=person.getEmail()%></td>
				   </tr>
				   <tr>
				   <td><i  class="glyphicon glyphicon-briefcase"></i></td>
				   <td>Job</td>
				   <td><%=person.getJob()%></td>
				   </tr>
				   <tr>
				   <td><i  class="glyphicon glyphicon-shopping-cart"></i></td>
				   <td>Credit Limit</td>
				   <td><%=person.getCreditLimit()%></td>
				   </tr>
				   <tr>
				   <td><i  class="glyphicon glyphicon-credit-card"></i></td>
				   <td>Credit number</td>
				   <td><%=person.getCreditNumber()%></td>
				   </tr>
				   <tr>
				   <td><i  class="glyphicon glyphicon-globe"></i></td>
				   <td>Address</td>
				   <td><%=person.getAddress()%></td>
				   </tr>
				   <tr>
				   <td><i  class="glyphicon glyphicon-phone"></i></td>
				   <td>Phone Number</td>
				   <td><%=person.getPhoneNumber()%></td>
				   </tr>
				   <tr>
				   <td><i  class="glyphicon glyphicon-calendar"></i></td>
				   <td>Birthday</td>
				   <td><%=person.getBirthday().toLocaleString()%></td>
				   </tr>
				   <tr>
				   <td>
				   <form action="Editprofile.jsp"   class=" hvr-skew-backward">
				   
				  <%  session.setAttribute("List", person);%>
				   <input type="submit" value="Edit" />
				   </form>
				   </td>
				   </tr>
				   </table>
				</div>
				
				  
			</div>

			
			<div class="col-md-6">
			     <table>
				 <tr>
				 <td><a href="#" class=" hvr-skew-backward">Order History</a></td>
				 </tr>
				 <tr>
				 <td><a href="#" class=" hvr-skew-backward">Wishing order</a></td>
				 </tr>
				 <tr>
				 <td><a href="profileServlet" class=" hvr-skew-backward">&ensp;Personal Info</a></td>
				 </tr>
				 <tr>
				 <td><a href="LogoutServlet"  class=" hvr-skew-backward">&ensp;&ensp;&ensp;LogOut&ensp;&ensp;&ensp;</a></td>
				 </tr>
				 </table>			
			</div>
			
			<div class="clearfix"> </div>
		</div>

</div>	
	<!--//content-->
		<!--//footer-->
	<div class="footer">
	<div class="footer-middle">
				<div class="container">
					<div class="col-md-3 footer-middle-in">
						<a href="index.jsp"><img src="images/log.png" alt=""></a>
						<p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>
					</div>
					
					<div class="col-md-3 footer-middle-in">
						<h6>Information</h6>
						<ul class=" in">
							<li><a href="about.jsp">About</a></li>
							<li><a href="contact.jsp">Contact Us</a></li>
							<li><a href="login.html">Login</a></li>
							
						</ul>
						
						<div class="clearfix"></div>
					</div>
					<div class="col-md-3 footer-middle-in">
						<h6>Tags</h6>
						<ul class="tag-in">
							<li><a href="#">Lorem</a></li>
							<li><a href="#">Sed</a></li>
							<li><a href="#">Ipsum</a></li>
							<li><a href="#">Contrary</a></li>
							<li><a href="#">Chunk</a></li>
							<li><a href="#">Amet</a></li>
							<li><a href="#">Omnis</a></li>
						</ul>
					</div>
					
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="footer-bottom">
				<div class="container">
					<ul class="footer-bottom-top">
						<li><a href="#"><img src="images/f1.png" class="img-responsive" alt=""></a></li>
						<li><a href="#"><img src="images/f2.png" class="img-responsive" alt=""></a></li>
						<li><a href="#"><img src="images/f3.png" class="img-responsive" alt=""></a></li>
					</ul>
					<p class="footer-class">&copy; 2016 Shopin. All Rights Reserved | Design by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!--//footer-->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>