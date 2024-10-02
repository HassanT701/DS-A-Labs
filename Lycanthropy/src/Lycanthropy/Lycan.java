package Lycanthropy;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class Lycan {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("therapy"));
		int y = sc.nextInt();
		sc.nextLine();
		for(int x = 0; x < y; x++) {
			Double w = sc.nextDouble();
			Double a = w * 3.14;
			Double c = 0.333;
			Double f = Math.pow(a, c);
			
			Double m = sc.nextDouble();
			Double b = m + 1234567890;
			Double e = 0.2;
			Double g = Math.pow(b, e);
			
			
			Double d = f / g; 
			Double h = Math.round(d * 1000.0) / 1000.0;
			
			
			
	
			System.out.println(h);
		}
		
		
		
		
		
	}

}
