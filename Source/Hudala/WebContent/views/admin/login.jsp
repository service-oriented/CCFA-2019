<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="<c:url value='/images/fashion.ico'/>"
	type="image/ico" />
<title>Hudala</title>

<!-- Bootstrap -->
<link
	href="<c:url value='/templates/admin/vendors/bootstrap/dist/css/bootstrap.min.css'/>"
	rel="stylesheet">
<!-- Font Awesome -->
<link
	href="<c:url value='/templates/admin/vendors/font-awesome/css/font-awesome.min.css'/>"
	rel="stylesheet">
<!-- NProgress -->
<link
	href="<c:url value='/templates/admin/vendors/nprogress/nprogress.css'/>"
	rel="stylesheet">
<!-- Animate.css -->
<link
	href="<c:url value='/templates/admin/vendors/animate.css/animate.min.css'/>"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="<c:url value='/templates/admin/build/css/custom.min.css'/>"
	rel="stylesheet">
</head>

<body class="login">
	<div>
		<div class="login_wrapper">
			<div class="animate form login_form">
				<section class="login_content">
					<form method="post" action="/admin">
						<h1>Đăng nhập</h1>
						<div>
							<input type="text" class="form-control"
								placeholder="Tên đăng nhập" required name="username" />
						</div>
						<div>
							<input type="password" class="form-control"
								placeholder="Mật khẩu" required name="password" />
						</div>
						<div>
							<button type="submit" class="btn btn-default submit">Đăng
								Nhập</button>
						</div>
						<%
							String status = request.getParameter("login");
							if ("failure".equals(status)) {
								out.print("<div><p style=\"font-size: 25px; color: #DF0029\">Đăng nhập thất bại</p></div>");
							}
							if ("false".equals(status)) {
								session.removeAttribute("username");
								session.invalidate();
							}
						%>
						<div class="clearfix"></div>

						<div class="separator">

							<div class="clearfix"></div>
							<br />

							<div>
								<h1>
									<i class="fa fa-paper-plane"></i>&nbsp; Hệ thống HUDALA
								</h1>
								<p>©2019 Nhóm 10 ~ Kỹ thuật phần mềm 3 - K11</p>
							</div>
						</div>
					</form>
				</section>
			</div>
		</div>
	</div>
</body>
</html>