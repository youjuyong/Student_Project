<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>
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
<h1>학생 디테일 페이지입니다!!!!</h1>

<div align="center">
	<table border=1 width=700>
	<thead>
		<c:forEach items="${bean}" var="student_detail" varStatus="i">
		<tbody>
			<tr>
				<th>학생번호</th>
				<td>${student_detail.IDX}</td>
			</tr>
			<tr>	
				<th>이름</th>
				<td>${student_detail.NAME}</td>
			</tr>	
				<th>학부</th>
				<td>${student_detail.DEPARTMENT}</td>
			<tr>
				<th>주소</th>
				<td>${student_detail.ADDRESS}</td>
			</tr>
				<th>성별</th>
				<td>${student_detail.GENDER}</td>
			<tr>
				<th>성적</th>
				<td>${student_detail.SCORE}</td>
			</tr>
			<tr>
				<th>학점</th>
				<td>${student_detail.GRADE}</td>
			</tr>
		</tbody>
		</c:forEach>
	</table>
<div class="mar">
	<a class="button" href="update.do?idx=${idx}&address=${address}&score=${score}">학생 정보 수정</a>
 	<a class="button" href="${pageContext.request.contextPath }">홈</a></td>
 	<a class="button" href="delete.do?idx=${idx}" >학생 정보 삭제</a>
</div>
</div>

</body>
</html>