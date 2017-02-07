package almoco1;

public class Almoco1 {

	public static void main(String[] args){		
		Mesa m1 = new Mesa(4,"Sala");
		Mesa m2 = new Secretaria(4);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}
	
}
