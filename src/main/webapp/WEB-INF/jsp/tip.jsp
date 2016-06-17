<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.io.*,java.util.*" %>

	<s:form action="tip">	
		<s:textfield label ="Meal Amount" key="mealAmount" />
		<s:textfield label ="Tip Percentage" key="tipPercentage" />
		<s:submit />
	</s:form>
	
	<s:if test ="%{tipPercentage > 1.00}">  
		<jsp:forward page="error.jsp" />
	</s:if>
	
	<s:if test ="%{tipAmount > 0.0}">  
		Tip Amount: <s:text name="tipAmount" />
	</s:if>