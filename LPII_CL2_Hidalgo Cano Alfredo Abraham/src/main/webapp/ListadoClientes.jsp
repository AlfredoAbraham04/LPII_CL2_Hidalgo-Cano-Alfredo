<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fnt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<td>Nombre</td>
		<td>precio</td>
		<td>precio compra</td>
		<td>estado</td>
		<td>descrip</td>
		
		
	
	<%

List<Producto> listadocliente=(List<Producto>)request.getAttribute("ListadoClientes");

//aplicamos una condicion..

if(listadocliente!=null){

	//aplicamos un bucle for..

	for(Producto lis:listadocliente){

		%>
		<tr>
		<td><%=lis.getId() %></td>
		<td><%=lis.getNombre() %></td>
		<td><%=lis.getPrecioVenta() %></td>
		<td><%=lis.getPrecioCompra() %></td>
		<td><%=lis.getEstado() %></td>
		<td><%=lis.getDescrip() %></td>
		</tr>
		<% 

	}  //fin del bucle for...
	%>
	<% 
} //fin de la condicion ...


%>
</table>
	
</body>
</html>