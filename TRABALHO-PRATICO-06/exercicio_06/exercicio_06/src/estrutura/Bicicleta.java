package estrutura;

public class Bicicleta extends Veiculo{

	private float velocidade;
	private boolean estado;
	
//---------------------------------------------------------------------------
//M�TODOS GET
	public float getVelocidade(){
		return this.velocidade;
	}
	public boolean getEstado(){
		return this.estado;
	}
//---------------------------------------------------------------------------
//CONSTRUTOR SEM ARGUMENTOS
	public Bicicleta(){
		
	}
//----------------------------------------------------------------------------
	public float acelerar(float velocidade){
		this.velocidade = velocidade;
		
		if (velocidade > 0){
			this.estado = true;
		}else{
			this.estado = false;
		}
		return velocidade;
	}
	
	public void parar(){
		this.estado = false;
	}
}