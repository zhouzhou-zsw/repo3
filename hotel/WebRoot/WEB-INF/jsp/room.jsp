<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'room.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <table border="1">
                <tr>
                    <th width="10%">房间编号</th>
                    <th width="20%">房间类型</th>
                    <th width="10%">容纳人数</th>
                    <th width="10%">租金</th>
                    
                    
                    <th width="5%">操作</th>
                </tr>
                   <c:forEach var="Room" items="${roomList }" varStatus="status">
					<tr>
						<td>
						<span>${Room.roomNo }</span>
						</td>
						<td>
						<span>${Room.roomType }</span>
						</td>
						<td>
						<span>${Room.peopleCount }</span>
						</td>
						<td>
						<span>${Room.rent }</span>
						</td>
						
						
						<td>
						<c:if test="${Room.isRental==0 }">
						
						<a>订房</a>
						</c:if>
						<c:if test="${Room.isRental==1 }">
						
						<a href="${pageContext.request.contextPath}/entry/updateentry.html?id=${entry.id}" >退房</a>
						</c:if>
						</td>
                        
					</tr>
				</c:forEach>		
				</table>
  </body>
</html>
