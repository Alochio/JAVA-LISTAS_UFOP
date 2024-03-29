package principal;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args){
		
		int i = 10; // valor para a quantidade de linhas da matriz (10 linhas, ou seja, 10 alunos)
		int j = 4; // valor para a quantidade de colunas da matriz (4 colunas, ou seja, 4 informa��es sobre os alunos)
		String ano = "2021"; //ano atual
		String semestre = "1"; //semestre atual
		 
		int[][] dados = new int[i][j]; //matriz principal
		String [] codigoMatricula = new String [i];
		
		lerValores(dados, codigoMatricula, i, j, ano, semestre); //chamando o m�todo lerValoress
	}
	
	public static void lerValores(int dados[][],String codigoMatricula[], int i, int j, String ano, String semestre){ //metodo lerValores
		
		Scanner scan = new Scanner(System.in);

		int[] matricula = new int[i];
		 
		int aux = -1, aux2 = -1, aux3 = -1; //variaveis auxiliares
		
		for (int cont = 0; cont < dados.length; cont++){ //este la�o serve para capturar as informa��es de aluno por aluno
			System.out.println("\tDigite as informa��es do aluno (" + cont + ")\n");
			
			System.out.print("Matricula (deve conter 3 digitos): ");
			  aux2 = scan.nextInt();
			 

		    
			if (aux3 == -1){
				for(int cont2 = 0; cont2 < dados[cont].length; cont2++){
					switch (cont2) { //usei o Switch para poder colocar as informa��es na coluna certa na matriz
					   
					case 0:
						 if (aux2 > 99 && aux2 < 1000){ //condi��o para o numero digitado conter 3 digitos
								matricula[cont] = aux2;
								dados[cont][0] = matricula[cont];
								 
							  }else{
								  System.out.println("VALOR INVALIDO!!");
								  cont--;
								  aux3 = 0;
							  }
						break;
					case 1: //para colocar as informa��es na coluna 1
						  System.out.print("Sexo(0 = Feminino/ 1 = Masculino) : ");
						  aux = scan.nextInt();
						  
						  if (aux == 0 || aux == 1){ //condi��o para que possa somente ser digitados os valores 0 e 1
							  dados[cont][cont2] = aux;
							  aux = -1;
						  }else{ //caso o valor seja diferente de 0 e 1
							  System.out.println("VALOR INVALIDO!!"); //imprime VALOR INVALIDO
							  aux = -1;
							  cont2--;
						  }
					    break;
					 
					case 2: //para colocar as informa��es na coluna 2
						 System.out.print("C�digo do Curso (valor com 4 digitos): ");
						aux = scan.nextInt();
						  
						  if(aux >= 999 && aux <= 10000){ //condi��o que faz com que s� possa ser digitada uma nota que esteja entre 0 e 10
							  dados[cont][cont2] = aux;
							  aux = -1;
						  }else{ //caso seja digitado um valor diferente do desejado
							  System.out.println("VALOR INVALIDO!!"); //Imprime VALOR INVALIDO
							  aux = -1;
							  cont2--;
						  }
						  break;
					    
					  
					case 3: //para colocar as informa��es na coluna 3
						  System.out.print("CR (0 - 10) : ");
						  aux = scan.nextInt();
						  
						  if(aux >= 0 && aux <= 10){ //condi��o que faz com que s� possa ser digitada uma nota que esteja entre 0 e 10
							  dados[cont][cont2] = aux;
							  aux = -1;
						  }else{ //caso seja digitado um valor diferente do desejado
							  System.out.println("VALOR INVALIDO!!"); //Imprime VALOR INVALIDO
							  aux = -1;
							  cont2--;
						  }
						  break;
					}//fim switch
			} //fim do segundo for
			}else{
				aux3 = -1;
			}
		} //fim do primeiro for	
				

		for(int cont = 0; cont < i; cont++){ //criando o codigo de matricula do aluno
			Integer.toString(matricula[cont], dados[cont][2]); //convertendo o vetor matricula e a matriz dados para inteiro
			codigoMatricula[cont] = ano + semestre + dados[cont][2] + matricula[cont]; //para criar o vetor codigoMatricula
		}
				
		imprimir(dados,codigoMatricula, i, j); //chamando o metodo imprimir
	} //fim ler valores

	
	public static void imprimir(int dados[][],String codigoMatricula[], int i, int j){ //metodo imprimir
		
		System.out.println("\n\t     Informa��es dos alunos informados: ");
		System.out.println("\t(Codigo da Matricula - Numero da Matricula - Sexo - Codigo do Curso - CR)");
		
		for (int cont = 0; cont < dados.length; cont++){ //este la�o serve para mostrar na tela todos os alunos que foram capturados
			System.out.print(codigoMatricula[cont] + "\t");
			for(int cont2 = 0; cont2 < dados[cont].length; cont2++){
				System.out.print(dados[cont][cont2] + "\t");
			}
			System.out.println("");
		}		
		maiorCR(dados,codigoMatricula, i, j); //chamando m�todo maiorCR
	}//fim imprimir
	
	public static void maiorCR(int dados[][],String codigoMatricula[], int i, int j){ //m�todo maiorCR
		
		Scanner scan = new Scanner(System.in); 
		int comparar;
		
		System.out.print("\n\nDigite o c�digo do curso que deseja analizar: ");
		comparar = scan.nextInt(); //lendo no teclado qual o curso que deseja saber os alunos com maior coeficiente
		
		
		for(int cont = 0; cont == 0; ){ //la�o para receber o curso que a pessoa deseja procurar o maior CR
			if(comparar > 999 && comparar < 10000){ // condi��o que n�o deixa o valor ter menos de 4 digitos
				cont = 1;
			}else{
				System.out.print("VALOR INVALIDO!!\nDigite novamente: "); //caso seja digitado um valor que n�o seja o esperado, pede para o usuario digitar novamente
				comparar = scan.nextInt();
				cont = 0;
			}	
		}
		
		int aux = -1, aux2 = -1, aux3 = -1; //inteiros auxiliares
		int[] posicao = new int[i]; //vetor auxiliar
		
		for(int cont = 0; cont < posicao.length; cont++){ //preenche todo o vetor auxiliar com o valor -1
			posicao[cont] = -1;
		}
		
		
		for (int cont = 0; cont < dados.length; cont++){
				if(dados[cont][1] == 0){
					
					if (dados[cont][2] == comparar){//analiza se o aluno est� matriculado no curso solicitado
						if(aux2 == -1){ //analiza se � a primeira vez que entra nessa condi��o
							if(dados[cont][3] > aux){ //caso o valor seja maior do que -1
								aux = dados[cont][3]; //aux recebe o valor da matriz
								aux2 = 0; //serve para informar se j� passou por aqui
								aux3 = cont; //salva a posi��o
								posicao[aux3] = cont; //salva a posi��o dentro do meu vetor auxiliar de posi��es
							}
						}
						if(aux2 == 0){ //se caso for a segunda vez que for salvar um numero
							if(dados[cont][3] > aux){ //caso seja maior do que o valor salvo anteriormente
								aux = dados[cont][3]; 
								posicao[aux3] = -1; //remove o valor anterior
								aux3 = cont;
								posicao[aux3] = cont; //armazena o novo
								
							}
							if(dados[cont][3] == aux){ //caso o valor de agora seja igual ao anterior
								aux3 = cont;
								posicao[aux3] = cont; //somente armazena a nova
							}
						}
					}	
			}			
				}
		
			if(aux2 == -1){ //caso n�o haja o curso que foi solicitado
				System.out.println("CURSO N�O CADASTRADO!!");
			}
			
		System.out.print("\n\tA aluna(s) com maior CR do curso solicitado\n");
		System.out.println("\t(Codigo Matricula - Numero da Matricula - Sexo - Codigo do Curso - CR)");

		for(int cont = 0; cont < dados.length; cont++){ //realiza a impress�o final, com os maiores CRs
			if(posicao[cont] != -1){ //analiza o vetor auxiliar posi��o, caso o seu valor seja diferente do meu valor que eu usei para setar que neste caso � -1
				System.out.print(codigoMatricula[cont] + "\t"); //imprime o c�digo de matricula
				for(int cont2 = 0;cont2 < dados[cont].length; cont2++){ //imprime o resto dos valores da matriz
					System.out.print(dados[cont][cont2] + "\t");
				}
				System.out.println(""); //salta uma linha por est�tica
			}
		}		
		}//fim maiorCR
}