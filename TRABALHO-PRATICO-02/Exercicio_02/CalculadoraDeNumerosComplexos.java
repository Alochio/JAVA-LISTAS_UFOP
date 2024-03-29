package principal;

public class CalculadoraDeNumerosComplexos {

//CRIANDO AS VARIAVEIS PRIVADAS
	private double num1;
	private double num2;
	private double num3;
	private double num4;
	private String operacao;
	
//VARIAVEIS DE AUXILIO NAS CONTAS
	public double primeiroMembro;
	public double segundoMembro;
		
//CRIANDO METODOS GET AND SET DAS VARIAVEIS PRIVADAS
	public void setNum1(int num1){
		this.num1 = num1;
	}
	public double getNum1(){
		return this.num1;
	}
	
	public void setNum2(double num2){
		this.num2 = num2;
	}
	public double getNum2(){
		return this.num2;
	}
	public void setNum3(int num3){
		this.num3 = num3;
	}
	public double getNum3(){
		return this.num3;
	}
	
	public void setNum4(double num4){
		this.num4 = num4;
	}
	public double getNum4(){
		return this.num4;
	}
	
	public void setOperacao(String operacao){
		this.operacao = operacao;
	}
	public String getOperacao(){
		return this.operacao;
	}
	
//FUN��O QUE IMPRIME A OPERA��O QUE SER� RESULVIDA
	public void imprimeOperacao(){
		System.out.print("( " + num1 + " + " + num2 + "i )" + operacao + "( " + num3 + "+" + num4 + "i ) = ");
	}
	
//FUN��O QUE FAZ O CALCULO DAS OPERA��ES E J� IMPRIME O RESULTADO DAS MESMAS
	public void fazConta(){
		
		switch(operacao){
		
		case"+": //CASO SEJA SOMA
			primeiroMembro = num1 + num3;
			segundoMembro = num2 + num4;
			System.out.println("( " + primeiroMembro + " + "  + segundoMembro + "i )"  );
			break;
		
		case"-": //CASO SEJA SUBTRA��O
			primeiroMembro = num1 - num3;
			segundoMembro = num2 - num4;
			System.out.println("( " + primeiroMembro + " + "  + segundoMembro + "i )"  );
			break;

		case"*": //CASO SEJA MULTIPLICA��O

//REALIZANDO O CALCULO
			primeiroMembro = num1*num3 + (num2*num4)*(-1);
			segundoMembro =  num1*num4 + num2*num3;

//IMPRIMINDO O RESULTADO CASO O OPERADOR SEJA DE MULTIPLICA��O
			System.out.println("( " + primeiroMembro + " + "  + segundoMembro + "i )"  );
			break;
			
		case"/": //CASO SEJA DIVIS�O
		
//VARIAVEIS PARA O AUXILIO DAS CONTAS	
			double aux1, aux2, aux3, aux4;
			double numeradorNatural, numeradorComplexo;
			double denominadorNatural, denominadorComplexo;
			
//REALIZANDO AS CONTAS DO NUMERADOR
				aux1  = num1  *  num3;
				aux2  = num1  * (num4 * -1); //complexo
				aux3  = num2  *  num3; //complexo
				aux4  = (num2 * (num4 * -1)) * -1;
				
//ATRIBUINDO OS VALORES NATURAIS E COMPLEXOS DO NUMERADOR
				numeradorNatural  = aux1 + aux4;
				numeradorComplexo = aux2 + aux3; 
			
//REALIZANDO AS CONTAS DO DENOMINADOR
				aux1 =  num3 *  num3;
				aux2 =  num3 * (num4 * -1); //complexo
				aux3 =  num4 * num3; //complexo
				aux4 = (num4 * (num4 * -1)) * -1;
				
//ATRIBUINDO OS VALORES NATURAIS E COMPLEXOS DO DENOMINADOR
				denominadorNatural  = aux1 + aux4;
				denominadorComplexo = aux2 + aux3;
				
//IMPRIMINDO O RESULTADO CASO SEJA A OPERA��O SEJA DIVIS�O
				System.out.println("( " + numeradorNatural + " + "  + numeradorComplexo + "i )" + " / " + "( " + denominadorNatural + " + "  + denominadorComplexo + "i )");
		
				break;
				
		default: //CASO O OPERADOR N�O SEJA CORRETO
				System.out.println("OPERA��O INVALIDA!");
				System.out.println("Reiniciando a calculadora de complexos\n");
				fazConta();
				break;
		}
	}
}