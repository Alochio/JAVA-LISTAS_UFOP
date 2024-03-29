package principal;

public class Restaurante extends Empresa{

	private String tipoDeComida;
	private double precoMedio;
	
//-----------------------------------------------------------------------------------------
//CONSTRUTOR

	public Restaurante(String nome, String endereco,
			String cidade, String estado, String cep, String telefone){
		
		super(nome,endereco,cidade,estado,cep,telefone);
	}

//-----------------------------------------------------------------------------------------
//METODOS GET AND SET
	
	public String getTipoDeComida() {
		return tipoDeComida;
	}

	public void setTipoDeComida(String tipoDeComida) {
		this.tipoDeComida = tipoDeComida;
	}

	public double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}

//-----------------------------------------------------------------------------------------
//PRINTS
	
	public void printTipoDeComida(){
		System.out.println("Tipo da comida: " + getTipoDeComida());
	}
	public void printPrecoMedio(){
		System.out.println("Preco m�dio dos pratos: " + getPrecoMedio());
	}
}
