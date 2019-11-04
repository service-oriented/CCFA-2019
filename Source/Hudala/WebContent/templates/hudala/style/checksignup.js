
(function ($) {
    "use strict";


    /*==================================================================
    [ Focus input ]*/
    $('.input100').each(function(){
        $(this).on('blur', function(){
            if($(this).val().trim() != "") {
                $(this).addClass('has-val');
            }
            else {
                $(this).removeClass('has-val');
            }
        })    
    })
  
  
    /*==================================================================
    [ Validate ]*/
    var input = $('.label-input100 .input100');

    $('.validate-form').on('submit',function(){
        var check = true;

        for(var i=0; i<input.length; i++) {
            if(validate(input[i]) == false){
                showValidate(input[i]);
                check=false;
            }
        }

        return check;
    });


    $('.validate-form .input100').each(function(){
        $(this).focus(function(){
           hideValidate(this);
        });
    });

    function validate (input) {
        if($(input).attr('type') == 'text' || $(input).attr('name') == 'username') {
            if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
                return false;
            }
        }
        else {
            if($(input).val().trim() == ''){
                return false;
            }
        }
    }

    function showValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }

    function hideValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
    }
    
    /*==================================================================
    [ Show pass ]*/
    var showPass = 0;
    $('.btn-show-pass').on('click', function(){
    	 if(showPass == 0) {
             $(this).next('input').attr('type','text');
             $(this).find('i').removeClass('zmdi-eye');
             $(this).find('i').addClass('zmdi-eye-off');
             showPass = 1;
         }
    	 else
        if(showPass == 1) {
            $(this).next('input').attr('type','text');
            $(this).find('i').removeClass('zmdi-eye');
            $(this).find('i').addClass('zmdi-eye-off');
            showPass = 2;
        }
        else if(showPass == 2){
            $(this).next('input').attr('type','password');
            $(this).find('i').addClass('zmdi-eye');
            $(this).find('i').removeClass('zmdi-eye-off');
            showPass = 3;
        }
        else if(showPass == 3){
            $(this).next('input').attr('type','password');
            $(this).find('i').addClass('zmdi-eye');
            $(this).find('i').removeClass('zmdi-eye-off');
            showPass = 0;
        }
        
    });


})(jQuery);



// các xử lý kịch bản cho login.html

function checkValidLogin(fn){
	//lấy thông tin đăng nhập
	var username = fn.username.value;
	var userpass = fn.password.value;

	
	//biến xác nhận sự hợp lệ của giá trị
	var validUserName = true;
	var validUserPass = true;
	//biến ghi nhận thông báo
	var message = "";
	//kiểm tra tên đăng nhập
	username = username.trim();//cắt bỏ khoảng trống đầu và cuối
	if(username == ""){
		validUserName = false;
		message = "Thiếu tên đăng nhập vào hệ thống.";
		
	}else{
		if(username.indexOf(" ")!=-1){
			validUserName = false;
			message = "tên đăng nhập có dấu cách.";
		}else if(username.length>30){
			validUserName = false;
			message = "Tên đăng nhập quá dài. Cần nhỏ hơn 30 ký tự.";
			
		}else{
			//khai báo cấu trúc hộp thư
			//var parttern = /\w + @\w + [.]\w/;
			var parttern = /^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/;
			if(username.indexOf("@")!=-1){
				if(!username.match(parttern)){
					validUserName = false;
					message = "Không đúng cấu trúc hộp thư.";
					
				}
			}
		}
	}
	
	//kiểm tra mật khẩu
	userpass = userpass.trim();
	if(userpass == ""){
		validUserPass = false;
		message +="\nThiếu mật khẩu vào hệ thống.";
		
	}else{
		if(userpass.length<6){
			validUserPass = false;
			message += "\nMật khẩu không hợp lệ.";
		}
			
	}
	
	//Thông báo kết quả kiểm tra
	if(message!=""){
		//Hiển thị 
		window.alert(message);
		//di chuyển con trỏ vào vị trí lỗi
		//theo thứ tự TRÁI-->PHẢI; TRÊN--->DƯỚI
		if(!validUserName){
			fn.email.focus();
			fn.pass.select();
		}else if(!validUserPass){
			fn.pass.focus();
			fn.pass.select();
		}
			
	}
		
	//trả về kết quả
	return validUserName && validUserPass;
	
}
function checkValidSignup(fn){
	var fullname   =fn.fullname.value;
	var username = fn.username.value;
	var userpass = fn.password.value;
	var userpass2 = fn.password2.value;

	
	//biến xác nhận sự hợp lệ của giá trị
	var validFullName = true;
	var validUserName = true;
	var validUserPass = true;

	//biến ghi nhận thông báo
	var message = "";
	//kiem tra ten tai khoan
	fullname=fullname.trim();
	if(fullname == ""){
		validFullName = false;
		message = "Bạn chưa nhập tên tài khoản";
		
	}else if(username.length>50){
		validFullName = false;
			message = "Tên tài khoản quá dài. Cần nhỏ hơn 50 ký tự.";
			
		}
	
	//kiểm tra tên đăng nhập
	username = username.trim();//cắt bỏ khoảng trống đầu và cuối
	if(username == ""){
		validUserName = false;
		message = "Bạn chưa nhập tên đăng nhập";
		
	}else{
		if(username.indexOf(" ")!=-1){
			validUserName = false;
			message = "Tên đăng nhập có dấu cách.";
		}else if(username.length>30){
			validUserName = false;
			message = "Tên đăng nhập quá dài. Cần nhỏ hơn 30 ký tự.";
			
		}
	}
	
	//kiểm tra mật khẩu
	userpass = userpass.trim();
	if(userpass == ""){
		validUserPass = false;
		message +="\nBạn chưa nhập mật khẩu.";
		
	}else{
		if(userpass.length<6){
			validUserPass = false;
			message += "\nMật khẩu không hợp lệ.";
		}
			
	}
	//kiểm tra mật khẩu 2
	userpass2 = userpass2.trim();
	if(userpass2.equal(userpass)!=0){
		validUserPass = false;
		message += "\nXác nhận mật khẩu không chính xác";
	}
	
	//Thông báo kết quả kiểm tra
	if(message!=""){
		//Hiển thị 
		window.alert(message);
		//di chuyển con trỏ vào vị trí lỗi
		//theo thứ tự TRÁI-->PHẢI; TRÊN--->DƯỚI
		if(!validFullName){
			fn.email.focus();
			fn.pass.select();
		}
		if(!validUserName){
			fn.email.focus();
			fn.pass.select();
		}else if(!validUserPass){
			fn.pass.focus();
			fn.pass.select();
		}
			
	}
		
	//trả về kết quả
	return validUserName && validUserPass && validFullName;
	
	
}