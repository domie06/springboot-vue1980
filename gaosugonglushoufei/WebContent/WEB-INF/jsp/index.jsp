<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%
   String path = request.getContextPath();
   String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   /*
   @Author:Jaylan Zhou
   @Date:
   @projectName:
   @TEL:13166803607
   @QQ:764540631
   */

	/*
	    全路径,形式如下:
	    request.getScheme():获取http协议
	    request.getServerName():获取本地服务器名
	    request.getServerPort():获取服务器端口号
	    path:访问路径
	*/

%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basepath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/css/background/css/style.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="js/js/background/js/jquery.js"></script>
<script type="text/javascript" src="js/js/background/layer/layer.js"></script>
<script type="text/javascript"
	src="js/js/background/commons/hp_layer_helper-v0.1.js"></script>
<script type="text/javascript">
        $(function(){
        	$("#addlog").click(function () {
                frameset_layer().open("sys/background/logAdd");
            });

            
	        })
	        
        $(function(){
        	$("#addfile").click(function () {
                frameset_layer().open("sys/background/uploadAdd");
            });

            
	        })
</script>
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="javascript:;">首页</a></li>
		</ul>
	</div>

	<div class="mainindex">


		<div class="welinfo">
			<span><img src="image/image/background/images/sun.png"
				alt="天气" /></span> <b>${sessionScope['User']['userName']}, <script
					type="text/javascript">
    var d = new Date();
    if(d.getHours()>=18||d.getHours()<4){document.write("晚上好!")}
    else if(d.getHours()>=4&&d.getHours()<8){document.write("早上好!")}
    else if(d.getHours()>=8&&d.getHours()<11){document.write("上午好!")}
    else if(d.getHours()>=11&&d.getHours()<13){document.write("中午好!")}
    else if(d.getHours()>=13&&d.getHours()<18){document.write("下午好!")}
    </script>&nbsp;
			</b> 今天是:<b>
				<script type="text/javascript">
       var d = new Date();
       document.write(d.getFullYear()+"."+(d.getMonth()+1)+"."+d.getDate())
    </script>
			</b> <a
				href="user/queryOne?id=${sessionScope['User']['id'] }">帐号设置</a>
				<a
				href="request/passUpdate?id=${sessionScope['User']['id'] }">修改密码</a>
				<br />
		</div>
		<div class="xline"></div>
		<br />
	<div class="welinfo">
			<span></span> <b>公告信息<br />
			</b>&nbsp; ${notice['text'] }
				<br />
		</div>


		<br />





	</div>



</body>

</html>
