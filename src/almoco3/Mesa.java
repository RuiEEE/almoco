package almoco3;

public abstract class Mesa {

	int nPernas;
	String divisao;
	
	public Mesa(int pernas,String divisao){
		this.nPernas = pernas;
		this.divisao = divisao;
	}
	
	public String getDivisao(){
		return divisao;
	}
	
	public int getPernas(){
		return nPernas;
	}
	
	public String toString(){
		return "Uma mesa de "+getPernas()+" pernas na "+getDivisao();
	}
	
}
