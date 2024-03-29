package estrututa;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//ESPA�O PARA A CRIA��O DE NOVOS USUARIOS
		Usuario user01 = new Usuario(001, "Vinicius Alochio Santos", "vinicius_alochio", "senhaforte");
		Usuario user02 = new Usuario(002, "Rafael Alexandre", "rafael_alexandre", "senhasenha");
		
		//CAPTURANDO DO TECLADO O LOGIN DO USUARIO
		Scanner sc = new Scanner(System.in);
		String analizaUser;
		String analizaSenha;
		
		System.out.println("LOGIN: \n");
		System.out.println("Usuario: ");
		analizaUser = sc.nextLine();
		System.out.println("Senha: ");
		analizaSenha = sc.nextLine();

		//CONDI��O PARA ANALIZAR SE O USUARIO EST� CADASTRADO NO SISTEMA
		if (user01.getLogin().equals(analizaUser) && user01.getSenha().equals(analizaSenha)
				|| user02.getLogin().equals(analizaUser) && user02.getSenha().equals(analizaSenha) ) {
			
			System.out.println("\tSeja bem vindo ao seu blog\n");
			
			//CRIANDO UM BLOG
			Blog blog = new Blog();

			//CRIANDO AS POSTAGENS
			Postagem postagem01 = new Postagem();
			Postagem postagem02 = new Postagem();
			Postagem postagem03 = new Postagem();

			//ADICIONANDO AS POSTAGENS AO BLOG
			blog.adcionarPostagem(postagem01);
			blog.listarTodasAsPostagens(0);
			blog.adcionarPostagem(postagem02);
			blog.listarTodasAsPostagens(0);
			blog.adcionarPostagem(postagem03);
			blog.listarTodasAsPostagens(0);

			//POSTANDO AS POSTAGENS
			blog.publicarPostagem(postagem01);
			blog.listarPostagensPublicadas(0);
			blog.publicarPostagem(postagem02);
			blog.listarPostagensPublicadas(0);

			//IMPRIMINDO AS POSTAGENS PUBLICADAS
			blog.listarPostagensPublicadas(1);
			
			//IMPRIMINDO TODAS AS POSTAGENS
			blog.listarTodasAsPostagens(1);

		}else{
			//IMPRESS�O CASO O USUARIO N�O SEJA CORRETO
			System.out.println("Login incorreto!!");
		}
	}
}