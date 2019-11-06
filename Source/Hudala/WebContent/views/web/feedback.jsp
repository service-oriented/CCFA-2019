<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Phản hồi</title>
</head>
<body >
	
	<div class="hero-wrap hero-bread" style="background-image: url('/images/bg_6.jpg');">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
            <h1 class="mb-0 bread">Phản hồi</h1>
            <br/>
            <p class="breadcrumbs"><span class="mr-2"><a href="index.html">Về trang chủ</a></span> 
          </div>
        </div>
      </div>
       </div>
   

    <section class="ftco-section contact-section bg-light">
      <div class="container">
        <div class="row block-9">
          <div class="col-md-6 order-md-last d-flex">
            <form action="#" class="bg-white p-5 contact-form"  action="<c:url value='/phanhoi' />" id="feedback" method="post">
           
			
              <div class="form-group">
                <input type="text" class="form-control" name="username " placeholder="Tên đăng nhập">
              </div>             
			  <div class="form-group">
                <textarea name="title" id="title" cols="30" rows="3" class="form-control" placeholder="Tiêu đề"></textarea>
              </div>
              <div class="form-group">
                <textarea name="content" id="content" cols="30" rows="10" class="form-control" placeholder="Nội dung"></textarea>
              </div>
              <div class="form-group">
            	  <input type="hidden" value="feedback" name="action"/>
                <input type="submit" value="Send Message" class="btn btn-primary py-3 px-5">
              </div>
            </form>
          
          </div>
		   <div class="col-md-6 d-flex" >			
				<div class="row">
				<ul class="col-md-12" class="list-group">
					<li class="list-group-item text-muted" contenteditable="false">Thông tin của tôi</li>
					<li class="list-group-item text-right">
						<div class="row" class="form-group">
						<span style="padding-top: 11px;" class="col-md-5 pull-left"><strong class="">Tên tài khoản</strong></span>
						<input type="text" class="col-md-5 form-control" placeholder="Lan Cao" disabled>
						</div>
					</li>
					<li class="list-group-item text-right">
						<div class="row" class="form-group">
						<span style="padding-top: 11px;" class="col-md-5 pull-left"><strong class="">Email</strong></span>
						<input type="text" class="col-md-5 form-control" placeholder="ngoclan@gmail.com" disabled>
						</div>
					</li>
					<li class="list-group-item text-right">
						<div class="row" class="form-group">
						<span style="padding-top: 11px;" class="col-md-5 pull-left"><strong class="">Số điện thoại</strong></span>
						<input type="text" class="col-md-5 form-control" placeholder="0398154141" disabled>
						</div>
					</li>
				</ul>

		  
				<ul class="col-md-12" class="list-group">
					<li class="list-group-item text-muted">Hoạt động <i class="fa fa-dashboard fa-1x"></i>

					</li>
					<li class="list-group-item text-right">
						<div class="row" class="form-group">
						<span style="padding-top: 11px;" class="col-md-5 pull-left"><strong class="">Lượt Shares</strong></span>
						<input type="text" class="col-md-5 form-control" placeholder="32" disabled>
						</div>
					</li>
					<li class="list-group-item text-right">
						<div class="row" class="form-group">
						<span style="padding-top: 11px;" class="col-md-5 pull-left"><strong class="">Lượt Like</strong></span> 
						<input type="text" class="col-md-5 form-control" placeholder="17" disabled>
						</div>
					</li>
					<li class="list-group-item text-right">
						<div class="row" class="form-group">
						<span style="padding-top: 11px;" class="col-md-5 pull-left"><strong class="">Lượt Post</strong></span> 
						<input type="text" class="col-md-5 form-control" placeholder="3" disabled>
						</div>
					
					</li>
					<li class="list-group-item text-right">
						<div class="row" class="form-group">
						<span style="padding-top: 11px;" class="col-md-5 pull-left"><strong class="">Lượt Follower</strong></span> 
						<input type="text" class="col-md-5 form-control" placeholder="3" disabled>
						</div>
					
					</li>
				</ul>
				</div>
			
			</div>
			
         
         </div>

		 
      </div>
    </section>
		

    
    
	
</body>
</html>