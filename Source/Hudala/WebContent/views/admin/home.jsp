<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="<c:url value='/images/fashion.ico'/>"
	type="images/ico" />
<title>Trang chủ</title>

<!-- Bootstrap -->
<link
	href="<c:url value='/templates/admin/vendors/bootstrap/dist/css/bootstrap.min.css'/>"
	rel="stylesheet" />
<!-- Font Awesome -->
<link
	href="<c:url value='/templates/admin/vendors/font-awesome/css/font-awesome.min.css'/>"
	rel="stylesheet" />
<!-- NProgress -->
<!-- Custom Theme Style -->
<link
	href="<c:url value='/templates/admin/build/css/custom.min.css'/>"
	rel="stylesheet" />
<link
	href="<c:url value='/templates/admin/build/css/custom.css'/>"
	rel="stylesheet" />
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<!-- COMMON FRAGMENT -->
			<!-- menu fragment -->
			<%@include file="/views/admin/menu.jsp"%>
			<!-- COMMON FRAGMENT -->

			<!-- page content -->
			<div class="right_col" role="main">
				<div class="">
					<div class="row top_tiles">
						<div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="tile-stats">
								<div class="icon">
									<i class="fa fa-users"></i>
								</div>
								<div class="count">123</div>
								<h3>khách hàng</h3>
								<p>Khách hàng đang phục vụ</p>
							</div>
						</div>
						<div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="tile-stats">
								<div class="icon">
									<i class="fa fa-cubes"></i>
								</div>
								<div class="count">250</div>
								<h3>sản phẩm</h3>
								<p>Sản phẩm hiện có</p>
							</div>
						</div>
						<div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="tile-stats">
								<div class="icon">
									<i class="fa fa-eye"></i>
								</div>
								<div class="count">20</div>
								<h3>lượt/sản phẩm</h3>
								<p>Lượt xem trung bình trong ngày</p>
							</div>
						</div>
						<div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="tile-stats">
								<div class="icon">
									<i class="fa fa-thumbs-o-up"></i>
								</div>
								<div class="count">10</div>
								<h3>lượt/sản phẩm</h3>
								<p>Lượt thích trung bình trong tháng</p>
							</div>
						</div>
					</div>

					<div class="row"></div>
				</div>
			</div>
			<!-- /page content -->

			<!-- COMMON FRAGMENT -->
			<!-- footer content -->
			<%@include file="/views/admin/footer.jsp"%>
			<!-- COMMON FRAGMENT -->
		</div>
	</div>

	<!-- jQuery -->
	<script
		src="<c:url value='/templates/admin/vendors/jquery/dist/jquery.min.js'/>"></script>
	<!-- Bootstrap -->
	<script
		src="<c:url value='/templates/admin/vendors/bootstrap/dist/js/bootstrap.min.js'/>"></script>
	<!-- Custom Theme Scripts -->
	<script
		src="<c:url value='/templates/admin/build/js/custom.min.js'/>"></script>
</body>

</html>