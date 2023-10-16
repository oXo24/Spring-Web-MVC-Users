<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./fragments/head.jsp"%>
</head>
<body style="background-color: #E9ECEB;">
<%@include file="./fragments/bar_top.jsp"%>
<div class="container m-2">
	<div class="container-sm">
		<div class="row" style="background-color: #FCFCFC;">
			<div class="col-md-6 offset-md-3 pb-3">
				<h4 class="text-center mb-3 mt-3 text-warning">Update Candidates</h4>
				<form action="${pageContext.request.contextPath}/handle-candidate" method="post">
				   <div>
                    <input type="hidden" value="${candidate.id}" name="id" class="form-control">
                   </div> 
					<div>
						<label for="name"><span style="font-size:12px;">Name</span></label>
						<input type="text"	class="form-control" id="name" name="name"
							placeholder="Name..." value="${candidate.name}">
					</div>
					<div>
						<label for="surname"><span style="font-size:12px;">Surname</span></label>
						<textarea class="form-control" name="surname" id="surname"
							rows="3" placeholder="Surname..." >${candidate.surname}</textarea>
					</div>
					<div>
						<label for="email"><span style="font-size:12px;">Email</span></label>
						<input type="text"	class="form-control" id="email" name="email"
							placeholder="Email..." value="${candidate.email}">
					</div>
					<div class="container text-left"><br>
						<a href="${pageContext.request.contextPath}/candidates" class="btn btn-outline-secondary btn-sm">Cancel</a>
						&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary btn-sm">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<script src="<c:url value="/resources/js/script-maskMoney.js" />"></script>
</body>
</html>