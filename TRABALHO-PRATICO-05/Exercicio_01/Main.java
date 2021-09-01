package principal;

public class Main {
	public static void main(String[] args){
		
		Lampada l1 = new Lampada();
		l1.setLuminosidadeDaLampada(80);
		l1.estadoDaLampada(l1.getLuminosidadeDaLampada());
		l1.setWhatsLampada(30);
		System.out.println("Whats da Lampada: " + l1.getWhatsDaLampada());
		System.out.println("A lampada � economica: " + l1.Eeconomida(l1.getWhatsDaLampada()));	
		System.out.println("Quantidade de vezes acesa: " + l1.getQuantidadeDeVezesAcesa());
		System.out.println("Instancias criadas: " + l1.instanciasCriadas);
		
		System.out.println("\n------------------------------------\n");
		
		Lampada l2 = new Lampada();
		l1.setLuminosidadeDaLampada(0);
		l1.estadoDaLampada(l2.getLuminosidadeDaLampada());
		l1.setWhatsLampada(50);
		System.out.println("Whats da Lampada: " + l2.getWhatsDaLampada());
		System.out.println("A lampada � economica: " + l1.Eeconomida(l1.getWhatsDaLampada()));
		System.out.println("Quantidade de vezes acesa: " + l2.getQuantidadeDeVezesAcesa());
		System.out.println("Instancias criadas: " + l2.instanciasCriadas);
		
		System.out.println("\n------------------------------------\n");
		
		Lampada l3 = new Lampada(30);
		l1.setLuminosidadeDaLampada(100);
		l1.estadoDaLampada(l3.getLuminosidadeDaLampada());
		l1.setWhatsLampada(80);
		System.out.println("Whats da Lampada: " + l3.getWhatsDaLampada());
		System.out.println("A lampada � economica: " + l1.Eeconomida(l1.getWhatsDaLampada()));
		System.out.println("Quantidade de vezes acesa: " + l1.getQuantidadeDeVezesAcesa());
		System.out.println("Instancias criadas: " + l3.instanciasCriadas);
		
		System.out.println("\n------------------------------------\n");
	
	}
}
