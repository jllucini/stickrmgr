<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Remove Deck!</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
  </head>
  <body>
    
    <form:form action="/deck/remove" method="POST">
	  <div class="form-group">
	    <label for="deck_list">Select one deck and click remove:</label>
	    <c:forEach var="deck" items="${deckList}"> 
	    	<div class="checkbox"><label><input type="radio" value="${deck.name}" name="deckitem" />${deck.name}</label></div>	  
	  	</c:forEach>
	  </div>
	  <button id="f_submit" type="submit" class="btn btn-default">Submit</button>
	</form:form>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="/bower_components/jquery/dist/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
  </body>
</html>