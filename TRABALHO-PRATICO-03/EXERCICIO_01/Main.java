package empresa;

public class Main {
	public static void main(String[] args){
		
//CRIANDO EMPREGADO
		System.out.println("\t Empregado Criado: ");
		Empregado empregado01 = new Empregado("Vinicius", 3000.50);
		empregado01.printInfo();
		
//EMPREGADO COM O M�TODO DE PROMO��O
		System.out.println("\t Empregado ap�s promo��o: ");
		empregado01.setSalario(empregado01.promocao(empregado01.getSalario()));
		empregado01.printInfo();
			
//EMPREGADO COM O M�TODO DE GRATIFICA��O
		System.out.println("\t Empregado ap�s gratifica��o");
		empregado01.setSalario(empregado01.gratificacao(empregado01.getSalario()));
		empregado01.printInfo();
	}
}