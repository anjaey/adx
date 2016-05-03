你好:${username}
<#-- 注释-->

<#setting number_format="currentcy"/>
<#assign answer=42/> 
${answer} 



<#macro greet>     
     <font size="+2">Hello Joe!</font>    
</#macro>    

<@greet/> 

<#macro greet person color>
	<font size="+2">Hello ${person}!</font>  
	<color>${color}</color>
</#macro> 

<@greet person="Feid"/>


<#macro border> 
  <table border=4 cellspacing=0 cellpadding=4>
      <tr>
	      <td> 
	        <#nested> 
	     </td>
     </tr>
  </table> 
</#macro>
