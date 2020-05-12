<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<div id="body_div">
	<div id="menu">
		<div id="menu_area" class="center_frame">
			<div>
				<a href="/"><h3 class="menu_btn">트랜딩</h3></a>
			</div>
			<div>
				<a href="/recent"><h3 class="menu_btn">최신</h3></a>
			</div>
		</div>
	</div>
	<section>
		<main class="main_frame">
			<div class="main_content">
				<c:forEach var="item" items="${data}" varStatus="status">
					<div class="post_card">
						<a class="post_thumbnail">
							<div class="thumbnail_image_box" style="padding-top:50%">
								<img src="/resources/img/temp/dummy.jpg">
							</div>
						</a>
						<div class="post_summary">
							<a>
								<h4 class="post_title">타이틀</h4>
								<div class="description_wrapper">
									<p>요약 내용</p>
								</div>
							</a>
							<div class="sub_info">
								<span class="create_date">2020년 5월 12일</span>
								<span class="separator">.</span>
								<span class="comment_count"> <c:out value="${ status.index }"/> 개의 댓글</span>
							</div>
						</div>
						<div class="post_footer">
							<a class="user_info">
								<img src= "">
								<span>
									by
									<b class="author"></b>
								</span>
							</a>
							<div class="likes">
								<img src="">
								<span>like num</span>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</main>
		<aside class="right_sidebar">
		</aside>
	</section>
</div>