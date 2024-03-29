package principal;
import java.util.Scanner;

public class Pa�s {
	
//CRIANDO AS VARIAVEIS USADAS NO C�DIGO
	private String codigoISO;
	private String nome;
	private double populacao;
	private double dimensao;
	public int a = 1;
	private String[] limitrofes = new String[3];
	
//CRIANDO UM SCANNER
	Scanner sc = new Scanner(System.in);
	
//CRIANDO OS M�TODOS GET E SET DAS V�RIAVEIS PRIVADAS
	public void setCodigoISO(String codigoISO){
		this.codigoISO = codigoISO;
	}
	public String getCodigoISO(){
		return this.codigoISO;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setPopulacao(double populacao){
		this.populacao = populacao;
	}
	public double getPopulacao(){
		return this.populacao;
	}
	public void setDimensao(double dimensao){
		this.dimensao = dimensao;
	}
	public double getDimensao(){
		return this.dimensao;
	}
	
	public void setLimitrofes(String[] limitrofes){
		this.limitrofes = limitrofes;
	}
	public String[] getLimitrofes(){
		return this.limitrofes;
	}
	
//UM M�TODO QUE SERVE SOMENTE PARA MOSTRAR QUAL PA�S EST� SENDO ANALIZADO
	public void imprimeNumPais(){
		System.out.print("Pais: " + a + "\n");
		a++;
	}
	
//M�TODO CRIA PAIS, ONDE POR AQUI IR� RECEBER TODAS AS INFORMA��ES NECESS�RIAS
	public void criaPais(){
		System.out.print("Digite o c�digo ISO do pa�s: ");
		this.setCodigoISO(sc.next());
		System.out.print("Digite o nome do pa�s: ");
		this.setNome(sc.next());
		System.out.print("Digite a quantidade populacional do pa�s, em milh�es: ");
		this.populacao = sc.nextDouble();
		System.out.print("Digite o tamanho do pa�s: ");
		this.dimensao = sc.nextDouble();		
	}
	
//M�TODO QUE CALCULA A DENSIDADE POPULACIONAL DO PA�S
	public double densidadePopulacional(double pupulacao, double dimensao){
		pupulacao = populacao *1000;
		return populacao/dimensao;
	}
	
//M�TODO PARA LER OS PA�SES QUE S�O LIMITROFES DO PA�S QUE EST� SENDO CRIADO
	public void declaraLimitrofe(){
		int aux = 1;
		for(int cont = 0; cont < limitrofes.length; cont++){
			System.out.print("Digite o " + aux + " pa�s limitrofe: ");
			limitrofes[cont] = sc.next();
			aux++;
		}
	}
	
//M�TODO PARA ANALIZAR SE OS PA�SES S�O LIMITROFES OU N�O, E IMPRIME O RESULTADO
	public void analizaLimitrofes(String[] limitrofes1,String nome1, String nome2, String[] limitrofes2){
		boolean aux = false;
		
		for (int cont = 0; cont < limitrofes1.length; cont++){
			if (nome2.equals(limitrofes1[cont])){
				aux = true;
			}
		}
		for (int cont = 0; cont < limitrofes2.length; cont++){
			if (nome1.equals(limitrofes2[cont])){
				aux = true;
			}
		}
		if (aux == true){
			System.out.println("Os pa�ses s�o limitrofes. ");
		}
		else{
			System.out.println("Os pa�ses n�o s�o limitrofes. ");
		}
	}
	
//M�TODO PARA A IMPRESS�O DE TODAS AS INFORMA��ES QUE FORAM COLETADAS E CALCULADAS
	public void imprime(String codigoIso, String nome, double densidadePopulacional, String[] limitrofes){
		
		System.out.println("C�digo ISO = " + codigoIso.toUpperCase());
		System.out.println("Nome = " + nome);
		System.out.print("Densidade populacional = " + densidadePopulacional + " pessoas por Km^2");
		System.out.println("\nPaises Limitrofes: ");
		for(int cont = 0; cont < limitrofes.length; cont++){
			System.out.println(limitrofes[cont]);
		}		
	}
	
//UM M�TODO CRIADO SOMENTE PARA FAZER UMA IMPRESS�O DE UMA LINHA NO C�DIGO, SOMENTE PARA EST�TICA
	public void fazLinha(){
		System.out.println("---------------------------------------------------------");
	}		
}