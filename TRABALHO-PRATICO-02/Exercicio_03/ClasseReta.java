package principal;
import java.util.Scanner;
import java.math.*;

public class ClasseReta {
	
//CRIANDO AS VARIAVEIS
	private double[] reta = new double[4];
	private double[] reta2 = new double[4];
	public double coefAng, coefLin, aux, aux1, aux2;
	public String representReta;
	public int b = 0;
	
//CRIANDO UMA FUN��O SCANNER
	Scanner s1 = new Scanner(System.in);
	
//CRIANDO O M�TODO LERRETA
	public double lerReta(){
		
			System.out.println("Primeira reta: ");
			System.out.println("Posi��o do ponto A da Reta");
			System.out.print("X = ");
			reta[0] = s1.nextDouble();
			System.out.print("Y = ");
			reta[1] = s1.nextDouble();
			System.out.println("Posi��o do ponto B da Reta");
			System.out.print("X = ");
			reta[2] = s1.nextDouble();
			System.out.print("Y = ");
			reta[3] = s1.nextDouble();
			aux  = reta[2] / reta[3];
			
			return aux;
	}	
	
//METODO PARA LER A SEGUNDA RETA
	public double lerReta2(){

		System.out.println("Segunda Reta: ");
		System.out.println("Posi��o do ponto A da Reta");
		System.out.print("X = ");
		reta2[0] = s1.nextDouble();
		System.out.print("Y = ");
		reta2[1] = s1.nextDouble();
		
		System.out.println("Posi��o do ponto B da Reta");
		System.out.print("X = ");
		reta2[2] = s1.nextDouble();
		System.out.print("Y = ");
		reta2[3] = s1.nextDouble();
		
		aux1 = reta2[2] / reta2[3];
		
		return aux1;
	}	
	
//METODO PARA INFORMAR QUAL � O COEFICIENTE ANGULAR DA RETA
	public void coeficienteAngular(){
		coefAng = (reta[3] - reta[1]) / (reta[2] - reta[0]);
		System.out.println("O coeficiente angular da reta � = " + coefAng);
	}
	
//METODO PARA INFORMAR O COEFICIENTE LINEAR DA RETA
	public void coefLinear(){
		coefLin = (coefAng * (reta[2] - reta[3]))*(-1);
		System.out.println("O coeficiente linear da reta � = " + coefLin);
	}

//METODO PARA APRESENTAR A FORMULA SIMPLIFICADA DA RETA
	public void representeReta(){
		String.valueOf(coefAng);
		String.valueOf(coefLin);
		representReta = "Y = (" + coefAng + "X + " + coefLin + ")";	
		System.out.println(representReta);
	}
	
//METODO PARA COMPARAR A RETA1 COM A RETA QUE SER� DIGITADA POR ESTE METODO
	public void comparaRetas(){

		double a, b, c;
		double k , w = 0, x = 0, y , z = 0;
		
		a = this.lerReta2();
		b = this.aux;
		
		y = b;
		k = a;
		
		c = reta[2] - reta[0];
		
		for(int cont = 0; cont < c ; cont++){
				if (k == y){
					w = cont;
					x = a;

					k = k + a;
					y = y + b;
					z++;
			}
		}
//IMPRESS�ES FALANDO SE POSSUI INTERSE��O OU N�O OU SE AS RETAS S�O PARALELEAS
		if(z == 1){
			System.out.println("Possui interse��o!!");
			System.out.println("(" + w + "," + x + ")");
		}
			if(z > 1){
				System.out.println("As retas s�o paralelas!!");
			}
		if(z == 0){
			System.out.println("As retas n�o possuem interse��o!!");
		}
	}	
}