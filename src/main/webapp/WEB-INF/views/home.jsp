<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Sistema de Controle de Contas</h1>
	<p>Bem vindo ao projeto!</p>

	<form method="post" action="cadastrar-usuario">

		<div>

			<div>
				<label>Nome do Usuário:</label> 
				<input type="text" name="nome" />
			</div>

			<div>
				<label>E-mail do Usuário:</label> 
				<input type="text" name="email" />
			</div>

			<div>
				<label>Senha do Usuário:</label> 
				<input type="password" name="senha" />
			</div>

			<div>
				<input type="submit" value="Realizar Cadastro"/>
			</div>

		</div>

	</form>

	<h3>${mensagem}</h3>

</body>
</html>
