<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/fashion.ico" type="images/ico" />
<title>Trang chủ</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/templates/admin/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet"/>
<!-- Font Awesome -->
<link
	href="${pageContext.request.contextPath}/templates/admin/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet"/>
<!-- NProgress -->
<!-- Custom Theme Style -->
<link
	href="${pageContext.request.contextPath}/templates/admin/build/css/custom.min.css" rel="stylesheet"/>
<link
	href="${pageContext.request.contextPath}/templates/admin/build/css/custom.css" rel="stylesheet"/>
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
		src="${pageContext.request.contextPath}/templates/admin/vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script
		src="${pageContext.request.contextPath}/templates/admin/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script
		src="<c:url value='/templates/admin/vendors/jquery-sparkline/dist/jquery.sparkline.min.js'/>"></script>
	<!-- Flot -->
	<script
		src="<c:url value='/templates/admin/vendors/Flot/jquery.flot.js'/>"></script>
	<!-- <script src="<c:url value='/templatess/admin/vendors/Flot/jquery.flot.pie.js'/>"></script> -->
	<script
		src="<c:url value='/templates/admin/vendors/Flot/jquery.flot.time.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendors/Flot/jquery.flot.stack.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendors/Flot/jquery.flot.resize.js'/>"></script>
	<!-- Flot plugins -->
	<script
		src="<c:url value='/templates/admin/vendors/flot.orderbars/js/jquery.flot.orderBars.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendors/flot-spline/js/jquery.flot.spline.min.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendors/flot.curvedlines/curvedLines.js'/>"></script>
	<!-- DateJS -->
	<script
		src="<c:url value='/templates/admin/vendors/DateJS/build/date.js'/>"></script>
	<!-- bootstrap-daterangepicker -->
	<script
		src="<c:url value='/templates/admin/vendors/moment/min/moment.min.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendors/bootstrap-daterangepicker/daterangepicker.js'/>"></script>

	<!-- Custom Theme Scripts -->
	<script src="${pageContext.request.contextPath}/templates/admin/build/js/custom.min.js"></script>
</body>

</html>