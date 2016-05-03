<#-- 文章列表模板-->

		<#-- 参数： 是否需要简介 图片 日期 -->
<#macro listContent clist shortText imgUrl dateTimeStr hits>
	<ul>
		<#list clist as content>
			<li>
			<div>${content_index}</div><a href="${content.link}">${content.title}</a>
			<#if shortTitle>
				<p>${content.subTitle[0..15]}</p>
			</#if>
			<#if imgage>
				<p><img src="${content.imgUrl}" alt=""/></p>
			</#if>
			<#if dateTimeStr>
				<p>${content.dateTimeStr}</p>
			</#if>
			<#if hits>
				<p>${content.hits}</p>
			</#if>
			</li>		</#list>
	</ul>
</#macro>

