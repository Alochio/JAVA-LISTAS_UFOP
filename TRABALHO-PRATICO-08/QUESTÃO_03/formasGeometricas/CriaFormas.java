//CLASSE QUE USAREMOS COM O INTUITO DE CRIAR AS NOSSAS FORMAS, PARA QUE S� POSSAM SER CIADAS POR AQUI
package formasGeometricas;

public class CriaFormas {

	//M�TODO PARA A CRIA��O DAS FORMAS GEOM�TRICAS
	public static FormasGeometricas FactoryForma(String forma){
		
		//CASO SEJA QUADRADO, VAI USAR UMA CLASSE J� CRIADA
		if(forma.equals("Quadrado"))
			return new Quadrado();
		
		//CASO SEJA TRINGULO, VAI USAR UMA CLASSE J� CRIADA
		else if(forma.equals("Triangulo"))
			return new Triangulo();
		
		//CASO SEJA RET�NGULO, VAI USAR UMA CLASSE J� CRIADA
		else if(forma.equals("Retangulo"))
			return new Retangulo();
		
		//CASO N�O SEJA NENHUMA DAS ANTERIORES, IR� USAR O CONSTRUTOR DE FOMRAS GEOMETRICAS PARA CRIAR UMA NOVA FORMA
		else
			return new FormasGeometricas(forma);	
	}	
}