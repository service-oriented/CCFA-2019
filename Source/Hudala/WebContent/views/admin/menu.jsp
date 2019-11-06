<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!-- COMMON FRAGMENT -->
<div class="col-md-3 left_col">
	<div class="left_col scroll-view">
		<div class="navbar nav_title" style="border: 0;">
			<a href="" class="site_title"><i class="fa fa-thumbs-o-up"></i> <span>Administrator</span></a>
		</div>

		<div class="clearfix"></div>

		<!-- menu profile quick info -->
		<div class="profile clearfix">
			<div class="profile_pic">
				<img
					src="<c:url value='/images/logo-haui-size.png'/>"
					src="${pageContext.request.contextPath}/images/logo-haui-size.png"
					alt="profile" class="img-circle profile_img">
			</div>
			<div class="profile_info">
				<span>Xin chào,</span>
				<h2>${menu.adminName}</h2>
			</div>
		</div>
		<!-- /menu profile quick info -->

		<br />

		<!-- sidebar menu -->
		<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
			<div class="menu_section">
				<h3>Quản Lý</h3>
				<ul class="nav side-menu">
					<li><a href="/admin/home"><i class="fa fa-home"></i> Trang
							chủ </a></li>
					<li><a href="/admin/account"><i class="fa fa-group"></i>
							Tài Khoản </a></li>
					<li><a><i class="fa fa-database"></i>Nguồn Thông Tin<span
							class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu">
							<li><a href="api.html">Api</a></li>
							<li><a href="product.html">Sản phẩm</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!-- /sidebar menu -->

		<!-- /menu footer buttons -->
		<div class="sidebar-footer hidden-small">
			<a data-toggle="tooltip" data-placement="top" title="Settings"> <span
				class="glyphicon glyphicon-cog" aria-hidden="true"></span>
			</a> <a data-toggle="tooltip" data-placement="top" title="FullScreen">
				<span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
			</a> <a data-toggle="tooltip" data-placement="top" title="Lock"> <span
				class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
			</a> <a data-toggle="tooltip" data-placement="top" title="Logout"
				href="/admin?login=false"> <span class="glyphicon glyphicon-off"
				aria-hidden="true"></span>
			</a>
		</div>
		<!-- /menu footer buttons -->
	</div>
</div>

<!-- top navigation -->
<div class="top_nav">
	<div class="nav_menu">
		<nav>
			<div class="nav toggle">
				<a id="menu_toggle"><i class="fa fa-bars"></i></a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li class=""><a href="javascript:;"
					class="user-profile dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"> <img
						src="<c:url value='/images/logo-haui-size.png'/>"
						alt="profile">${menu.adminName} <span
						class=" fa fa-angle-down"></span>
				</a>
					<ul class="dropdown-menu dropdown-usermenu pull-right">
						<li><a href="profile.html"><i
								class="fa fa-user pull-right"></i> Hồ sơ</a></li>
						<li><a href="/admin?login=false"><i
								class="fa fa-sign-out pull-right"></i> Đăng xuất</a></li>
					</ul></li>

				<li role="presentation" class="dropdown"><a href="javascript:;"
					class="dropdown-toggle info-number" data-toggle="dropdown"
					aria-expanded="false"> <i class="fa fa-envelope-o"></i> <span
						class="badge bg-green">${menu.messageCounter}</span>
				</a>
					<ul id="menu1" class="dropdown-menu list-unstyled msg_list"
						role="menu">
						<c:forEach var="message" items="${menu.feedBack}">
							<li><a href="#"> <span class="image"><img
										src="images/img.jpg"/></span> <span> <span>${message.guestName}</span>
										<span class="time">${message.sentTime}</span>
								</span> <span class="message"
									style="text-overflow: ellipsis; overflow: hidden;">
										${message.content} </span>
							</a></li>
						</c:forEach>
						<li>
							<div class="text-center">
								<a href=""> <strong>Xem tất cả</strong> <i
									class="fa fa-angle-right"></i>
								</a>
							</div>
						</li>
					</ul></li>
			</ul>
		</nav>
	</div>
</div>
<!-- /top navigation -->
<!-- COMMON FRAGMENT -->