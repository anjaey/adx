<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="res/common/js/ueditor/third-party/video-js/video-js.min.css" />
<script type="text/javascript" src="${base}/res/common/js/jquery/jquery-1.11.3.min.js"></script>
<script>
	$(function(){
		console.log("JSP==============")
		var reqParam = {};
		reqParam.userName = "testpost";
		
		$.post("ajaxtest.html", reqParam, function(reData){
			console.log(">>>>>>>>>" + reData);
		}, "json");
		// jquery end;
	});
</script>
</head>
<body>
1111111111111

<div>
<%-- ${list} --%>
</div>


<div align="center">
	<h1>Ueditor-demo</h1>
    <script id="editor" type="text/plain" style="width:1024px;height:500px;"></script>
</div>



<!-- ckplayer -->

<div>CkPlayer</div>

<div id="a1" align="center"></div>

<script type="text/javascript" src="res/common/js/ckplayer/ckplayer/ckplayer.js" charset="utf-8"></script>
<script type="text/javascript">
	var flashvars={
		f:'http://movie.ks.js.cn/flv/other/1_0.flv',
		c:0,
		b:1
		};
	/*
	 * f:播放文件地址
	 */
	var params={bgcolor:'#FFF',allowFullScreen:true,allowScriptAccess:'always',wmode:'transparent'};
	CKobject.embedSWF('res/common/js/ckplayer/ckplayer/ckplayer.swf','a1','ckplayer_a1','960','700',flashvars,params);
	/*
	CKobject.embedSWF(播放器路径,容器id,播放器id/name,播放器宽,播放器高,flashvars的值,其它定义也可省略);
	下面三行是调用html5播放器用到的
	*/
	var video=['http://movie.ks.js.cn/flv/other/1_0.mp4->video/mp4','http://www.ckplayer.com/webm/0.webm->video/webm','http://www.ckplayer.com/webm/0.ogv->video/ogg'];
	var support=['iPad','iPhone','ios','android+false','msie10+false'];
	CKobject.embedHTML5('a1','ckplayer_a1',600,400,video,flashvars,support);
	
	/* ckplayer-->ck--->logo='null'	去掉右上角图标 */
	/* ckplayer-->ck--->setp第九个参数设置为0 关闭滚动文本
		9、是否开启滚动文字广告，0是不开启，1是开启且不使用关闭按钮，2是开启并且使用关闭按钮，开启后将在加载视频的时候加载滚动文字广告
	*/
	
	function closelights(){//关灯
		alert(' 本演示不支持开关灯');
	}
	function openlights(){//开灯
		alert(' 本演示不支持开关灯');
	}
  </script>
  








</body>
<!-- 导入Ueditor需要的JS -->
<script type="text/javascript" charset="utf-8" src="res/common/js/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="res/common/js/ueditor/ueditor.all.js"> </script>
<script type="text/javascript" src="res/common/js/ueditor/third-party/video-js/video.js"></script>


<script type="text/javascript">
	//实例化编辑器
	var ue = UE.getEditor('editor');
	 // editor准备好之后才可以使用
	ue.addListener("ready", function () {
        ue.setContent("<p>测试赋值,测试ok</p>",true);
	});
</script>

</html>