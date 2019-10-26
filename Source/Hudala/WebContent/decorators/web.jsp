<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><dec:title default="Tư vấn mỹ phẩm và thời trang" /></title>
	 
     <link href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,400,700" rel="stylesheet">
    
    <!-- css -->
   
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/open-iconic-bootstrap.min.css  ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/animate.css   ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/owl.carousel.min.css   ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/owl.theme.default.min.css   ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/magnific-popup.css   ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/aos.css   ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/ionicons.min.css   ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/bootstrap-datepicker.css   ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/jquery.timepicker.css  ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/flaticon.css   ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/icomoon.css  ' /> " type="text/css" media="all" /> 
     <link rel="stylesheet" href="<c:url value='/templates/hudala/css/style.css  ' /> " type="text/css" media="all" /> 
	    <style type="text/css">
    	.huda{
			

    	}
    	.unhuda{

    		
    	}

		.dropbtn {
		  background-color: #4CAF50;
		  color: white;
		  padding: 16px;
		  font-size: 16px;
		  border: none;
		}
		
		.dropdown {
		  position: relative;
		  display: inline-block;
		}
		
		.dropdown-content {
		  display: none;
		  position: absolute;
		  background-color: #f1f1f1;
		  min-width: 160px;
		  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
		  z-index: 1;
		}
		
		.dropdown-content a {
		  color: black;
		  padding: 12px 16px;
		  text-decoration: none;
		  display: block;
		}
		
		.dropdown-content a:hover {background-color: #ddd;}
		
		.dropdown:hover .dropdown-content {display: block;}
		
		.dropdown:hover .dropbtn {background-color: #3e8e41;}
		.dropdown-item{
		font-size: 16px;
		background-color: white;
		}
    </style>
</head>
<body>
	<!-- header -->
    <%@ include file="/common/web/header.jsp" %>
    <!-- header -->
    
    <div class="mainbody">
    	<dec:body/>
    </div>

	<!--  footer 
	<%@ include file="/common/web/footer.jsp" %>
	 footer -->
	
	
   
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ jquery.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ jquery-migrate-3.0.1.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ popper.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ bootstrap.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ jquery.easing.1.3.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ jquery.waypoints.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ jquery.stellar.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ owl.carousel.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ jquery.magnific-popup.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ aos.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ jquery.animateNumber.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ bootstrap-datepicker.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ scrollax.min.js' />"></script>
  <script  type="text/javascript" src="<c:url value=' /templates/hudala/js/ main.js' />"></script>
</body>
</html>