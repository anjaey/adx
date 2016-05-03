<#--- 设置下拉框 默认选中--->
<#macro setSelected val default>
	<#if val==default>
		selected="slected"
	</#if>
</#macro>

<#--- 设置 radio 默认选中--->
<#macro setRadio val key default>
	<#if val==''>
		<#if key==default>
			checked="checked"
			<#elseif default=''&&key==0>
			checked="checked"
		</#if>
	<#else>
		<#if val==key>
			checked="checked"
		</#if>
	</#if>
</#macro>

<#---根据值 设置div 默认隐藏显示 --->
<#macro setShow val default>
	<#if val==''>
		<#if default==0>	
			style="display:block;" 
		<#else>
			style="display:none;"
		</#if>
	<#else>
		<#if val==default>
			style="display:block;"
		<#else>
			style="display:none;"
		</#if>
	</#if>
</#macro>

<#---根据值 设置样式 curr --->
<#macro setCurr val index defaultClass>
	<#if val==index>
		<#if defaultClass==''>
			class="curr"
		<#else>
			class='${"curr "+defaultClass}'
		</#if>
	<#else>
		<#if defaultClass==''>
			class=""
		<#else>
			class='${defaultClass}'
		</#if>
	</#if>
</#macro>

<#---根据值 设置样式 curr --->
<#macro setNav val index defaultClass>
	<#if val==index>
		<#if defaultClass==''>
			class="nav_color"
		<#else>
			class='${"nav_color "+defaultClass}'
		</#if>
	<#else>
		<#if defaultClass==''>
			class=""
		<#else>
			class='${defaultClass}'
		</#if>
	</#if>
</#macro>

<#---根据值 设置样式 curr --->
<#macro setRowspan listSize index>
	<#if (listSize>0)&&(index==0)>
		<#nested>
	</#if>
</#macro>
