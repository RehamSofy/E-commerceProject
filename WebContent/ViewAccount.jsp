<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.Person"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Account</title>
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
			function removeAccount(c) {
				 var elem = document.getElementById(c);
				 elem.parentNode.removeChild(elem);
				}
			
		</script>
<!---//End-rate---->
</head>
</head>
<body>
<!--header-->
<div class="header">
<div class="container">
		<div class="head">
			<div class=" logo">
				<a href="index.html"><img src="images/logo.png" alt=""></a>	
			</div>
		</div>
</div>
	<div class="header-top">
		<div class="container">
	     <div class="clearfix"> </div>
		</div>
		</div>
		
		<div class="container">
		
			<div class="head-top">
			
		 <div class="col-sm-8 col-md-offset-2 h_menu4">
				<nav class="navbar nav_bottom" role="navigation">
 
 <!-- Brand and toggle get grouped for better mobile display -->
  
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
			<li><a class="color4" href="about.html">About</a></li>
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
<!--banner-->
<div class="banner-top">
	<div class="container">
		<h1>Account</h1>
		<em></em>
		<h2><a href="index.html">Profile</a><label>/</label>Account</h2>
	</div>
</div>
<!--login-->
	<script>$(document).ready(function(c) {
					$('.close1').on('click', function(c){
						$('.cart-header').fadeOut('slow', function(c){
							$('.cart-header').remove();
						});
						});	  
					});
			   </script>
<script>$(document).ready(function(c) {
					$('.close2').on('click', function(c){
						$('.cart-header1').fadeOut('slow', function(c){
							$('.cart-header1').remove();
						});
						});	  
					});
			   </script>
			   <script>$(document).ready(function(c) {
					$('.close3').on('click', function(c){
						$('.cart-header2').fadeOut('slow', function(c){
							$('.cart-header2').remove();
						});
						});	  
					});
			   </script>
<div class="check-out">
<div class="container">
	
	<div class="bs-example4" data-example-id="simple-responsive-table">
    <div class="table-responsive">
    	    <table class="table-heading simpleCart_shelfItem">
		  <tr>
			<th class="table-grid">IdUser</th>			
			<th>First Name</th>
			<th >Last Name </th>
			<th>Password</th>
			<th>Job</th>
			<th>Email</th>
			<th>Address</th>
			<th>Phone Number</th>
			<th>Birthday</th>
			
		  </tr>
<% 
     ArrayList<Person> persons=(ArrayList<Person>) request.getAttribute("accountList");
          
     for(int i=0;i<persons.size();++i){	 
    	 int id1=persons.get(i).getId();         
%>
		    <tr class="cart-header" id="<%=id1%>">
			<td><%=id1%></td>
			<td><%=persons.get(i).getFirstName()%></td>
			<td><%=persons.get(i).getLastName()%></td>
			<td><%=persons.get(i).getPassword()%></td>
			<td><%=persons.get(i).getFirstName()%></td>
			<td><%=persons.get(i).getEmail()%></td>
			<td><%=persons.get(i).getAddress()%></td>
			<td><%=persons.get(i).getPhoneNumber()%></td>
			<td><%=persons.get(i).getBirthday()%></td>
			<td>
			<form action="removeAccountServelt" method="post">
			     <input type="hidden" name="product_no" value="<%=id1%>" />     
			    <input type="submit" value="x" name="remove"  >
			</form>
			</td>	
		  </tr>
<%}%>
		 
	      </table>
	      
	</div>
	</div>

</div>
</div>
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
						<a href="index.html"><img src="images/log.png" alt=""></a>
						<p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>
					</div>
					
					<div class="col-md-3 footer-middle-in">
						<h6>Information</h6>
						<ul class=" in">
							<li><a href="404.html">About</a></li>
							<li><a href="contact.html">Contact Us</a></li>
							<li><a href="#">Returns</a></li>
							<li><a href="contact.html">Site Map</a></li>
						</ul>
						<ul class="in in1">
							<li><a href="#">Order History</a></li>
							<li><a href="wishlist.html">Wish List</a></li>
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
					<div class="col-md-3 footer-middle-in">
						<h6>Newsletter</h6>
						<span>Sign up for News Letter</span>
							<form>
								<input type="text" value="Enter your E-mail" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='Enter your E-mail';}">
								<input type="submit" value="Subscribe">	
							</form>
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