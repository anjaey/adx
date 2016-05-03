/**
 * 
 * 产品品牌
 */

$(function(){
	//给标题加上背景色以及鼠标移动到某一行的事加上背景色
	$(".art_table tr:first-child").css("background-color",
	"#f3f7fb");
	$(".art_table tr:not(:first-child)").hover(function() {
		$(this).css("background-color", "#f3f7fb");
	}, function() {
		$(this).css("background-color", "#fff");
	});
	//切换选项卡							 
	$(".art_list_all>.artListAll001:not(:first-child)")
	.hide();
	$('.art_header ul li').click(
			function() {
				$(this).addClass('art_on').siblings()
				.removeClass('art_on');
				$(
						'.art_list_all>div:eq('
						+ $(this).index() + ')')
						.show().siblings().hide();
			});
	$(".art_header ul li:first-child").addClass("art_on");
})

function toaddProBrandInfo(){
	location.href = "/"+contextPath+"/admin/product/toaddProBrand.html";
}

//删除品牌信息
function delProBran(branNo){
	var uuids = [branNo];
	$.ajax({ 
		type: 'POST', 
		url: "/"+contextPath+"/admin/product/delProBrand.html" , 
		data: "nos="+uuids+"" , 
		dataType: "json",
		success:function(data) {   
			//跳转查询页面
			location.href = "/"+contextPath+"/admin/product/productBrandManage.html";
		},    
		error : function(e) {    
			alert(e.status);    
		}   
	});
}
