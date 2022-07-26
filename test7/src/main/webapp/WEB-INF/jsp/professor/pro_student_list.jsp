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
  <h1>Brand</h1>
  <nav>
   	<span><a class="button" href="#" onClick="history.go(-1);">메인으로</a></span>
  </nav>
</header>
<div class="basic4">
	<h1>${p_name} 교수님 학생 리스트입니다!!!</h1>
</div>
<div align="center">
	<table border=1 width=700>
	<thead>
			<tr>
				<th>학생번호</th>
				<th>이름</th>
				<th>학부</th>
				<th>주소</th>
				<th>성별</th>
				<th>성적</th>
				<th>학점</th>
			</tr>
	</thead>
		<c:forEach items="${prostu_list}" var="professor_list" varStatus="i">
	<tbody>
		<tr>	
			<td>${professor_list.IDX}</td>
			<td><a href="pro_student_detail.do?idx=${professor_list.IDX}&psc_idx=${professor_list.PSC_IDX}&name=${professor_list.NAME}&department=${professor_list.DEPARTMENT}&address=${professor_list.ADDRESS}&gender=${professor_list.GENDER}&score=${professor_list.SCORE}&grade=${professor_list.GRADE}">${professor_list.NAME}</a></td>
			<td>${professor_list.DEPARTMENT}</td>
			<td>${professor_list.ADDRESS}</td>
			<td>${professor_list.GENDER}</td>
			<td>${professor_list.SCORE}</td>
			<td>${professor_list.GRADE}</td>
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
</body>
</html>