package tp3;


public class Somme {
	
	
	public static void main(String[] args) {
		
		int add = 0;
		for(int i = 0; i < args.length ; i++) {
			add += Integer.parseInt(args[i]);
		}
		System.out.println(add);
		
		
		
	}

	

}