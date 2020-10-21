<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
  function validate(){
	  var nameregex=/^[a-zA-Z ]+$/
	  alert(document.forms["product"]["code"].value)
	if(!document.forms["product"]["code"].value==""){
		if(nameregex.test(document.forms["product"]["code"].value)){
				
		}
	       else{
	    	   document.forms["product"]["code"].focus();
	    	   document.forms["product"]["code"].value="";
	             alert("Plz Enter valid Code");
	             return false;
	           }
		}else{
				alert("enter code")
				return false;
			}
	  }
</script>
</head>
<body>
<div class="main">
<center>
       <h3>REGISTER PAGE</h3>
<form:form action="save" method="POST" modelAttribute="product" onsubmit="return validate()" name="product">
<pre>
 CODE    : <form:input path="code" maxlength="6"/><br/>
 NAME    : <form:input path="name"/><br/>
 PASSWORD: <form:password path="password"/><br/>
 Valid   : <form:radiobutton path="isValid" value="Y"/>Y <form:radiobutton path="isValid" value="N"/>N <br/>
 TYPE    : <form:checkbox path="type" value="A"/>A
           <form:checkbox path="type" value="B"/>B
           <form:checkbox path="type" value="C"/>C <br/>
 COST    : <form:input path="cost"/><br/>
 GST     : <form:select path="gst">
 			<form:option value="5">5%-SLAB</form:option>
 			<form:option value="12">12%-SLAB</form:option>
 			<form:option value="18">18%-SLAB</form:option>
 			<form:option value="22">22%-SLAB</form:option>
 			<form:option value="30">30%-SLAB</form:option>
 		    </form:select> <br/>
 NOTE    : <form:textarea path="note"/>
 
                    <input type="submit" value="CREATE" /> 		
</pre>

</form:form>
</center>
${message}
</div>
</body>
</html>