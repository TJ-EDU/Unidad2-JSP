<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@page import="model.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Unidad 2 - Java JSP</title>
</head>
<body>
	<h1>Bienvenido al Sistema</h1>
	<h2 style="background: orange;">Los datos ingresados son: </h2>
	<%
		Usuario unUsuario = new Usuario();
		unUsuario.setNombre("Jesus Eduardo");
		unUsuario.setApellido("Tejerina");
		unUsuario.setEdad(32);
		unUsuario.setHobbie("Videos Juegos");
		unUsuario.setEditorDeCodigo("Visual Code");
		unUsuario.setSistemaOperativo("Windows 8.1");
		out.println("<h2>" + "Nombre: " + unUsuario.getNombre() + "</h2>");
		out.println("<h2>" + "Apellido: " + unUsuario.getApellido() + "</h2>");
		out.println("<h2>" + "Edad: " + unUsuario.getEdad() + "</h2>");
		out.println("<h2>" + "Hobbie: " + unUsuario.getHobbie() + "</h2>");
		out.println("<h2>" + "Editor de Código: " + unUsuario.getEditorDeCodigo() + "</h2>");
		out.println("<h2>" + "Sistema Operativo: " + unUsuario.getSistemaOperativo() + "</h2>");
		System.out.println(unUsuario.toString());
	%>
	
	
</body>
</html>