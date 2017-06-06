<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<h2>請選擇要查看的課程</h2>
<form>
	<select name="class" id="options">
  
	</select>
	<input type="submit" value="查詢">
</form>
<br><br>
<a href="index.jsp">延長單獨學員</a>

<br>參加課程的學員以及其期限：
<div id="container">


</div>
</body>
<script>

$(document).ready(function(){
	
	 $.ajax({
         url: "validaty/class",
         type:"POST",
         dataType:"json",
         success: function (data) { 
        	 var addedClass;  
        	 for(var i=0; i<data.length; i++) {
        		 addedClass += "<option value='" + data[i] + "'> " + data[i] + "</option>";
             }
             $("#options").append(addedClass);      
         },
	     error:function(xhr, ajaxOptions, thrownError){ 
             alert(xhr.status); 
             alert(thrownError); 
         }
     });
	 
	 
	 
	$("form").submit(function(e){
		 
		 e.preventDefault();
		 
		 $.ajax({
	         url: "validaty/classmembers",
	         type:"POST",
	         data:"class=" + $("#options").val(),
	         dataType:"json",
	         success: function (data) {
	        	console.log(data[0].id);
	        	 $("#container").html("");
	        	var addedClass="";  
	        	for(var i=0; i<data.length; i++) {
	        		addedClass += 
	        		"<div>" + data[i].account + "&nbsp;&nbsp;" + data[i].validaty;
//	        		+ "<form action='validaty/postpone' method='POST'>" +
//	        		+ "<input type='hidden' name='id' value='648'>"
//	        		+ "延長至： <input type='date' name='postponeDate'>"
//	        		+ "<input type='submit' value='送出' /> </form></div><br>";
	        	}
	        	
	        	$("#container").append(addedClass);
	        	
	         },
		     error:function(xhr, ajaxOptions, thrownError){ 
	             alert(xhr.status); 
	             alert(thrownError); 
	         }
	     }); 
	 })
     
});

</script>
</html>