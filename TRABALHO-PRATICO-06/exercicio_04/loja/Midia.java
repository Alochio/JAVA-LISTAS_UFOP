package loja;

public class Midia {
	
	private int codigo;
	private double preco;
	private String nome;
	
//---------------------------------------------------------------
//M�TODOS GET AND SET
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
//---------------------------------------------------------------	
//CONSTRUTORES
	
	public Midia(){
		
	}
	
	public Midia(int c, double p, String n){
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}
//---------------------------------------------------------------
	
	public String getTipo(){
		return "Midia";
	}
	
	public String getDetalhes(){
		return "Tipo: " + getTipo() + "\nCodigo: " + getCodigo() +
				"\n" + "Pre�o: " + getPreco() + "\n" + "Nome: " + getNome() + "\n";
	}
	
	public void printDados(){
		System.out.println("Tipo: " + getTipo() + "\nCodigo: " + getCodigo() +
				"\n" + "Pre�o: " + getPreco() + "\n" + "Nome: " + getNome());
	}

//--------------------------------------------------------------------------------------------
//FALTA IMPLEMENTAR
	public void inserirDados(){	
	}
//--------------------------------------------------------------------------------------------

}