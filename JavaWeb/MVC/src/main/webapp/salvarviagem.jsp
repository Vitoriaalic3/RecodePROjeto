<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Salvando a Viagem jsp</title>
</head>
<body>

<div class="container">
<fieldset class="form-control">
<h3>Cadastro de Viagens</h3>
<legend>Dados da Viagem Cadastrada</legend>
<p>A seguinte viagem foi cadastrado com sucesso:</p>

<b>DESTINO: </b>${Viagem.destino}<br>
<b>DATA:</b>${Viagem.data}<br>
<b>HORA:</b>${Viagem.hora}<br>
<b>ID:</b>${Viagem.id}<br>

</fieldset>
</div>
</body>
</html>
