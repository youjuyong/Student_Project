<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<style type="text/css">
	table, td,th{
	padding: 10px;
	}

</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">
	//jQuery의 ready함수는 document가 준비되는 시점에 실행된다.
/* 	jQuery(document).ready(function() {
		alert("jquery");
	}); */
	// jQuery와 $는 같은 표현이다

	$(document).ready(function(){
		$(":button").click(function(){
			alert($(this).val()+"번이 클릭되었습니다.");
			
		});
		
	});
	
	$(document).ready(function(){
		
		$(".ct").click(function(){
			
			return confirm($(this).text()+"다음으로 이동하시겠습니까?");
		});
		
	});
	
	
	$(document).ready(function(){
		
		$("#btn1").click(function(){
			alert($(this).val());
		});
		
		$("#btn2").click(function(){
			$("#result").html("<font color=blue>" + $(this).val()+"</font>" );
		});
		
	});
	
</script>
</head>
<body>
<div class="container">
	<h3>jQuery Basic</h3> <br>
	
	<input type="button" value="버튼 1"></br>
	<input type="button" value="버튼2"></br>
	<input type="button" value="버튼3"></br>
	
	<a href="https://naver.com" class="ct">네이버로 이동</a>
	<a href="http://daum.net" class="ct">다음으로 이동</a>
	
	<input type="button" value="Test 1: 이벤트 적용 X"><br><br>
	<input type="button" id = "btn1" value="Test 2: 이벤트 적용"><br><br>
	<input type="button" id="btn2" value="Test 3: 이벤트적용3">
<!-- <script type="text/javascript">
		alert(document.getElementById("ts"));
	 </script>
 -->
 	<span id="resultView">span 영역</span>
</div>
</body>
</html>