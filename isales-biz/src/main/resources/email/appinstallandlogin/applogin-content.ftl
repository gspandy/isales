<html>
	<head>
		<#include "/common/style.ftl" parse="false">
	</head>
	<body>
		亲爱的用户 ,在${startTime}到${endTime}时间内，查询直销员登录app人数统计如下:</br>
		<#if list?size=0>
			登录记录为空！
		<#else>
			<table border="1">
				<tr><th>用户名</th><th>用户姓名</th><th>登录次数</th></tr>
				<#list list as appLogin>  
				<tr><td>${appLogin.userId}</td><td>${appLogin.operatorName}</td><td>${appLogin.loginCount}</td></tr>
				</#list>
			</table>
		</#if>
		<#include "/common/footer.ftl" parse="false">
	</body>
</html>