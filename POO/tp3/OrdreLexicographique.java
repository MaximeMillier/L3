package tp3;
import java.util.*;

public class OrdreLexicographique {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		Arrays.sort(args, String.CASE_INSENSITIVE_ORDER);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}


}
