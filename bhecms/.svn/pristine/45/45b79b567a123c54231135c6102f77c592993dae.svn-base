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

function toaddProInfo(){
	location.href = "/"+contextPath+"/admin/product/toaddProinfo.html";
}

function delProInfo(uuid){
	var uuids = [uuid];
	var entity = {};
	entity.id = 1;
	entity.name = "111";
	
	var list = new Array();
	list[0] = entity;
	list[1] = entity;
	
	var test = {};
	test.entitys = list;
	
	$.ajax({ 
		type: 'POST', 
		url: "/"+contextPath+"/admin/product/delProInfo.html" , 
		data: "uuids="+uuids+"&state=1&listmap="+test+"" , 
		dataType: "json",
		success:function(data) {   
			//跳转查询页面
			location.href = "/"+contextPath+"/admin/product/productManage.html";
		},    
		error : function(e) {    
			alert(e.status);    
		}   
	});
}

function proInfoToDustbin(uuid){
	var uuids = [uuid];
	
	$.ajax({ 
		type: 'POST', 
		url: "/"+contextPath+"/admin/product/delProInfo.html" , 
		data: "uuids="+uuids+"&state=0" , 
		dataType: "json",
		success:function(data) {   
			location.href = "/"+contextPath+"/admin/product/productManage.html";
		},    
		error : function(e) {    
			alert(e.status);    
		}   
	});
}


