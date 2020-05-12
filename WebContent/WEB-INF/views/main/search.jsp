<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	
	<link rel="stylesheet" type="text/css" href="resources/css/main/main_common.css">
	<link rel="stylesheet" type="text/css" href="resources/css/main/main_header.css">
	<link rel="stylesheet" type="text/css" href="resources/css/main/main_search.css">
	<title>최신 포스트 - velog</title>
</head>
<body>
	<div id="root">
		<%@ include file="/template/main/main_header.jsp" %>
		<div id="search_div">
			<div id="input_div" for="#input_box input">
				<div id="input_box">
					<h6>돋보기</h6>
					<input placeholder="검색어를 입력하세요" autofocus>
				</div>
			</div>
		</div>
	</div>
</body>
</html>