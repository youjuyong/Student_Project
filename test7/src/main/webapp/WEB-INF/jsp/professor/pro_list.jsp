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

thead {
  font-weight: bold;
  color: #fff;
  background: #73685d;
}
  
 td, th {
  padding: 1em .5em;
  vertical-align: middle;
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
  a{
  color:black;
  }
header {  
  height: 75px;
  padding: 1rem;
  color: white;
  background: #73685d;
  font-weight: bold;
  display: flex;
  justify-content: space-between;
  align-items: center;
}
* {
  box-sizing: border-box;
}
h1, p {
  margin: 0;
}
.basic4{
	margin:20px;
}
</style>
</head>
<body>
<header>
  <h1>교수</h1>
  <nav>
   	<span><a class="button" href="logout.do">로그아웃</a></span>
  </nav>
</header>
<div class="basic4">
<c:choose>
	<c:when test="${sessionScope.admin.ad_name eq null }">
		<jsp:forward page="/login"/>
	</c:when>
	<c:otherwise>
	<h1>${sessionScope.admin.ad_name }님 어서오세요 교수리스트 입니다.</h1>
	</c:otherwise>
</c:choose>
</div>
<div align="center">
	<table border=1 width=700>
	<thead>
			<tr>
				<th>교수 번호</th>
				<th>교수명</th>
				<th>교수 생일</th>
				<th>교수 부서</th>
				<th>담당 학생</th>
				<th>교수 주소</th>
				<th>교수 이메일</th>
			</tr>
	</thead>
		<c:forEach items="${pro}" var="professor_list" varStatus="i">
	<tbody>
		<tr>	
			<td>${professor_list.P_IDX}</td>
			<td><a href="student_select.do?p_idx=${professor_list.P_IDX}&p_name=${professor_list.P_NAME}">${professor_list.P_NAME}</a></td>
			<td>${professor_list.P_BIRTH}</td>
			<td>${professor_list.P_DEPARTMENT}</td>
			<td>${professor_list.PS_IDX}</td>
			<td>${professor_list.P_ADDRESS}</td>
			<td>${professor_list.P_EMAIL}</td>
		</tr>	
	</tbody>
		</c:forEach>
	</table>
</div>
<div class="basic">
		<table>
	
		<tr>
			<a class ="button" href="insert.do">학생 성적 입력 </a>
		</tr>
		<tr>
			<td>교수 조회수 : ${proCount }</td>
		</tr>
		</table>
</div>	

<script type="text/javascript">
alert('${message}');

</script>
</body>
</html>