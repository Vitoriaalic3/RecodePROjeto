<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Salvando o Cliente jsp</title>
</head>
<body>

<div class="container">
<fieldset class="form-control">
<h3>Cadastro de Clientes</h3>
<legend>Dados do Cliente Cadastrado</legend>
<p>O seguinte cliente foi cadastrado com sucesso:</p>
<b>NOME: </b>${Cliente.nome}<br>
<b>EMAIL:</b>${Cliente.email}<br>
<b>CPF:</b>${Cliente.cpf}<br>
<b>CEP:</b>${Cliente.cep}<br>
<b>ENDERECO:</b>${Cliente.endereco}<br>
</fieldset>
</div>
</body>
</html>
