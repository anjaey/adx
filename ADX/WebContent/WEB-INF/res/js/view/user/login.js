/**
 * 用户登录 
 */

$(function(){


});

/**
 * 登录
 */
function login() {
	var param = {};
	param.username = $("#js-username").val();
	param.pwd = $("#js-pwd").val();

	$.ajax({
		type: "POST",
		url: "${base}/view/user/login",
		data: param,
		dataType: "json",
		success: function(data){
			if (data.state == 0) {
				alert("登录失败, 账号密码错误！");
			}

			if (data.state == 1) {
				alert("登录成功");
				location.href = "/";
			}
		}
	});
}
