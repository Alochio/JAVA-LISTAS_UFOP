package loja;

public class DVD extends Midia{
	
	private int nFaixas;

//------------------------------------------------------------------------------------------
//M�TODOS GET AND SET
	public int getNFaixas(){
		return this.nFaixas;
	}
	public void setFaixas(int f){
		this.nFaixas = f;
	}
//------------------------------------------------------------------------------------------	
//CONSTRUTORES
	public DVD(){
	}
	
	public DVD(int c, double p, String s, int f){
		super(c,p,s);
		this.nFaixas = f;
	}
//------------------------------------------------------------------------------------------

	public String getTipo(){
		return "DVD";
	}

	public String getDetalhes(){
		return "Tipo: " + getTipo() + "\nNumero de faixas: " + getNFaixas(); 
	}
		
//--------------------------------------------------------------------------------------------
//FALTA IMPLEMENTAR
	public void inserirDados(){
	}
//--------------------------------------------------------------------------------------------
	@Override
	public void printDados(){
		System.out.println("--------------------------------------------");
		super.printDados();
		System.out.println("Numero de faixas: " + getNFaixas());
	}
}