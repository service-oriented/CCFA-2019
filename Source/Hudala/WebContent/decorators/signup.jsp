<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><dec:title default="Đăng ký" /></title>
			<link rel="icon" type="image/png" href="<c:url value='/templates/hudala/images/icons/favicon.ico ' /> " />
<!--===============================================================================================-->
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/vendor/bootstrap/css/bootstrap.min.css' /> "  media="all" /> 
<!--===============================================================================================-->
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/fonts/font-awesome-4.7.0/css/font-awesome.min.css' /> "  media="all" /> 
<!--===============================================================================================-->
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/fonts/iconic/css/material-design-iconic-font.min.css' /> "  media="all" /> 
<!--===============================================================================================-->
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/vendor/animate/animate.css' /> "  media="all" /> 
<!--===============================================================================================-->	
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/vendor/css-hamburgers/hamburgers.min.css' /> "  media="all" /> 
<!--===============================================================================================-->
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/vendor/animsition/css/animsition.min.css' /> "  media="all" /> 
<!--===============================================================================================-->
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/vendor/select2/select2.min.css' /> "  media="all" /> 
<!--===============================================================================================-->	
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/vendor/daterangepicker/daterangepicker.css' /> "  media="all" /> 
<!--===============================================================================================-->
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/css/util.css' /> "  media="all" /> 
		 <link rel="stylesheet" type="text/css" href="<c:url value='/templates/hudala/css/main.css' /> "  media="all" /> 
<!--===============================================================================================-->

<style type="text/css">
	

	.login,.register{
		display: none;
		justify-content: center;
	}
	.a{
		display: flex;
	}
	.container-animation{
		animation: fadeInBottom 0.5s linear forwards;
		animation-delay: 0.5s;
		opacity: 0; 
		background-color: white;
	}
	@keyframes fadeInBottom
	{
		0%
		{
			transform: translateY(50px);
			opacity: 0; 
		}
		100%
		{
			transform: translateY(0);
			opacity: 0.8;
		}
	}
</style>
	
</head>
<body id="signupForm">
	
   
    	<dec:body/>
 	 	
<!--===============================================================================================-->
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ vendor/jquery/jquery-3.2.1.min.js' />"></script>
<!--===============================================================================================-->
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ vendor/animsition/js/animsition.min.js' />"></script>
<!--===============================================================================================-->
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ vendor/bootstrap/js/popper.js' />"></script>
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ vendor/bootstrap/js/bootstrap.min.js' />"></script>
<!--===============================================================================================-->
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ vendor/select2/select2.min.js' />"></script>
<!--===============================================================================================-->
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ vendor/daterangepicker/moment.min.js' />"></script>
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ vendor/daterangepicker/daterangepicker.js' />"></script>
<!--===============================================================================================-->
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ vendor/countdowntime/countdowntime.js' />"></script>
<!--===============================================================================================-->
	 <script  type="text/javascript" src="<c:url value='/templates/hudala/ js/loginmain.js' />"></script>

<script  type="text/javascript" src="<c:url value='/templates/hudala/style/checksignup.js' />"></script>
<!--------------------------------------------------------------------------------------------------->
	<script type="text/javascript">
		
	const login = document.querySelector('.login');
	const register = document.querySelector('.register');
	function openLogin()
	{
		login.classList.add('a');
		register.classList.remove('a');
	}
	function openRegister()
	{
		login.classList.remove('a');
		register.classList.add('a');
	}
	</script>
</body>
</html>