<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="utf-8">

<title>Hồ sơ của tôi</title>
<link
	href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,400,700"
	rel="stylesheet">

<!-- css -->

<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/open-iconic-bootstrap.min.css  ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/animate.css   ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/owl.carousel.min.css   ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/owl.theme.default.min.css   ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/magnific-popup.css   ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/aos.css   ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/ionicons.min.css   ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/bootstrap-datepicker.css   ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/jquery.timepicker.css  ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/flaticon.css   ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/icomoon.css  ' /> "
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value='/templates/hudala/css/style.css  ' /> "
	type="text/css" media="all" />
<style type="text/css">
.huda {
	
}

.unhuda {
	
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
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown:hover .dropbtn {
	background-color: #3e8e41;
}

.dropdown-item {
	font-size: 16px;
	background-color: white;
}
</style>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha256-3dkvEK0WLHRJ7/Csr0BZjAWxERc5WH7bdeUya2aXxdU= sha512-+L4yy6FRcDGbXJ9mPG8MT/3UCDzwR9gPeyFNMCtInsol++5m3bk2bXWKdZjvybmohrAsn3Ua5x8gfLnbE1YkOg=="
	crossorigin="anonymous">

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha256-7s5uDGW3AHqw6xtJmNNtr+OBRJUlgkNJEo78P4b0yRw= sha512-nNo+yCHEyn0smMxSswnf/OnX6/KwJuZTlNZBjauKhTK0c+zT+q5JOCx0UFhXQ6rJR9jg6Es8gPuD2uZcYDLqSw=="
	crossorigin="anonymous">

<!-- Custom CSS -->
<style>
body {
	padding-top: 70px;
	/* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
}

.othertop {
	margin-top: 10px;
}
</style>

</head>
<body id="userProfile">
	<!-- header -->
	<%@ include file="/common/web/header.jsp"%>
	<!-- header -->
	<dec:body />

	<!--===============================================================================================-->
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ vendor/jquery/jquery-3.2.1.min.js' />"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ vendor/animsition/js/animsition.min.js' />"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ vendor/bootstrap/js/popper.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ vendor/bootstrap/js/bootstrap.min.js' />"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ vendor/select2/select2.min.js' />"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ vendor/daterangepicker/moment.min.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ vendor/daterangepicker/daterangepicker.js' />"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ vendor/countdowntime/countdowntime.js' />"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="<c:url value='/templates/hudala/ js/loginmain.js' />"></script>


	<!--------------------------------------------------------------------------------------------------->
	<script type="text/javascript">
		const login = document.querySelector('.login');
		const register = document.querySelector('.register');
		function openLogin() {
			login.classList.add('a');
			register.classList.remove('a');
		}
		function openRegister() {
			login.classList.remove('a');
			register.classList.add('a');
		}
	</script>
</body>
</html>