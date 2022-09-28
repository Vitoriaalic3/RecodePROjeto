<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Salvando o Cliente</title>
</head>
<body>
<%
String nome= request.getParameter("nome");
String email= request.getParameter("email");
String cpf= request.getParameter("cpf");
String cep= request.getParameter("cep");
String endereco= request.getParameter("endereco");


%>
<h1>Cadastro de Clientes</h1>

<fieldset>
<legend>O seguinte cliente foi cadastrado com sucesso: </legend>

<p>
Nome: <%=nome%><br>
Email:<%=email%> <br>
CPF:<%=cpf%><br> 
CEP:<%=cep%><br> 
Endereco:<%=endereco%> 
</p>
</fieldset>
</body>
</html>