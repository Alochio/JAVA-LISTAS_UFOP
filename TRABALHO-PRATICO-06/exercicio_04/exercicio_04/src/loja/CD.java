package loja;

public class CD extends Midia{

	private int nMusicas;
//------------------------------------------------------------------------------------------
//M�TODOS GET AND SET
	public int getNMusicas(){
		return this.nMusicas;
	}
//-----------------------------------------------------------------------------------------	
//CONSTRUTORES
	public CD(){
	}
	
	public CD(int c, double p, String s, int m){
		super(c,p,s);
		this.nMusicas = m;
	}
//------------------------------------------------------------------------------------------

	public void setMusica(int m){
		
	}
	
	public String getTipo(){
		return "CD";
	}


	public String getDetalhes(){
		return "Tipo: " + getTipo() + "\nNumero de musicas: " + getNMusicas();
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
		System.out.println("Numero de musicas: " + getNMusicas());
	}

}
