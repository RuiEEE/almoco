package almoco1;

//Rui
public class Mesa {
	
	int nPernas;
	String divisao;
	
	public Mesa(){
		
	}
	
	public Mesa(int pernas){
		this.nPernas = pernas;
	}
	
	public Mesa(int pernas,String divisao){
		this.nPernas = pernas;
		this.divisao = divisao;
	}
	
	public int getPernas(){
		return nPernas;
	}
	
	public String getDivisao(){
		return divisao;
	}
	
	public String toString(){
		return "Uma mesa de "+getPernas()+" pernas na "+getDivisao();
	}

}
