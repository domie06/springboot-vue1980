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
<link href=" css/css/background/css/style.css" rel="stylesheet"
	type="text/css" />
<link href="css/css/background/css/select.css" rel="stylesheet"
	type="text/css" />
<link href="js/js/background/js/laydate/need/laydate.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="js/js/background/js/laydate/laydate.js"></script>
<script type="text/javascript" src="js/js/background/js/jquery.js"></script>
<script type="text/javascript"
	src="js/js/background/js/jquery.idTabs.min.js"></script>
<script type="text/javascript"
	src="js/js/background/js/select-ui.min.js"></script>
<script type="text/javascript"
	src="js/js/background/editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
    KE.show({
        id : 'content6',
        cssPath : './index.css'
    });
  </script>

<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});
	$(".select3").uedSelect({
		width : 100
	});
});
</script>
</head>

<body>


	<div class="formbody">


		<div id="usual1" class="usual">

			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">发布信息</a></li>
				</ul>
			</div>

			<div id="tab1" class="tabson">

				<div class="formtext">
					Hi，<b>${sessionScope['User']['userName']}</b>，欢迎您使用信息编辑功能！
				</div>

				<!-- form表单 -->

				<form action="black/informationUpdate" method="POST"
					onsubmit="return checkSubmit();">
					<input type="hidden" name="id" value="${black['id'] }">
					<ul class="forminfo">
						<li><label>罚款名称<b>*</b></label><input id="name" value="${black['name'] }"
							name="name" type="text" class="dfinput" placeholder="请填写罚款名称"
							style="width: 518px;" /></li>
						<li><label>车辆号牌<b>*</b></label><input id="code" value="${black['code'] }"
							name="code" type="text" class="dfinput" placeholder="请填写车辆号牌"
							style="width: 518px;" /></li>
						<li><label>车辆类型<b>*</b></label><div class="vocation"> <c:if test="${message!=null }">
								<c:out value="${message }"></c:out>
							</c:if> <select class="select2" name="ctype_id" id="ctype_id">
								<c:forEach items="${ctypeList }" var="ctype">
									<c:if test="${ctype['id'] eq black['ctype']['id']}" var="s1">
										<option value="${ctype['id'] }" selected="selected">${ctype['name'] }</option>
									</c:if>
									<c:if test="${!s1 }">
										<option value="${ctype['id'] }">${ctype['name'] }</option>
									</c:if>
								</c:forEach>
						</select></div></li>
						<li><label>收费站<b>*</b></label><div class="vocation"> <c:if test="${message!=null }">
								<c:out value="${message }"></c:out>
							</c:if> <select class="select2" name="station_id" id="station_id">
								<c:forEach items="${stationList }" var="station">
									<c:if test="${station['id'] eq black['station']['id']}" var="s2">
										<option value="${station['id'] }" selected="selected">${station['name'] }</option>
									</c:if>
									<c:if test="${!s2 }">
										<option value="${station['id'] }">${station['name'] }</option>
									</c:if>
								</c:forEach>
						</select></div></li>
						<li><label>罚款金额<b>*</b></label><input id="price" value="${black['price'] }"
							name="price" type="text" class="dfinput" placeholder="请填写罚款金额"
							style="width: 518px;" /></li>
						<li><label>备注<b>*</b></label><textarea id="content7" name="content">${black['content'] }</textarea></li>
						<li><label>&nbsp;</label><input name="" type="submit"
							class="btn" value="修改信息" /></li>
					</ul>

				</form>
			</div>

		</div>

		<script type="text/javascript"> 
      $("#usual1 ul").idTabs(); 
    </script>

		<script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>





	</div>


</body>
<script type="text/javascript"> 
var in_time = {
		  elem: '#in_time',
		  format: 'YYYY-MM-DD',
		  min: '1900-01-01', //设定最小日期为当前日期
		  max: '2099-06-16', //最大日期
		  istime: true,
		  istoday: false,
		  choose: function(datas){
		     end.min = datas; //开始日选好后，重置结束日的最小日期
		     end.start = datas //将结束日的初始值设定为开始日
		  }
		};
		laydate(in_time);
    var checkSubmitFlg = false; 
    function checkSubmit() { 
      if (checkSubmitFlg == true) { 
         return false; 
      } 
      var name = $("#name").val();
      var code = $("#code").val();
      var price = $("#price").val();
		if(!$.trim(name)){
			alert('请输入罚款名称!');
			return false;
		}
		if(!$.trim(code)){
			alert('请输入车辆号牌!');
			return false;
		}
		if(!$.trim(price)){
			alert('请输入罚款金额!');
			return false;
		}
		
      checkSubmitFlg = true;
      return true; 
   } 
   document.ondblclick = function docondblclick() { 
    window.event.returnValue = false; 
   } 
   document.onclick = function doconclick() { 
       if (checkSubmitFlg) { 
         window.event.returnValue = false; 
       } 
   } 
</script>
</html>
