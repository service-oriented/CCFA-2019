 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Tài khoản của tôi</title>
</head>
<body>

   <div class="container">
<div class="row">
<div class="col-md-10 ">
<form class="form-horizontal"  action="<c:url value='/taikhoanuser' />" id="userProfile" method="post">
<fieldset>

<legend>Hồ sơ của tôi</legend>
<div class="form-group">
  <label class="col-md-4 control-label" for="Name (Full name)" >Họ tên</label>  
  <div class="col-md-4">
 <div class="input-group">
       <div class="input-group-addon">
        <i class="fa fa-user">
        </i>
       </div>   
          <c:if test="${not empty GUEST.fullName}">    
      	 <input id="fullname" name="fullName" type="text" value="${GUEST.fullName}" class="form-control input-md"  >
    	  </c:if>
    	   <c:if test="${ empty GUEST.fullName}">  	
    	   <input id="fullname" name="fullName" type="text" placeholder="Họ tên" class="form-control input-md"  >
       </c:if>
      </div>    
  </div>  
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="Upload photo">Ảnh</label>
  <div class="col-md-4">
  	<c:if test="${not empty GUEST.image}">  
    <input id="Upload photo" name="Upload photo" value="${GUEST.image}"  class="input-file"  type="file">
    </c:if>
     <c:if test="${ empty GUEST.image}">  
      <input id="Upload photo" name="Upload photo"   class="input-file"  type="file">
     </c:if>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Date Of Birth">Ngày sinh</label>  
  <div class="col-md-4">
  <div class="input-group">
       <div class="input-group-addon">
     <i class="fa fa-birthday-cake"></i>
        
       </div>
       <c:if test="${not empty GUEST.birth }">  
       <input id="datebirth" name="birth" type="text" value="${GUEST.birth}" class="form-control input-md">
       </c:if>
       <c:if test="${ empty GUEST.birth}">  
        <input id="datebirth" name="birth" type="text" placeholder="YYYY-MM-DD" class="form-control input-md">
       </c:if>
      </div>
  
    
  </div>
</div>

<!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="Gender">Giới tính</label>
  <div class="col-md-4"> 
  <c:if test="${not empty GUEST.gender}">  
    <c:if test="${GUEST.gender==true}">
	    <label class="radio-inline" for="Gender-0">
	      <input type="radio" name="gender" id="gender-0" value="1" checked="checked">
	      Nam
	    </label> 
	      <label class="radio-inline" for="Gender-1">
	      <input type="radio" name="gender" id="gender-1" value="2" >
	      Nữ
	    </label>  
    </c:if>    
    <c:if test="${GUEST.gender==false}">
     <label class="radio-inline" for="Gender-0">
		      <input type="radio" name="gender" id="gender-0" value="1" >
		      Nam     
	    </label>  
	    <label class="radio-inline" for="Gender-1">
	      <input type="radio" name="gender" id="gender-1" value="2"  checked="checked">
	      Nữ
	    </label>  
   </c:if>
      </c:if>
      <c:if test="${empty GUEST.gender}">      
		 <label class="radio-inline" for="Gender-0">
		      <input type="radio" name="gender" id="gender-0" value="1" >
		      Nam     
	    </label>    
     
	    <label class="radio-inline" for="Gender-1">
	      <input type="radio" name="gender" id="gender-1" value="2" >
	      Nữ
	    </label>    
    
      </c:if>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Phone number ">Số điện thoại </label>  
  <div class="col-md-4">
      <div class="input-group othertop">
       <div class="input-group-addon">
     <i class="fa fa-mobile fa-1x" style="font-size: 20px;"></i>
        
       </div>
       <c:if test="${not empty GUEST.phone}">  
    <input id="Phone number " name="phone" type="text" value="${GUEST.phone } " class="form-control input-md">
    </c:if>
    <c:if test="${empty GUEST.phone}">
     <input id="Phone number " name="phone" type="text"  placeholder="Số điện thoại "  class="form-control input-md">
   
    </c:if>
   
      </div>
  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Email Address">Email</label>  
  <div class="col-md-4">
  <div class="input-group">
       <div class="input-group-addon">
     <i class="fa fa-envelope-o"></i>
        
       </div>
       <c:if test="${not empty GUEST.email}">  
    <input id="Email Address" name="email" type="text" value="${GUEST.email }" class="form-control input-md">
    </c:if>
    <c:if test="${ empty GUEST.email}">  
     <input id="Email Address" name="email" type="text" placeholder="Email" class="form-control input-md">
  
       </c:if>
      </div>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="License No.">Facebook</label>  
  <div class="col-md-4">
  <div class="input-group">
       <div class="input-group-addon">
     <i class="fa fa-sticky-note-o"></i>        
       </div>
       <c:if test="${not empty GUEST.link}">    
	<input id="link" name="link" type="text" value="${GUEST.link }" class="form-control input-md">
	</c:if>
	  <c:if test="${ empty GUEST.link}">
	  <input id="link" name="link" type="text"	placeholder="Facebook" class="form-control input-md">
	  </c:if>
	</div>
 
    
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Skills">Công việc</label>  
  <div class="col-md-4">
  <div class="input-group">
       <div class="input-group-addon">
     <i class="fa fa-graduation-cap"></i>
        
       </div>
       <c:if test="${not empty GUEST.job}">  
     <input id="Skills" name="job" type="text" value="${GUEST.job }" class="form-control input-md">
     </c:if>
     <c:if test="${ empty GUEST.job}">  
      <input id="Skills" name="job" type="text" placeholder="Công việc" class="form-control input-md">
 
       </c:if>
      </div>
 
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label col-xs-12" for="Permanent Address">Chiều cao</label>  
  <div class="col-md-2  col-xs-4">
  <c:if test="${not empty GUEST.height}">  
  <input id="height" name="height" type="text" value="${GUEST.height }" class="form-control input-md ">
  </c:if>
  <c:if test="${ empty GUEST.height}">  
   <input id="height" name="height" type="text" placeholder="Chiều cao" class="form-control input-md ">
 
       </c:if> 
  
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label col-xs-12" for="Permanent Address">Cân nặng</label>  
  <div class="col-md-2  col-xs-4">
  <c:if test="${not empty GUEST.weight}">  
  <input id="weight" name="weight" type="text" value="${GUEST.weight }" class="form-control input-md ">
  </c:if>
  <c:if test="${ empty GUEST.weight}"> 
   <input id="weight" name="weight" type="text" placeholder="Cân nặng" class="form-control input-md ">
  
       </c:if>
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" for="Father">Sở thích</label>  
  <div class="col-md-4">
  <div class="input-group">
       <div class="input-group-addon">
      <i class="fa fa-male" style="font-size: 20px;"></i>        
       </div>
       <c:if test="${not empty GUEST.favorite }">  
      <input id="favorite" name="favorite" type="text" value="${GUEST.favorite }" class="form-control input-md">
		</c:if>
		<c:if test="${ empty GUEST.favorite }"> 
		 <input id="favorite" name="favorite" type="text" placeholder="Sở thích" class="form-control input-md">
	 
       </c:if>
      </div>    
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label col-xs-12" for="Permanent Address">Body</label>  
  <div class="col-md-2  col-xs-2">
  <c:if test="${not empty GUEST.body}">  
  <input id="body_1" name="body_1" type="text" value="${GUEST.body.substring(0,2) }"  class="form-control input-md ">
  </c:if>
  <c:if test="${ empty GUEST.body}">  
  <input id="body_1" name="body_1" type="text" placeholder="Vòng 1" class="form-control input-md ">  
       </c:if>
  </div>
  
  <div class="col-md-2 col-xs-2">
	<c:if test="${not empty GUEST.body}">  
  <input id="body_2" name="body_2" type="text" value="${GUEST.body.substring(2,4) }"  class="form-control input-md ">
	</c:if>
	<c:if test="${ empty GUEST.body}">
	<input id="body_2" name="body_2" type="text" placeholder="Vòng 2" class="form-control input-md ">	  
       </c:if>
  </div>
 <div class="col-md-2 col-xs-2">
 <c:if test="${not empty GUEST.body}">  
  <input id="body_3" name="body_3" type="text" value="${GUEST.body.substring(4,6) }" class="form-control input-md ">
  </c:if>
  <c:if test="${ empty GUEST.body}">  
  <input id="body_3" name="body_3" type="text" placeholder="Vòng 3" class="form-control input-md "> 
       </c:if>
  </div>  
</div>


<div class="form-group">
  <label class="col-md-4 control-label col-xs-12" for="Permanent Address">Màu tóc</label>  
  <div class="col-md-2  col-xs-4">
  <c:if test="${not empty GUEST.hairColor}">  
  <input id="Permanent Address" name="hairColor" type="text" value="${ GUEST.hairColor}" class="form-control input-md ">
 </c:if>
 <c:if test="${ empty GUEST.hairColor}">  
 <input id="Permanent Address" name="hairColor" type="text" placeholder="Màu tóc" class="form-control input-md ">
 
       </c:if>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label col-xs-12" for="Permanent Address">Màu da</label>  
  <div class="col-md-2  col-xs-4">
  <c:if test="${not empty GUEST.skinColor}">  
  <input id="skinColor" name="skinColor" type="text" value="${GUEST.skinColor }" class="form-control input-md ">
 </c:if>
 <c:if test="${ empty GUEST.skinColor}">  
  <input id="skinColor" name="skinColor" type="text" placeholder="Màu da" class="form-control input-md ">
 
       </c:if>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label col-xs-12" for="Permanent Address">Kiểu dáng mặt</label>  
  <div class="col-md-2  col-xs-4">
  <c:if test="${not empty GUEST.faceShape}">  
  <input id="faceShape" name="faceShape" type="text" value="${GUEST.faceShape }" class="form-control input-md ">
  </c:if>
  <c:if test="${ empty GUEST.faceShape}">  
  <input id="faceShape" name="faceShape" type="text" placeholder="Kiểu dáng mặt" class="form-control input-md ">
        </c:if>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label col-xs-12" for="Permanent Address">Kiểu môi</label>  
  <div class="col-md-2  col-xs-4">
  <c:if test="${not empty GUEST.lipThickness}">  
  <input id="lipThickness" name="lipThickness" type="text" value="${GUEST.lipThickness }" class="form-control input-md ">
  </c:if>
  <c:if test="${ empty GUEST.lipThickness}">  
   <input id="lipThickness" name="lipThickness" type="text" placeholder="Kiểu môi" class="form-control input-md ">
  
       </c:if>
  </div>
</div>
<!-- Text input-->


</div>

<!-- Textarea -->

<br/>
<br/>

								
<div class="form-group">
  <label class="col-md-4 control-label" ></label>  
  <div class="col-md-4">
  <input type="hidden" value="userProfile" name="action"/>  
	<button class="btn btn-success" type="submit" ><span class="glyphicon glyphicon-thumbs-up"></span> Cập nhật
	</button> 
   <a href='<c:url value="/thoat?action=logoutUser"/>' class="btn btn-danger" ><span class="glyphicon glyphicon-remove-sign"></span>Thoát</a>
       
           
  </div>
</div>

</fieldset>
</form>
</div>


</div>
   </div>
    <!-- jQuery Version 1.11.1 -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>


</body>
</html>