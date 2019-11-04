 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Đăng ký</title>
</head>
<body>
	<div class="limiter login a">
		
					<div class="container-login100 " style="background-image: url('/images/bg-01.jpg');">
		
					<div class="container-animation" style="background-color: white">
					<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
					<form class="login100-form validate-form "  action="<c:url value='/dangky' />" id="formSignup" method="post">
				
						<span class="login100-form-title p-b-49">
							Modist
						</span>
	
						<div class="wrap-input100 validate-input m-b-23" data-validate = "Ho va ten">
							<span class="label-input100">Nhập họ tên</span>
							<input class="input100" type="text" name="fullname" placeholder="Nhập tên tài khoản">
							<span class="focus-input100" data-symbol="&#xf206;"></span>
						</div>					
						<div class="wrap-input100 validate-input m-b-23" data-validate = "Tài khoản không hợp lệ">
							<span class="label-input100">Tên đăng nhập</span>
							<input class="input100" type="text" name="username" placeholder="Nhập tên đăng nhập">
							<span class="focus-input100" data-symbol="&#xf206;"></span>
						</div>
	
						<div class="wrap-input100 validate-input" data-validate="Mật khẩu không hợp lệ">
							<span class="label-input100">Mật khẩu</span>
							<input class="input100" type="password" name="password" placeholder="Nhập mật khẩu">
							<span class="focus-input100" data-symbol="&#xf190;"></span>
						</div>
						<br/>
						<div class="wrap-input100 validate-input" data-validate="Mật khẩu không hợp lệ">
							<span class="label-input100">Xác nhận lại mật khẩu</span>
							<input class="input100" type="password" name="password2" placeholder="Xác nhận mật khẩu">
							<span class="focus-input100" data-symbol="&#xf190;"></span>
						</div>
						<div class="text-right p-t-8 p-b-31">
							<a href="#">
								Quên mật khẩu?
							</a>
						</div>
						
						<div class="container-login100-form-btn">
							<div class="wrap-login100-form-btn">
								<div class="login100-form-bgbtn"></div>
								<input type="hidden" value="login" name="action"/>
								<button class="login100-form-btn" onclick="checkValidSignup(this.form)" type="submit">Đăng ký
									</button>
							</div>
						</div>
						
						<div class="txt1 text-center p-t-54 p-b-20">
							<span>
								Đăng ký?
							</span>
						</div>
	
						<div class="flex-c-m">
							<a href="#" class="login100-social-item bg1">
								<i class="fa fa-facebook"></i>
							</a>
	
							<a href="#" class="login100-social-item bg2">
								<i class="fa fa-twitter"></i>
							</a>
	
							<a href="#" class="login100-social-item bg3">
								<i class="fa fa-google"></i>
							</a>
						</div>
	
						<div class="flex-col-c p-t-155">
							<span class="txt1 p-b-17">
								Bạn đã có tài khoản?
							</span>
	
							<a href="login.html" onclick="openRegister()" class="txt2">
								Đăng nhập
							</a>
						</div>
				</form>
					</div>
			</div>
		</div>
		
	</div>
	

	<div id="dropDownSelect1"></div>
	<script  type="text/javascript" src="<c:url value='/templates/hudala/style/checksignup.js' />"></script>
</body>
</html>