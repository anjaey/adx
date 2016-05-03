/**
 * 登陆 验证插件
 * 作者：邓鹏
 * @date 2015-7-24
 */

;(function($){
	$.fn.extend({
		"loginValidate":function(o){
			var result=0;
			o=$.extend({
				unObj:null,//用户名对象
				regx:"",//验证规则  手机号码 mobile 或者 邮箱 email
				pwdObj:null,//密码对象
				rePwdObj:null,//重复密码对象
				loginUrl:null, //登陆验证 URL
				indexUrl:null// 登陆成功页面
			}, o || {});
			
			
			var login=function(){
				if(null==o.loginUrl||$.trim(o.loginUrl)==""){
					return;
				}
				if(null==o.indexUrl||$.trim(o.indexUrl)==""){
					return;
				}
				if(result==0){
					$.ajax({  
				    	url:o.loginUrl,
				    	type:'post',
						data:unObj.attr("name")+"="+unObj.val()+"&"+pwdObj.attr("name")+"="+pwdObj.val(),
					    async:false,
					    dataType:"json",
					    success:function (rea){
					    	if(rea.result==1){
					    		unErroMsg("用户或密码错误！");
					    	}else if(rea.result==3){
					    		pwdErrorMsg("用户名和密码错误！");
					    	}else{
					    		window.location.href=o.indexUrl;
					    	}
					    }
					});
				}
			}

			$(this).click(function(){
				result=0;
				validateUN();
				validatePwd();
				validateRpwd();
				login();//登陆方法
				
			});
			
			
			
			var unObj;
			var validateUN=function(){
				if(o.unObj!=null){
					unObj=$(o.unObj);
					var userName=$.trim(unObj.val());
					if(userName==""){
						unErroMsg("用户名不能为空!");
					}else {
						if(o.regx=="mobile"){
							var mRegx=/^0?(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$/ig;
							if(!mRegx.test(userName)){
								unErroMsg("请输入正确的手机号");
							}else{
								unErroMsg();
							}
						}else if(o.regx=="email"){
							var emailRegx=/^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?$/;
							if(!emailRegx.test(userName)){
								unErroMsg("请输入正确的邮箱");
							}else{
								unErroMsg();
							}
						}else{
							unErroMsg();
						}
					}
				}
				
			}
			
			var pwdObj={};
			var validatePwd=function(){
				if(o.pwdObj!=null){
					pwdObj=$(o.pwdObj);
					pwdObj.pwd=pwdObj.val();
					if(pwdObj.pwd==""){
						pwdErrorMsg("密码不能为空");
					}else{
					    var reg=/^(?![^a-zA-Z]+$)(?!\D+$).{6,16}$/;
					    if(!reg.test(pwdObj.pwd)){
						   pwdErrorMsg("密码是数字和字母的组合，长度为6-16位");
					    }else{
					    	pwdErrorMsg();
					    }
					}
				}
			}
			
			var repeatePwdObj={};
			var validateRpwd=function(){
				if(o.rePwdObj!=null){
					repeatePwdObj=$(o.rePwdObj);
					repeatePwdObj.rpwd=repeatePwdObj.val();
					if(pwdObj.pwd==repeatePwdObj.rpwd){
						rePwdErrorMsg();
					}else{
						rePwdErrorMsg("请确认重复密码");
					}
				}
			}
			
			/**
			 *  错误信息提示 
			 */
		
			var unErroMsg=function(text){
				if(text!=undefined){
					result++;
					unObj.next("span").text(text);
				}else{
					unObj.next("span").text("");
				}
			}
			
			var pwdErrorMsg=function(text){
				if(text!=undefined){
					result++;
					pwdObj.next("span").text(text);
				}else{
					pwdObj.next("span").text("");
				}
			}
			
			var rePwdErrorMsg=function(text){
				if(text!=undefined){
					result++;
					repeatePwdObj.next("span").text(text);
				}else{
					repeatePwdObj.next("span").text("");
				}
			}
			
		
		
		}
	})
})(jQuery);