/*---------------------后台-------------------*/
/*sobox弹出框关闭*/
$(document).on("click", ".so-popbox .ss-close,.s-sopop-close", function() {
	$(".so-popbox").hide();
	$(".so-openmask").remove();
});
/* 全选/反选 */
$("input.js-chooseAll").change(function() {
	if ($(this).prop("checked")) {
		$("input.js-chooseInput").each(function() {
			$(this).prop("checked", !$(this).prop("checked"));
		})
	} else {
		$("input.js-chooseInput").each(function() {
			$(this).prop("checked", !$(this).prop("checked"));
		})
	}
});

/*用于导航栏的显示隐藏*/
$(document).ready(function() {
	$('.navNew li.mainlevel').mouseover(function() {
		$(this).find('.childUl').show();
	});
	$('.navNew li.mainlevel').mouseleave(function() {
		$(this).find('.childUl').hide();
	});
	/*去除最後一根橫線
	$('.childUl li:last-child').css("border-bottom","none");*/
});


function compabelMoveDiv(){
//$('.pop_title').css('cursor','move');
 	$('.pop_title').bind('mousedown',function (event) {
 		var obj = $(this).parents("div.winpop");
 		if(obj.css("display")==="block"){
 			var isMove = true;
             var abs_x = event.pageX - obj.offset().left;
             var abs_y = event.pageY - obj.offset().top;
             $(document).mousemove(function (event) {
                 if (isMove) {
                 	obj.fadeTo(20, 0.75);
                 	obj.offset({'left':((event.pageX - abs_x)<0?0:(event.pageX - abs_x)), 'top':((event.pageY - abs_y)<0?0:(event.pageY - abs_y))});
                  }
               }).mouseup(function () {
                   	isMove = false;
                   	if(obj.css("display")==="block"){
                   		obj.fadeTo(0, 1);
                   	}
                });
          }
 	});
}

//设置弹窗的弹出位置(全局)
function globalShowPop(obj,_top,_left){
	var top =(document.documentElement.scrollTop==0?document.body.scrollTop:document.documentElement.scrollTop)+(_top!=undefined?_top:document.body.clientHeight*0.5-$(obj).height()*0.5); //弹出位置
	var left=(_left!=undefined)?_left:(document.body.clientWidth*0.5-$(obj).width()*0.5);
	$(obj).css({top:top,left:left,position:"absolute","z-index":"1101"});   //设置div在文档中的位置
	createMaskDiv();//创建遮罩层
	$(obj).show();
}
	    
function globalClosePop(obj){
	//document.body.removeChild(document.getElementById("maskDIV"));
	$(obj).hide();
	$("#maskDIV").remove();
}

//遮罩层
function createMaskDiv() { 
    if ($("#maskDIV").length>0) document.body.removeChild(document.getElementById("maskDIV"));
	//mask遮罩层
    var newMask = document.createElement("div");
    newMask.id = "maskDIV";
    newMask.style.position = "absolute";
    newMask.style.zIndex = "100";
    _scrollWidth = Math.max(document.body.scrollWidth,document.body.clientWidth, document.documentElement.scrollWidth,document.documentElement.clientWidth);
    _scrollHeight = Math.max(document.body.scrollHeight,document.body.clientHeight, document.documentElement.scrollHeight,document.documentElement.clientHeight);
    newMask.style.width = _scrollWidth + "px";
    newMask.style.height = _scrollHeight + "px";
    newMask.style.top = "0px";
    newMask.style.left = "0px";
    newMask.style.background = "#272727";
    newMask.style.filter = "alpha(opacity=60)";
    newMask.style.opacity = "0.6";
    document.body.appendChild(newMask);
}

Date.prototype.format = function(format){
	 var o = {
		 "M+" : this.getMonth()+1, //month
		 "d+" : this.getDate(), //day
		 "h+" : this.getHours(), //hour
		 "m+" : this.getMinutes(), //minute
		 "s+" : this.getSeconds(), //second
		 "q+" : Math.floor((this.getMonth()+3)/3), //quarter
		 "S" : this.getMilliseconds() //millisecond
	 }

	 if(/(y+)/.test(format)) {
			 format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
	 }

	 for(var k in o) {
		 if(new RegExp("("+ k +")").test(format)) {
			 format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length));
		 }
	 }
	 return format;
} 
Date.prototype.defaultformat = function(){
var format ="yyyy-M-d hh:mm:ss";
	 var o = {
		 "M+" : this.getMonth()+1, //month
		 "d+" : this.getDate(), //day
		 "h+" : this.getHours(), //hour
		 "m+" : this.getMinutes(), //minute
		 "s+" : this.getSeconds(), //second
		 "q+" : Math.floor((this.getMonth()+3)/3), //quarter
		 "S" : this.getMilliseconds() //millisecond
	 }

	 if(/(y+)/.test(format)) {
			 format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
	 }

	 for(var k in o) {
		 if(new RegExp("("+ k +")").test(format)) {
			 format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length));
		 }
	 }
	 return format;
} 

/*展开关闭图片样式*/
$(".js_changImg").click(function(){
	$(".js_changImg").toggleClass("similarityImg");
	$(".buy_rUl").toggle();
});
$(".navLeftUlLi").click(function(){
	$(".openclose").toggleClass("openclosechange");
});
