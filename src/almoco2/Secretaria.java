package almoco2;

public class Secretaria implements Mesa {
	
	int nPernas;
	String divisao;
	
	public Secretaria(int pernas,String divisao){
		this.nPernas = pernas;
		this.divisao = divisao;
	}
	
	@Override
	public String getDivisao(){
		return divisao;
	}
	
	@Override
	public int getPernas(){
		return nPernas;
	}
	
	public String toString(){
		return "Uma mesa de "+getPernas()+" pernas na "+getDivisao();
	}

}
