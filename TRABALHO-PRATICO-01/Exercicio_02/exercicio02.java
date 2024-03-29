package principal;
import java.util.Scanner;

public class Main {
	public  static void main(String[] args){ //inicio da main
		
		int n;
		
		System.out.print("Quantos numeros deseja digitar:");
		
		Scanner scan = new Scanner(System.in); //criando um scanner
		n = scan.nextInt(); //solicitando um valor pelo teclado
		
		int[] vet = new int[n]; //criando um vetor chamado vet com o tamanho n, que foi atribuido pelo teclado
		
		lerValores(vet,n);	//chamando m�todo lerValores, passando para ele os valores de vet e de n
	}
	public static int lerValores(int vet[], int n){ //inicio do m�todo
		
		System.out.println("Agora digite os numeros:");
		
		Scanner sc = new Scanner(System.in); //criando um novo scanner
		
		for(int cont = 0; cont < vet.length; cont++){ //um la�o para poder preencher o vetor
			System.out.print("vet [" + cont + "] = ");
			vet[cont] = sc.nextInt();
		}
		
		System.out.println("Valores salvos!");
		
		numerosPrimos(vet); //chamando o m�todo numerosPrimos e passando para ele o valor do vetor, que foi informado por meio de leitura no teclado
		return n;
	}
	
public static void numerosPrimos(int vet[]){
		
		int[] vetPrimos = new int[vet.length];	//criando um vetor para salvar os numeros primos
		int[] posicaoPrimos = new int [vet.length]; //criando um vetor para salvar as posi��es em que os numeros primos estavam no vetor
		
		for (int i = 0; i < vet.length; i ++){ //inicia os vetores criados a cima com o valor de -1
		    vetPrimos[i] = -1;
		    posicaoPrimos[i]=-1;
		}

		boolean aux; //variavel booleana para auxiliar na verifica��o do valor
		
		
		for(int i = 0; i < vet.length; i++){ //la�o que ir� passar por todos os vetores
		    
		    aux = true; //reinicia a variavel com um valor de verdadeiro
		    
			for(int j = 0; j < vet[i]; j++){ //la�o para verificar se o vetor n�o � primo 
			   if (j > 1) { 
				if (vet[i] % j == 0 && j != vet[i]){ 
					aux = false; //caso pase nas condi��es, a variavel aux receber� false
				}
			   }
			}
			
			if (aux == true){ //caso o valor continue true, ir� ser passado o valor ao vetor correto  
			    int aux2 = -1; //iniciando uma variavel auxiliar com o valor de menos 1
                 for(int x=0; x < vetPrimos.length; x++){ //la�o para passar por todo o vetor
			        if(vetPrimos[x] == -1 && aux2 == -1){ //condi��o que analiza se o numero j� foi adicionado pelo for
    			        vetPrimos[x] = vet[i]; //atribui o valor de vet a vetPrimos
			            posicaoPrimos[x] = i;  //atribui o valor de i a posi��o
			            aux2 = 0; //atribui o valor de 0 ao aux
		        	        }
                     }
			}
		} 
		
		System.out.println("Dos numeros digitados, s�o primos: ");
		
		for(int cont = 0; cont < vet.length; cont++){ //imprimindo os numeros primos
		    if(vetPrimos[cont] != -1){ //removendo os que tem o valor -1, que eu usei para deixar no lugar os numeros n�o s�o primos
			System.out.print(vetPrimos[cont] + " "); //imprimindo
		    }
		}
		
		System.out.println();
		System.out.println("Posi��o (a ordem � a mesma da ordem dos numeros primos a cima): ");
		
		for(int cont = 0; cont < vet.length; cont++){ //la�o para imprimir as posi��es dos numeros primos
		    if(posicaoPrimos[cont] != -1){ //condi��o para n�o imprimir os que tem valor -1, valor usado nas posi��es dos numeros que n�o s�o primos
			System.out.print(posicaoPrimos[cont] + " "); //imprimindo
		    }
		}
	}
}
