<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./fragments/head.jsp"%>
</head>
<body style="background-color: #E9ECEB;">
<%@include file="./fragments/bar_top.jsp"%>
<div class="container m-2">
	<div class="container-sm" style="background-color: #FCFCFC;">
		<div class="row">
			<div class="col-md-6 offset-md-3 pb-3">
				<h4 class="text-center mb-3 mt-3 text-warning">Add Candidate</h4>
				<!-- form -->
				<form action="handle-candidate" method="post">
					<div>
						<label for="name"><span style="font-size:12px;">Name</span></label>
						<input type="text" class="form-control fw-light" id="name" name="name"
							placeholder="Name...">
					</div>
					<div>
						<label for="surname"><span style="font-size:12px;">Surname</span></label>
						<textarea class="form-control fw-light" name="surname" id="surname"
							rows="3" placeholder="Surname..."></textarea>
					</div>
					<div>
						<label for="email"><span style="font-size:12px;">Email</span></label>
						<input type="email" class="form-control fw-light" id="email" name="email"
							placeholder="Email...">
					</div>
					<div class="container text-left"><br>
						<a href="${pageContext.request.contextPath}/candidates" class="btn btn-outline-secondary btn-sm">Cancel</a>
						&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary btn-sm">Add</button>
					</div>
				</form>
				<!-- end form -->
			</div>
		</div>
	</div>
</div>
<script src="<c:url value="/resources/js/script-maskMoney.js" />"></script>
</body>
</html>