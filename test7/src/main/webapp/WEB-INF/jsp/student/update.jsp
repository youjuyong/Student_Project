<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1{
	text-align:center;
}
.table2{
	text-align:center;
}

.basic{
	text-align:center;
	margin:20px;
}
body {
  padding:1.5em;
  background: #f5f5f5
}

table {
  border: 1px #a39485 solid;
  font-size: .9em;
  box-shadow: 0 2px 5px rgba(0,0,0,.25);
  width: 100%;
  border-collapse: collapse;
  border-radius: 5px;
  overflow: hidden;
}

th {
  text-align: left;
}
  
thead {
  font-weight: bold;
  color: #fff;
  background: #73685d;
}
  
td {
  padding: 1em .5em;
  vertical-align: middle;
  text-align:center;
}
th {
  font-weight: bold;
  color: #fff;
  background: #73685d;
  text-align:center;

}
  
 td {
  border-bottom: 1px solid rgba(0,0,0,.1);
  background: #fff;
}

a {
  color: #73685d;
}

textarea{
	text-align:center;
	margin:auto;
}
  
 @media all and (max-width: 768px) {
    
  table, thead, tbody, th, td, tr {
    display: block;
  }
  
  th {
    text-align: right;
  }
  
  table {
    position: relative; 
    padding-bottom: 0;
    border: none;
    box-shadow: 0 0 10px rgba(0,0,0,.2);
  }
  
  thead {
    float: left;
    white-space: nowrap;
  }
  
  tbody {
    overflow-x: auto;
    overflow-y: hidden;
    position: relative;
    white-space: nowrap;
  }
  
  tr {
    display: inline-block;
    vertical-align: top;
  }
  
  th {
    border-bottom: 1px solid #a39485;
  }
  
  td {
    border-bottom: 1px solid #e5e5e5;
  }
  
  
  }
  div.mar{
  	margin-top:25px;
  }

</style>


</head>
<body>
<h1>학생 정보 수정 페이지입니다!!!!</h1>

<div align="center">
<form  action="update_value.do?idx=${idx}" method="POST" id="frmSearch">
	<table border=1 width=700>
	<thead>
		<c:forEach items="${updatebean}" var="student_update" varStatus="i">
		<tbody>
			<tr>
				<th>학생번호</th>
				<td>${student_update.IDX}</td>
			</tr>
			<tr>	
				<th>이름</th>
				<td>${student_update.NAME}</td>
			</tr>	
				<th>학부</th>
				<td>${student_update.DEPARTMENT}</td>
			<tr>
				<th>주소</th>
				<td><textarea rows="2" cols="40" id="address" name="address">${student_update.ADDRESS}</textarea></td>
			</tr>
				<th>성별</th>
				<td>${student_update.GENDER}</td>
			<tr>
				<th>성적</th>
				<td><textarea rows="2" cols="40" id="score" name="score">${student_update.SCORE}</textarea></td>
			</tr>
			<tr>
				<th>학점</th>
				<td>${student_update.GRADE}</td>
			</tr>
			
		</tbody>
		
		</c:forEach>
	</table>
		<div class="mar">
			<input type="submit" value="수정" onclick="check2()"/>
 			<a class="button" href="${pageContext.request.contextPath }">홈</a>
	</div>

</form>
</div>

</body>
</html>