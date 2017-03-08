
<!DOCTYPE html>
<%@page import="com.control.AdminstratorOperations"%>
<%@page import="com.model.Person"%>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
<title>edit profile</title>
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
										<li><a href="productOfcategory">dress</a></li>
										<li><a href="productOfcategory">Bags</a></li>
										<li><a href="productOfcategory">Caps</a></li>
										<li><a href="productOfcategory">Hoodies</a></li>
                                        <li><a href="productOfcategory">vest</a></li>
										<li><a href="productOfcategory">shoses</a></li>										
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
					<a href="index.jsp" >
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
		<h1>Edit profile</h1>
		<em></em>
		<h2><a href="index.jsp">Home</a><label>/</label> Edit profile </h2>
	</div>
</div>

<!--login-->
<%
Person person=(Person)session.getAttribute("List");
%>
<div class="container">
		<div class="login">
			<form  action = "editProfile" method="post">
			<div class="col-md-6 login-do">
			<div class="login-mail">
					<input type="text" placeholder="FirstName"  value="<%=person.getFirstName()%>" name= "fname">
					<i  class="glyphicon glyphicon-user"></i> 
				</div>
				<div class="login-mail">
					<input type="text" placeholder="Last Name"  value="<%=person.getLastName()%>" name="lname">
					<i  class="glyphicon glyphicon-user"></i>
			    </div>
				<div class="login-mail">
					<input type="tel" placeholder="Phone Number"  size="58" style="border:none;" value="<%=person.getPhoneNumber()%>" name="phone">
					<i  class="glyphicon glyphicon-phone"></i>
			</div>
				<div class="login-mail">
					<input type="email" placeholder="Email"  size="58" style="border:none;" value="<%=person.getEmail()%>" name="email">
					<i  class="glyphicon glyphicon-envelope"></i>
				</div>
				<div class="login-mail">
					<input type="password" placeholder="Password"  value="<%=person.getPassword()%>" name="password">
					<i class="glyphicon glyphicon-lock"></i>
				</div>
				  
			    <div class="login-mail">
					<input type="text" placeholder="Job"  value="<%=person.getJob()%>" name="job">
					<i  class="glyphicon glyphicon-briefcase"></i>
				</div>
				<div class="login-mail">
					<input type="date" placeholder="Birthday"  value="<%=person.getBirthday()%>"name="birthday">
					<i  class="glyphicon glyphicon-calendar"></i>
				</div>
				<div class="login-mail">
					<input type="text" placeholder="address"  value="<%=person.getAddress()%>" name="add">
					<i  class="glyphicon glyphicon-globe"></i>
				</div>
				<div class="login-mail">
					<input type="text" placeholder="credit Number" value="<%=person.getCreditNumber()%>"  name="cn">
					<i  class="glyphicon glyphicon-shopping-cart"></i>
				</div>
				<div class="login-mail">
					<input type="text" placeholder="credit limit" value="<%=person.getCreditLimit()%>"  name="cl">
					<i  class="glyphicon glyphicon-shopping-cart"></i>
				</div>
			
				<label class="hvr-skew-backward">
				      <input type="hidden" name="userId" value="<%=person.getId()%>"> 
					<input type="submit" value="Submit">
				</label>
			
			</div>
			
		</form>
			
			<!--  <div class="clearfix"> </div>-->
			
		</div>

</div>

<!--//login-->

		<!--brand-->
		<div class="container">
			<div class="brand">
				<div class="col-md-3 brand-grid">
					<img src="images/ic.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic1.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic2.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic3.png" class="img-responsive" alt="">
				</div>
				<div class="clearfix"></div>
			</div>
			</div>
			<!--//brand-->
	
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
							<li><a href="contact.jsb">Contact Us</a></li>
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