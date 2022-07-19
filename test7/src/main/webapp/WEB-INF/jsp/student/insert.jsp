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
.basic2{
	text-align:center;
	
}
.basic3{
	display: inline-block;
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
div.mar{
  	margin-top:25px;
}
th {
  text-align: left;
   font-weight: bold;
  color: #fff;
  background: #73685d;
}
  
thead {
  font-weight: bold;
  color: #fff;
  background: #73685d;
}
  
 td, th {
  padding: 1em .5em;
  vertical-align: middle;
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
</style>
<script type="text/javascript">
function check()
{	
	if(document.frmSearch.idx.value==""){
		alert("학번을 제대로 입력해주세요.");
		document.frmSearch.idx.focus();
		return;
	}else if(document.frmSearch.name.value==""){
		alert("이름을 제대로 입력해주세요.");
		document.frmSearch.name.focus();
		return;
	}else if(document.frmSearch.department.value==""){
		alert("부서를 제대로 입력해주세요.");
		document.frmSearch.department.focus();
		return;
	}else if(document.frmSearch.address.value==""){
		alert("주소를 제대로 입력해주세요.");
		document.frmSearch.address.focus();
		return;
	}else if(document.frmSearch.score.value==""){
		alert("점수를 제대로 입력해주세요.");
		document.frmSearch.score.focus();
		return;
	}else{
		alert("제출되었습니다.");
		document.frmSearch.submit();
	}
}


</script>
</head>
<body>


<div class="basic2">
<div class="basic3">
<h1>학생 성적 입력 페이지 입니다!!</h1>
<form action="insert_value.do" method="GET" name="frmSearch">
<table>
	<tr>
		<th><label> 학번 :</label></th>
		<td><input type="text" name="idx"/></td>
	</tr>
	<tr>
		<th><label> 이름 :</label></th>
		<td><input type="text" name="name"  maxlength="15"/></td>
	</tr>
	<tr>
		<th><label> 학부 :</label></th> 
		<td><input type="text" name="department"/></td>
	</tr>
	<tr>
		<th><label> 주소 :</label> </th>
		<td><input type="text" name="address"/></td>
	
	</tr>
	<tr>
		<th><label> 성별 :</label></th>
		<td>
			<input type="radio" id="gender" name="gender" value="남" ><label>남</label>
			<input type="radio" id="gender" name="gender" value="여" ><label>여</label>                
		</td>
	</tr>
	<tr>
		<th><label> 점수 :</label></th> 
		<td><input type="text" name="score"/></td>
	</tr>
	<tr>
	<th> 제출 : </th>
	<td><input type="button" value="제출" onclick="check()"/></td>
	
	</tr>
	
</table>	
<div class="mar">
<a class="button" href="${pageContext.request.contextPath }">홈</a>
</div>
</form>

</div>

</body>
</html>