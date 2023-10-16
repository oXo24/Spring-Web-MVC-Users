<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./fragments/head.jsp"%>
</head>
<body style="background-color: #E9ECEB;">
<%@include file="./fragments/menu.jsp"%>
<div class="container m-2" style="background-color: #FCFCFC;">
	<div class="container-sm">
		<div class="row">
			<div class="col-md-12">
				<div class="container text-left mb-3">
				    <p class="fs-2" style="color: #a72090;">Employees
				    <a href="add-employee" class="btn btn-primary btn-sm ms-2"><i class="bi bi-plus-lg"></i>Add</a>
				    </p>
                </div>
				<table class="table">
					<thead class="table-light">
						<tr>
							<th scope="col">No.</th>
							<th scope="col">Name</th>
							<th scope="col">Surname</th>
							<th scope="col">Email, &#x00A3;</th> <!-- <- &#x00A3; HTML GBP -->
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${employee}" var="frt">
							<tr>
								<th scope="row">${frt.id}</th>
								<td>${frt.name}</td>
								<td>${frt.surname}</td>
								<td class="font-weight-bold text-end pe-5">${frt.email}</td>
								<td>
								<a class="btn btn-warning btn-sm" href="update-employee/${frt.id}" role="button">Update</a>
								&nbsp;&nbsp;
								<a class="btn btn-danger btn-sm" href="delete-employee/${frt.id}" role="button">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
</body>
</html>