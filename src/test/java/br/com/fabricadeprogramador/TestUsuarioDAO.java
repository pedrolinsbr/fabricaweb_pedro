package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testExcluir();
		
	}
	
	public static void testCadastrar(){
		//Criando o usuário
				Usuario usu = new Usuario();
				usu.setNome("Ana Flávia");
				usu.setLogin("ana.flavia");
				usu.setSenha("123");
				
				//Cadastrando usuario no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.cadastrar(usu);
				
				System.out.println("CADASTRADO COM SUCESSO!!");
	}
	
	public static void testAtualizar(){
		//Criando o usuário
				Usuario usu = new Usuario();
				usu.setId(1);
				usu.setNome("Ana Flávia Lins");
				usu.setLogin("ana.flavia");
				usu.setSenha("123");
				
				//Cadastrando usuario no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.alterar(usu);
				
				System.out.println("ALTERADO COM SUCESSO!!");
	}
	
	public static void testExcluir(){
		//Criando o usuário
				Usuario usu = new Usuario();
				usu.setId(1);				
				//Cadastrando usuario no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.excluir(usu);
				
				System.out.println("EXCLUIDO COM SUCESSO!!");
	}
	
	public static void testExibir(){
		//Criando o usuário
				Usuario usu = new Usuario();
				usu.setId(1);
				usu.setNome("Ana Flávia Lins");
				usu.setLogin("ana.flavia");
				usu.setSenha("123");
				
				//Cadastrando usuario no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.alterar(usu);
				
				System.out.println("ALTERADO COM SUCESSO!!");
	}
	
	

}
