 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Đăng nhập</title>
<script language="JavaScript" src="<c:url value='/templates/hudala/js/messageCheck.js ' />"></script>


</head>
<body>

	<div class="limiter login a">

		<div class="container-login100 "
			style="background-image: url('images/bg-01.jpg');">

			<div class="container-animation">
				<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form " action="<c:url value='/dang-nhap' />" id="formLogin" method="post">
												
							<span class="login100-form-title p-b-49"> Modist </span>						
							<div class="wrap-input100 validate-input m-b-23"
								data-validate="Tài khoản không hợp lệ">
								<span class="label-input100">Tên đăng nhập</span> 
								<input class="input100" type="text" name="username"   id="username" 
									placeholder="Nhập tài khoản" > 								
										<span class="focus-input100" data-symbol="&#xf206;"></span>
								
							</div>
							
						<div class="wrap-input100 validate-input"
							data-validate="Mật khẩu không hợp lệ">
							<span class="label-input100">Mật khẩu</span> <input
								class="input100" type="password" name="password" id="password"
								placeholder="Nhập mật khẩu" >								
								<span class="focus-input100" data-symbol="&#xf206;"></span>
							
						</div>
						<br/>
						<c:if test="${not empty message}">
							<div class="alert alert-danger">
									${message}
							</div>
						</c:if>
						<div class="text-right p-t-8 p-b-31">
							<a href="#"> Quên mật khẩu? </a>
						</div>	
											
						<div class="container-login100-form-btn">
							<div class="wrap-login100-form-btn">
								<div class="login100-form-bgbtn"></div>
								<input type="hidden" value="login" name="action"/>
								<button class="login100-form-btn" type="submit" onclick="checkValidLogin(this.form)">Đăng nhập
								</button>
							</div>
						</div>
						
						<div class="txt1 text-center p-t-54 p-b-20">
							<span> Đăng kí? </span>
						</div>

						<div class="flex-c-m">
							<a href="#" class="login100-social-item bg1"> <i
								class="fa fa-facebook"></i>
							</a> <a href="#" class="login100-social-item bg2"> <i
								class="fa fa-twitter"></i>
							</a> <a href="#" class="login100-social-item bg3"> <i
								class="fa fa-google"></i>
							</a>
						</div>

						<div class="flex-col-c p-t-155">
							<span class="txt1 p-b-17"> Bạn chưa có tài khoản? </span> <a
								href="signup.html" onclick="openRegister()" class="txt2">
								Đăng kí? </a>
						</div>
					</form>
				</div>
			</div>
		</div>

	</div>


	<div id="dropDownSelect1"></div>
	<script  type="text/javascript" src="<c:url value='/templates/hudala/style/check.js' />"></script>
</body>
</html>
