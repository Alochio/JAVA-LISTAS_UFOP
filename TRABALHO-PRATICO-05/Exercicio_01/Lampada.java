package principal;

public class Lampada {
	
	private int luminosidadeDaLampada;
	private String estadoDaLampada;
	
	public static int quantVezesAcesa; //LETRA - D
	public static int instanciasCriadas; //LETRA - F
		
//-------------------------------------------------------------------------------------
//LETRA - A

	public void setLuminosidadeDaLampada(int luminosidadeDaLampada){
		
		if (luminosidadeDaLampada > 0 || luminosidadeDaLampada < 100){
			this.luminosidadeDaLampada = luminosidadeDaLampada;
				
			//LETRA - D
			//--------------------------------------------------------
				if(luminosidadeDaLampada > 0){
					quantVezesAcesa = quantVezesAcesa + 1;
				}
			//--------------------------------------------------------
		}
		else{
			System.out.println("Valor invalido!!");
			System.out.println("Digite um valor de luminosidade entre 0 a 100");
		}
	}
	
	
	public void estadoDaLampada(int luminosidadeDaLampada){
		
		if(luminosidadeDaLampada == 0){
			estadoDaLampada = "Apagada";
			getLuminosidadeDaLampada();
			System.out.println("A lampada est� " + estadoDaLampada);
		}
		else if(luminosidadeDaLampada == 100){
			estadoDaLampada = "Acesa";
			System.out.println("A lampada est� " + estadoDaLampada);
		}
		else if(luminosidadeDaLampada > 0 || luminosidadeDaLampada <100){
			estadoDaLampada = "Meia-Luz";
			System.out.println("A lampada est� " + estadoDaLampada);
		}
	}
	

	public int getLuminosidadeDaLampada(){
		return this.luminosidadeDaLampada;
	}
	
	public String getEstadoDaLampada(){
		return this.estadoDaLampada;
	}
//-------------------------------------------------------------------------------------
//LETRA - B	

	public boolean estaLigado(double luminosidadeDaLampada){
		
		if(luminosidadeDaLampada == 0)
			return false;
		else
			return true;
	}
	
//-------------------------------------------------------------------------------------
//LETRA - C
	
	private int whatsLampada;
	
	public void setWhatsLampada(int whatsLampada){
		this.whatsLampada = whatsLampada;
	}
	
	public boolean Eeconomida(int whatsLampada){
		if(whatsLampada < 40)
			return true;
		else
			return false;
	}
//-------------------------------------------------------------------------------------
//LETRA - D
	
	public int getQuantidadeDeVezesAcesa(){
		return this.quantVezesAcesa;
	}
	
//------------------------------------------------------------------------------------
//LETRA - E
	
	public Lampada(int whatsLampada){
		this.whatsLampada = whatsLampada;
		instanciasCriadas = instanciasCriadas +  1; //LETRA - F
	}
	
	public Lampada(){
		this.whatsLampada = 60;
		instanciasCriadas = instanciasCriadas +  1; //LETRA - F
	}
	
	public int getWhatsDaLampada(){
		return this.whatsLampada;
	}
	
//------------------------------------------------------------------------------------
//LETRA - F
	
	public int getInstanciasCriadas(){
		return this.instanciasCriadas;
	}
}
