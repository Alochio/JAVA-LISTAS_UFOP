package principal;

//----------------------------------------------------------------------------------------
//QUEST�O 02

public class LampadaFluorecente extends Lampada{

	private float comprimento;
	
	
	public LampadaFluorecente(float comprimento){
		this.comprimento = comprimento;
	}
	
	public LampadaFluorecente(int whatsDaLampada, float comprimeto){
		super(whatsDaLampada);
		this.comprimento = comprimento;
	}
	
	public float getComprimentoDaLampada(){
		return this.comprimento;
	}
}
//----------------------------------------------------------------------------------------