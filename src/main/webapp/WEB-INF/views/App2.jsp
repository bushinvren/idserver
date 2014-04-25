<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="text/html" charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Shionw Tech.</title>
<link href="/resources/css/mobile.css" type="text/css" rel="stylesheet">
<style type="text/css">
.left{
position:absolute;
left:0px;
}
</style>

<style type="text/css" media="screen"> 
.suspension{
width:50%;
height:10%;
position:fixed;
left:30%;
top:80%;
}
.suspensionRight{
width:30%;
height:10%;
position:fixed;
left:70%;
top:80%;
}
</style>
<style type="text/css"></style><script>window["_GOOG_TRANS_EXT_VER"] = "1";</script></head>
 
<body>
    <div style="list-style:none" class="list" id="mytable">
	<ul style="list-style:none">
	<li style="text-align:center;font-size:1.0em"><font color="red">提示：最近微信扫描下载功能调整频繁，如果您使用微信扫描，在微信浏览器中不能下载，请点击右上角图标，选择“在浏览器打开”，或右上角“查看原网页”，再启动浏览器、选择机型下载！</font></li>
	<li style="text-align:center;font-size:1.0em" nowrap="nowrap">-------------------------</li>
	</ul>
<br>
 	<ul style="list-style:none">
	<li style=" text-align:center;font-size:1.2em" nowrap="nowrap">请选择相应的机型下载:</li>
	<li style="text-align:center;font-size:1.2em">Please select model to download:</li>
	</ul>
<br>	
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppNote2V2.apk">Note 2(光感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/MSensorAppV2.apk">Note2(磁感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">Note2(English)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">--------------------------</li>
	
	
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppS3V2.apk">S3(光感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">--------------------------</li>
	
	
	
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">S5(光感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppMV2.apk">S5(磁感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">S5(English)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">--------------------------</li>
	
	
	
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">小米3(光感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/MSensorAppV2.apk">小米3(磁感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">--------------------------</li>
	
	
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">红米、红米Note(光感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">--------------------------</li>
	
	
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">小米2(光感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">--------------------------</li>
	
	
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">note3mini/N750(光感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/MSensorAppV2.apk">note3mini/N750(磁感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">note3mini/N750(English)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">--------------------------</li>
	
	
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://my-app.oss-cn-hangzhou.aliyuncs.com/SensorAppV2.apk">华为(光感)</a></li>
	<li style="text-align:center;font-size:1.5em" nowrap="nowrap">--------------------------</li>
	</div>

<br><br>
	<div style="list-style:none" data-role="content">
<li style="text-align:left;font-size:1.0em" nowrap="nowrap"><br>----------------------<br></li>

<li style="text-align:left;font-size:1.0em" nowrap="nowrap"><br>----------------------<br></li>	

<li style="text-align:left;font-size:1.2em"><font color="red">请在手机安全软件中如下设置：</font></li>
<li style="text-align:left;font-size:1.0em">&nbsp;&nbsp;请在手机安全软件中，将智能休眠设置为可信任、允许自启动、内存清理时不要清理智能休眠。
<br>&nbsp;&nbsp;以360安全卫士为例：
	  <br>1、启动智能休眠，并输入序列号激活，保证合盖能正常休眠。
          <br>2、360安全卫士主界面、手机清理、内存优化，将智能休眠后面的勾去掉，这样智能休眠常驻内存的感应进程不会被误清理。
          <br>3、360安全卫士主界面、手机清理、自动启动的软件，找到“智能休眠”，设置“已允许”，并点击中间打开的锁，将其锁住。这样，360一键清理时才不会将智能休眠清理掉。
          <br>4、360安全卫士主界面、隐私行为监控（第二页）、所有软件、智能休眠，设置为信任。这样，智能休眠才可以正常完成接听和挂断电话、显示来电联系人、显示未接电话和未读短信等功能。  
          <br>5、360安全卫士主界面、设置、来电信息显示、去掉“显示来电秀”。因为来电秀会盖住我们的滑动接听界面。
</li>

</div>
<div style="list-style:none" class="suspension">
 
 
</div>
<div style="list-style:none" class="suspensionRight">
 
</div>



</body></html>