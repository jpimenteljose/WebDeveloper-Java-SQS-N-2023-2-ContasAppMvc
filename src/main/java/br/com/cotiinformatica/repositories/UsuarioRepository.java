package br.com.cotiinformatica.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class UsuarioRepository {

	// método para cadsatrar um usuário no banco de dados
	public void create(Usuario usuario) throws Exception{
		
		// abrindo conexão com o banco de dados
		Connection connection = ConnectionFactory.getConnection();
		
		// escrevendo o comando SQL para gravar o usuário no banco de dados
		PreparedStatement statement = connection.prepareStatement("insert into usuario (idusuario,nome,email,senha) values (?,?,?,md5(?))");
		
		statement.setObject(1, usuario.getIdusuario());
		statement.setString(2, usuario.getNome());
		statement.setString(3, usuario.getEmail());
		statement.setString(4, usuario.getSenha());
		
		statement.execute();
		statement.close();
	}
}
