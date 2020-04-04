
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>NusaBank - Nasabah Dashboard</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Tambahkan Nasabah Baru
</h1>

<c:url var="addAction" value="/nasabah/add" ></c:url>

<form:form action="${addAction}" commandName="nasabah">
<table>
	<c:if test="${!empty nasabah.nama}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="nama">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="nama" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="nik">
				<spring:message text="NIK"/>
			</form:label>
		</td>
		<td>
			<form:input path="nik" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="alamat">
				<spring:message text="Alamat"/>
			</form:label>
		</td>
		<td>
			<form:input path="alamat" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty nasabah.nama}">
				<input type="submit"
					value="<spring:message text="Edit Nasabah"/>" />
			</c:if>
			<c:if test="${empty nasabah.nama}">
				<input type="submit"
					value="<spring:message text="Add Nasabah"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Nasabah List</h3>
<c:if test="${!empty listNasabah}">
	<table class="tg">
	<tr>
		<th width="80">Nasabah ID</th>
		<th width="120">Nasabah Name</th>
		<th width="120">NIK</th>
		<th width="200">Alamat</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listNasabah}" var="nasabah">
		<tr>
			<td>${nasabah.id}</td>
			<td>${nasabah.nama}</td>
			<td>${nasabah.nik}</td>
			<td>${nasabah.alamat}</td>
			<td><a href="<c:url value='/edit/${nasabah.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${nasabah.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
