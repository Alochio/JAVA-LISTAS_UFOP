package principal;

public class Main {
	public static void main(String[] args){
		
		LampadaFluorecente lf1 = new LampadaFluorecente(10);
		System.out.println("o Comprimento da l�mpada �: " + lf1.getComprimentoDaLampada());
		System.out.println("Whats da Lampada: " + lf1.getWhatsDaLampada());
		System.out.println("Instancias criadas: " + lf1.getInstanciasCriadas());
		
		System.out.println("-----------------------------------------------------");
		
		
		LampadaFluorecente lf2 = new LampadaFluorecente(80, 10);
		System.out.println("o Comprimento da l�mpada �: " + lf2.getComprimentoDaLampada());
		System.out.println("Whats da Lampada: " + lf2.getWhatsDaLampada());
		System.out.println("Instancias criadas: " + lf1.getInstanciasCriadas());
	}
}
