<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="<c:url value='/images/fashion.ico'/>"
	type="images/ico" />
<title>Quản lý tài khoản</title>

<!-- Bootstrap -->
<link
	href="<c:url value='/templates/admin/vendors/bootstrap/dist/css/bootstrap.min.css'/>"
	rel="stylesheet" />
<!-- Font Awesome -->
<link
	href="<c:url value='/templates/admin/vendors/font-awesome/css/font-awesome.min.css'/>"
	rel="stylesheet" />

<!-- Custom Theme Style -->
<link href="<c:url value='/templates/admin/build/css/custom.min.css'/>"
	rel="stylesheet" />
<link href="<c:url value='/templates/admin/build/css/custom.css'/>"
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
							<h4 class="modal-title" id="myModalLabel"
								style="font-size: 25px; text-align: center;">Thông tin tài
								khoản</h4>
						</div>
						<div class="modal-body" style="height: 280px">
							<div class="col-md-6 col-sm-6 col-xs-12">
								<div class="form-group col-md-12 col-sm-12 col-xs-12"
									style="text-align: center">
									<img alt="User Profile" width="200px" height="200px"
										src="<c:url value='/images/logo-haui-size.png'/>">
								</div>
								<div class="checkbox" style="text-align: center;">
									<label id="denied"
										style="margin-top: 10px; color: #DF0029; font-weight: bold">
										<input type="checkbox" id="denied-access" checked> Cấm
										truy cập
									</label><br> <label id="allow"
										style="margin-top: 10px; color: #00CC00; font-weight: bold; display: none">
										<input type="checkbox" id="allow-access" checked> Cho
										phép truy cập
									</label>
								</div>
							</div>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Tên khách hàng: <span
										style="color: #0073e6" id="name"></span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Ngày sinh: <span
										style="color: #0073e6" id="birth"></span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Giới tính: <span
										style="color: #0073e6" id="gender"></span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Nghề nghiệp: <span
										style="color: #0073e6" id="job"></span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Số điện thoại: <span
										style="color: #0073e6" id="phone"></span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label">Email: <span
										style="color: #0073e6" id="email"></span></label>
								</div>
								<div class="form-group col-md-12 col-sm-12 col-xs-12">
									<label class="control-label"
										style="text-overflow: ellipsis; overflow: hidden;">Liên
										kết: <a style="color: #0073e6;" id="link"></a>
									</label>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<a class="btn btn-primary antosubmit" id="change-status">Lưu</a>
							<button type="button" class="btn btn-default antoclose"
								style="margin-right: 40px;" data-dismiss="modal">Hủy</button>
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
		src="<c:url value='/templates/admin/vendors/jquery/dist/jquery.min.js'/>"></script>
	<!-- Bootstrap -->
	<script
		src="<c:url value='/templates/admin/vendors/bootstrap/dist/js/bootstrap.min.js'/>"></script>
	<!-- Custom Theme Scripts -->
	<script
		src="<c:url value='/templates/admin/vendors/datatables.net/js/jquery.dataTables.min.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendors/datatables.net-responsive/js/dataTables.responsive.min.js'/>"></script>
	<script src="<c:url value='/templates/admin/build/js/custom.min.js'/>"></script>
	<script>
		$(document).ready(function() {
			var table = $('#datatable-responsive').DataTable();
			$(".view").click(function() {
				var data = table.row($(this).parents('tr')).data();
				var accountId = data[1];
				var access = data[3];
				switch (access) {
				case '<input type="checkbox" checked="checked" disabled="">':
					$("#allow").show();
					$("#denied").hide();
					break;
				default:
					$("#denied").show();
					$("#allow").hide();
				}
				$.ajax({
					type : "GET",
					url : "/admin/api/user-info" + "?id=" + accountId,
					success : function(guest) {
						var urlSubmit = "/admin/account/change-status?id=" + guest.accountId;
						$("#name").text(guest.fullName);
						$("#birth").text(guest.birth);
						if (guest.gender) {
							$("#gender").text("Nam");
						} else {
							$("#gender").text("Nữ");
						}
						$("#job").text(guest.job);
						$("#phone").text(guest.phone);
						$("#email").text(guest.email);
						$("#link").text(guest.link);
						$("#link").attr("href", guest.link);
						$("#change-status").attr("href", urlSubmit);
					}
				});
				$("#view-modal").modal();
			});
			$("#allow-access").click(function() {
				$("#allow").hide();
				$("#denied").show();
				$("#denied-access").prop('checked', true);
				var href = $("#change-status").attr("href");
				if(href.indexOf("&s=true") != -1 || href.indexOf("&s=false") != -1){
				    href = href.replace("&s=true", "");
				    href = href.replace("&s=false", "");
				}
				$("#change-status").attr("href", href + "&s=false");
			});
			$("#denied-access").click(function() {
				$("#denied").hide();
				$("#allow").show();
				$("#allow-access").prop('checked', true);
				var href = $("#change-status").attr("href");
				if(href.indexOf("&s=true") != -1 || href.indexOf("&s=false") != -1){
				    href = href.replace("&s=true", "");
				    href = href.replace("&s=false", "");
				}
				$("#change-status").attr("href", href + "&s=true");
			});
		});
	</script>
</body>

</html>