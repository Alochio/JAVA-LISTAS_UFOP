package testaEstrutura;
import estrutura.Automovel;
import estrutura.Bicicleta;

public class Main {
	public static void main(String[] args){

//----------------------------------------------------------------------
//TESTANDO A CLASSE AUTOMOVEL
		
		System.out.println("Automovel: ");
		Automovel automovel = new Automovel();
		
		automovel.acelerar(100);
		
		System.out.println(automovel.getVelocidade());
		System.out.println(automovel.getEstado());
		automovel.parar();
		System.out.println(automovel.getEstado());
		automovel.trocarOleo(12);
//----------------------------------------------------------------------		
//TESTANDO A CLASSE BICICLETA
		
		System.out.println("Bicicleta: ");
		Bicicleta bicicleta = new Bicicleta();
		
		bicicleta.acelerar(25);
		
		System.out.println(bicicleta.getVelocidade());
		System.out.println(bicicleta.getEstado());
		bicicleta.parar();
		System.out.println(bicicleta.getEstado());
	}

}
