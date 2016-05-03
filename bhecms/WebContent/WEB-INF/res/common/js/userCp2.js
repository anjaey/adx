/* 
 * 作者:李春燕
 * 时间:2015-07-10
 * 轮播插件
 * 功能:一：根据时间轮播，二：根据带数字小圆点轮播以及不带数字的小圆点轮播，三：根据上下翻页轮播
 * 参数：autoSlideTime轮播时间,单毫秒, 1000毫秒等于1秒, 自动切换时间
	   slideTime 效果时间,fadeOut和fadeIn的时间（slideUp，slidedown的时间）
	   startIndex, 图片的起始位置
	   slideClass"元素的类
	   isShowTitle 是否显示标题
	   titleLen :标题的长度
 * 方法：init();初始化方法
 	   mainChange（）：轮播的主要方法
 	   showTitle（）：展示标题
	   prev():上一页
	   next():下一页
 * 备注：“data-title”是自定义属性，意义：展示的标题值
 		js所需样式
 		"prepageon":上下翻页透明度
		“cirOn”：小圆点背景色
 */
;(function ($){
	$.fn.show = function (option){
		var opts = $.extend({
			autoSlideTime:3000, // 轮播时间,单毫秒, 1000毫秒等于1秒, 自动切换时间
			slideTime:500,	// 效果时间,fadeOut和fadeIn的时间
			startIndex :0,// 图片的起始位置
			slideClass:".changeObj",// 元素的类
			bannerNum:".bannerNum",// 小圆点的类
			isShowTitle:true,	// 是否显示标题
			isShowBannerNum:true,// 是否展示小圆点
			titleLen:8,// 标题的长度，长于8个字符串就截取前面8个展示出来
			bannerTitleClass:".bannerTitle",// 展示标题的类
			bannerClass:".banner",// 轮播的整个框架
			prevClass:".prev",// 上一页按钮
			nextClass:".next",// 下一页按钮
			prepageClass:".prepage",// 上下 翻页类
			animateType:2,	// 目前提供三种动画类型 0 普通淡入淡出 1 上下翻页 2左右移动动画
		},option);
		
		return this.each(function (i, obj){
			alert(1);
						

		});

	};
},(jQuery));



/*
 * init();// 初始化
 * 
 * function init() { // 初始化展示第一个图片的“data-title”属性 showTitle(nowIndex);
 * 
 * if (opts.animateType == 2) { $(opts.slideClass).css({"float":"left", "width":
 * sWidth + "px", "height": sHeight + "px"}); animateBox = $("<div
 * class='animateBox'>").appendTo(bannerList);
 * bannerListObj.clone(true).appendTo(animateBox); bannerListObj.remove();
 * 
 * bannerListObj = animateBox.find(opts.slideClass);
 * animateBox.css({"position":"absolute", "width": sWidth * bannerListLen +
 * "px", "height":sHeight + "px"}); } else { // 隐藏列表所有对象, 顺序显示时采用全部隐藏显示
 * bannerListObj.hide().eq(opts.startIndex).show();// 把第一张图片展示出来
 * $(opts.prepageClass).hide();// 初始化把翻页按钮隐藏 } }
 * 
 * if(opts.isShowBannerNum){ // 循环创建小圆点 var numClassUl = $(bannerNum).append("<ul></ul>");
 * for(var j=1;j<=bannerListLen;j++){ numClassUlchild =
 * numClassUl.children().append("<li></li>"); }
 * numClassUlchild.children().eq(opts.startIndex).addClass("cirOn");//
 * 给从几个小圆点开始添加背景
 *  // 给小圆点添加点击事 $(numClassUlchild.children()).click(function(){ index =
 * numClassUlchild.children().index(this); showTitle(index); mainChange(); }); }
 *  // 下一页点击事件 $(opts.nextClass).click(function(){ index = (nowIndex + 1) %
 * bannerListLen; mainChange(); });
 *  // 上一页点击事件 $(opts.prevClass).click(function(){ index = index == 0 ?
 * bannerListLen - 1 : index - 1; mainChange(); });
 *  // 自动轮播图片 timeInter=setInterval(function(){ index = (nowIndex + 1) %
 * bannerListLen;// 取模，即：整除后的余数 mainChange(); },opts.autoSlideTime);
 * 
 *  // 鼠标浮动到轮播框上的时候，翻页按钮展示出来,以及图片停止轮播，当鼠标移开的时候图片继续轮播
 * $(opts.bannerClass).hover(function(){ $(opts.prepageClass).show();
 * clearInterval(timeInter); },function(){ $(opts.prepageClass).hide();
 * timeInter= setInterval(function(){ index = (nowIndex + 1) % bannerListLen;
 * mainChange(); },opts.autoSlideTime); });
 *  // 改变上下翻页的透明度 $(opts.prevClass).hover(function(){
 * $(this).addClass("prepageon"); },function(){
 * $(this).removeClass("prepageon"); }); $(opts.nextClass).hover(function(){
 * $(this).addClass("prepageon"); },function(){
 * 
 * $(this).removeClass("prepageon"); });
 * 
 *  //
 * -----------------------------------------方法集锦----------------------------------------
 * 
 * 
 *  // 轮播主要的方法 function mainChange(){ var nowLeft = -index*sWidth;
 * //根据index值计算ul元素的left值
 * 
 * if (nowIndex != index) { // 上下切换 有效果的切换,原始切换，淡入淡出:fadeOut,fadeIn
 * console.log(opts.animateType); switch (opts.animateType) { case 0: // 淡入淡出
 * bannerListObj.eq(nowIndex).fadeOut(opts.slideTime);
 * bannerListObj.eq(index).fadeIn(opts.slideTime); break; case 1: // 上下翻页
 * bannerListObj.eq(nowIndex).slideUp(opts.slideTime);
 * bannerListObj.eq(index).slideDown(opts.slideTime); break; case 2:
 * animateBox.animate({left:nowLeft},opts.slideTime); break; default: // 淡入淡出
 * bannerListObj.eq(nowIndex).fadeOut(opts.slideTime);
 * bannerListObj.eq(index).fadeIn(opts.slideTime); }
 *  // 小圆点 if(opts.isShowBannerNum){
 * numClassUlchild.children().eq(index).addClass("cirOn").siblings().removeAttr("class"); }
 *  // 是否显示标题 if (opts.isShowTitle) { showTitle(index); } nowIndex = index; } }
 *  // 展示标题，如果标题为空就传一个空的字符串，如果不为空就展示自定义函数data-title function showTitle(_index) {
 * if(opts.isShowTitle){ var nowTitle =
 * bannerListObj.eq(_index).attr("data-title"); //
 * 如果展示的标题长度大于八个字符串，那么截取前面五个字符串展示出来，但是鼠标移动到标题上面的时候，标题全部展示出来
 * $(opts.bannerTitleClass).attr("title",nowTitle);// 给标题层添加title属性
 * if(nowTitle.length>opts.titleLen){ nowTitle =
 * nowTitle.substring(0,opts.titleLen); }
 * $(opts.bannerTitleClass).html(nowTitle); } else{
 * $(opts.bannerTitleClass).html(""); } }
 */






