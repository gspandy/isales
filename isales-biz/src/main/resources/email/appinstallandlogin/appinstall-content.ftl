<html>
	<head>
		<#include "/common/style.ftl" parse="false">
	</head>
	<body>
		亲爱的用户 ,查询直销员累计安装app人数统计如下:
		<table border="1">
		<tr><th>中心编码</th><th>中心名称</th><th>应安装</th><th>实际安装</th></tr>
		<#list list as appInstall>  
		<tr><td>${appInstall.orgCode}</td><td>${appInstall.orgName}</td><td>${appInstall.totalEmp}</td><td>${appInstall.loginEmp}</td></tr>
		</#list>
		</table>
		<#include "/common/footer.ftl" parse="false">
	</body>
</html>