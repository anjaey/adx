<#--文章列表 第一栏图片带简介-->

<#macro listAll clist>
	<ul>
		<#list clist as cont>
			<#if cont_index=0>
				<li>	
				<img alt="${cont.title}" src="${cont.imgUrl}"/>
				<a href="${cont.link}">${cont.title}</a>
				<p>${cont.shorText[0..15]}</p>
				</li>	
			<#else>
				<li>
				<a href="${cont.link}">${cont.title}</a>
				<span>${cont.dateStr}</span>
				</li>
			</#if>
		</#list>
	</ul>
</#macro>