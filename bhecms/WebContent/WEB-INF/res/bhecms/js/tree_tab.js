/*
 * 格式
 * Map<String, List<实体类>>
 * 实体类中必须包含uuid[id],namecn[名称]
 * map中string类型的key是调用时的top
 * 
 * 引用方式
 * 	$(this).tree({
 * 		url: 	'${base}/admin/article/getAllArticleSection.html',
 * 		top:	'0',
 * 		select:	'js_select',
 * 	});
 * 
 * */
;
(function($) {
	$.fn.tree = function(op) {
		var op = $.extend({
			clazz : null, // 需要点击才显示，为null这自动加载
			url : null, // 数据来源的url
			top : null, // 顶级节点
			select : null, // select标签class
			isselect : false, // 父节点是否可以选择	默认不能选择
			symbol : "—", // 层级符号 默认为中文短横线[—]
			istop:false, // 是否需要顶级目录默认不显示
		}, op || {});
		var m;
		if (op.clazz == null) {
			ajax_select();
		} else {
			$("." + op.clazz).click(function() {
				ajax_select();
			});
		}

		function ajax_select() {
			$.ajax({
				url : op.url,
				type : 'POST',
				data : {
					top : op.top
				},
				dataType : 'json',
				async:false,
				success : function(data) {
					m = 0;
					if(op.isselect == false){
						if(op.istop){
							$("." + op.select + "").append("<option value='0' disabled='disabled' style='font-weight: bold;'>顶级</option>");
						}
						tree(data, op.top);
					}else {
						if(op.istop){
							$("." + op.select + "").append("<option value='0' style='font-weight: bold;'>顶级</option>");
						}
						tree_select(data, op.top);
					}
				},
				error : function() {
					console.log("未请求到数据");
				}
			});
		}

		function tree(data, top) {
			$.each(data, function(key, value) {
				$.each(value, function(index, val) {
					if (key == top) {
						m++;
						if (data[val.id] != undefined) {
							$("." + op.select + "").append("<option value='"+val.id+"' disabled='disabled' style='font-weight: bold;'>" + line(m, op.symbol) + val.namecn + "</option>");
						} else {
							$("." + op.select + "").append("<option value='"+val.id+"' >" + line(m, op.symbol) + val.namecn + "</option>");
						}
						tree(data, val.id);
					}
				});
			});
			m--;
		}
		
		function tree_select(data, top) {
			$.each(data, function(key, value) {
				$.each(value, function(index, val) {
					if (key == top) {
						m++;
						$("." + op.select + "").append("<option value='"+val.id+"' >" + line(m, op.symbol) + val.namecn + "</option>");
						tree_select(data, val.id);
					}
				});
			});
			m--;
		}

		function line(num, symbol) {
			var int;
			if(op.istop){
				int = 0;
			}else{
				int = 1;
			}
			var str = "";
			for (int; int < num; int++) {
				str += symbol;
			}
			return str;
		}
	};
})(jQuery);
