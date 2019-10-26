<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon"
	href="${pageContext.request.contextPath}/images/fashion.ico"
	type="images/ico" />
<title>Quản lý tài khoản</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/templates/admin/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<!-- Font Awesome -->
<link
	href="${pageContext.request.contextPath}/templates/admin/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />

<!-- Custom Theme Style -->
<link
	href="${pageContext.request.contextPath}/templates/admin/build/css/custom.min.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/templates/admin/build/css/custom.css"
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
					<div class="page-title">
						<div class="title_left">
							<h3>
								Tài khoản <small>Thông tin tài khoản và thông tin khách
									hàng</small>
							</h3>
						</div>

						<!-- <div class="clearfix"></div> -->

						<div class="row">
							<div class="col-md-12 col-sm-12 col-xs-12"
								style="min-height: 550px">
								<div class="x_panel">
									<div class="x_title">
										<div class="clearfix"></div>
									</div>
									<div class="x_content">
										<table id="datatable-responsive"
											class="table table-striped table-bordered dt-responsive nowrap"
											cellspacing="0" width="100%">
											<thead>
												<tr>
													<th class="center">STT</th>
													<td class="hide"></td>
													<th class="center">Tên tài khoản</th>
													<th class="center">Hoạt động</th>
													<th class="center"><i class="fa fa-gears"></i></th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="user" items="${listUser}" varStatus="status">
													<tr>
														<td class="center">${status.index + 1}</td>
														<td class="hide">${user.accountId}</td>
														<td>${user.username}</td>
														<td class="center"><input type="checkbox"
															<c:if test="${user.status == 'true'}">checked="checked"</c:if>
															disabled></td>
														<td class="center view"><i class="fa fa-eye"></i></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /page content -->

			<!-- add - edit modal -->
			<div id="view-modal" class="modal fade" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog" style="margin-top: 100px">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">Thông tin khách
								hàng</h4>
						</div>
						<div class="modal-body" style="height: 280px">
							<div class="col-md-6 col-sm-6 col-xs-12">
								<div class="form-group col-md-12 col-sm-12 col-xs-12"
									style="text-align: center">
									<img alt="User Profile" width="200px" height="200px"
										src="${pageContext.request.contextPath}/images/logo-haui-size.png">
								</div>
								<div class="checkbox" style="text-align: center;">
									<label style="margin-top: 10px;"> <input type="checkbox" > Cấm truy cập hệ thống
									</label>
								</div>
							</div>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Tên khách hàng: <span
										style="color: red">Trần Huyền Trang</span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Ngày sinh: <span
										style="color: red">01-01-900</span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Giới tính: <span
										style="color: red">Nam</span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Nghề nghiệp: <span
										style="color: red">Hòa thượng</span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Số điện thoại: <span
										style="color: red">01234512789</span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Email: <span
										style="color: red">huyentrang@gmail.com</span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label"
										style="text-overflow: ellipsis; overflow: hidden;">Liên
										kết: <a style="color: red;"
										href="http://www.facebook.com/phamdaiyb98">http://www.facebook.com/phamdaiyb98</a>
									</label>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default antoclose"
								data-dismiss="modal">Hủy</button>
							<button type="button" class="btn btn-primary antosubmit">Lưu</button>
						</div>
					</div>
				</div>
			</div>
			<div data-toggle="modal" data-target="#view-modal"></div>
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
	<!-- Custom Theme Scripts -->
	<script
		src="${pageContext.request.contextPath}/templates/admin/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/templates/admin/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/templates/admin/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/templates/admin/build/js/custom.min.js"></script>
	<script>
		$(document).ready(function() {
			var table = $('#datatable-responsive').DataTable();
			$(".view").click(function() {
				var data = table.row($(this).parents('tr')).data();
				// 				alert(data[1]); //get colum has index 1
				$("#view-modal").modal();
			});
		});
	</script>
</body>

</html>