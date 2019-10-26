

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!-- header -->
    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container">
	      <a class="navbar-brand" href="#">Hudala</a>
	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="oi oi-menu"></span> Menu
	      </button>


	      <div class="collapse navbar-collapse" id="ftco-nav">
	        <ul class="navbar-nav ml-auto">
	          <li class="nav-item active"><a href="#" class="nav-link">Trang chủ <span class="sr-only">(current)</span></a>
	           </li>
	          
	          <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Sưu tập</a>
              <div class="dropdown-menu" aria-labelledby="dropdown04">
              	<a class="dropdown-item" href="map.html">Phối đồ</a>
                <a class="dropdown-item" href="shop.html">Trang điểm</a>
              
              </div>
            </li>
	          <li class="nav-item"><a href="advisory.html" class="nav-link">Tư vấn</a></li>
	          <li class="nav-item"><a href="feedback.html" class="nav-link">Phản hồi</a></li>
	           
	          <c:if test="${not empty ACCOUNT}">    
 					<li class="nav-item dropdown">              		
						<a class="nav-link" href="#" id="navbarDropdown"> ${ACCOUNT.username}</a>					
						<div class="dropdown-content">
						  <a class="dropdown-item" name="${ACCOUNT.username}" href='<c:url value="/taikhoanuser?action=taikhoanuser"/>'>Hồ sơ của tôi</a>          
						  <a class="dropdown-item" id="menucaphai" href='<c:url value="/thoat?action=logout"/>'>Đăng xuất</a>
						  </div>
			 		 </li>	
              		
              		
              	 </c:if>
            <c:if test="${empty ACCOUNT}">
              <li class="nav-item unhuda"><a href='<c:url value="/dang-nhap?action=login"/>'class="nav-link">Đăng nhập</a></li>
               <li class="nav-item unhuda"><a href='<c:url value="/dangky?action=signup"/>'class="nav-link">Đăng ký</a></li>
            
            </c:if>
            
	        </ul>
	      </div>
	    </div>
	  </nav>
    <!-- END nav -->