function getPostCount() {
	$.ajax({
		url:'/main/getPostCount',
		async: false,
		success:function(data) {
			$.ajax({
				url:'/template/main/main_section.jsp',
				async: false,
				success: function(result) {
					console.log(data);
					$("#menumenu").html(result);
				}
			})
		}
	})
}

$(function() {
//	getPostCount();
})

