<#-- 递归循环导航-->
<#macro showNav navListMap className> 
	<#if navListMap?has_content> 
		<#if !(className??)> 
			<ul>
		<#else>
			<ul style="display:none;" class="childUl">
		</#if>
		<#list navListMap as map> 
			<li class="${className???string(className,'mainlevel')}" codeold="${map.code}" codenew="${code}"><a href="${base}${map.url}?code=${map.code}">${map.name}</a>
				<#if !(className??)> 
					<#--<img src="${base}/res/web/images/dropDown.png" class="dropdown" width="14" height="9"/>-->
				</#if>
				<#if map.child??> 
					<#assign childNavListMap=map.child> 
					<@showNav childNavListMap 'childNav'/> 
				</#if> 
			</li>
		</#list> 
		</ul>
	</#if>
</#macro>

<#--商品分类循环 -->

<#macro loopCategory cateList>
	<#if cateList?has_content>
     <#list cateList as entity> 
     	<#nested entity.namecn,entity.id>
     </#list>           	
    </#if>
</#macro>

<#--新闻列表循环-->
<#macro loopArticle newsList>
	<#if newsList?has_content>
     <#list newsList as entity> 
     	<#nested entity['uuid'],entity['title'],entity['createtime']?datetime>
     </#list>           	
    </#if>
</#macro>

<#--产品列表循环-->
<#macro loopProductListMap productListMap>
	<#if productListMap?has_content>
     <#list productListMap as map> 
     	<#nested map['uuid'],map['price'],map['namecn'],map['brandName'],map['productImgurl']>           	
	</#list>
	</#if>
</#macro>


<#--友情连接列表循环-->
<#macro loopLinkListMap linkListMap>
	<#if linkListMap?has_content>
     <#list linkListMap as map> 
     	<#nested map['url'],map['logourl'],map['name']>           	
	</#list>
	</#if>
</#macro>
