package almoco3;

public class Almoco3 {

	public static void main(String[] args){		
		
		Mesa m1 = new Secretaria(4,"Sala");
		Mesa m2 = new Secretaria(4,"Escritório");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}
	
}
