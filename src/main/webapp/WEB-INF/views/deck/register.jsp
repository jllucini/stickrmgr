<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<div id="f_deck">
		<form:form action="/deck/register" method="POST" modelAttribute="deckDTO">
			<label>Deck name:</label>
			<form:input type="text"   id="f_name" placeholder="Type here" required="required" path="name"/>
			<input type="submit" id="f_submit"  name="Create" />
		</form:form>
	</div>
	<div id="msgs">
	</div>
</body>
</html>