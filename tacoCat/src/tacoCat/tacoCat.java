package tacoCat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tacoCat {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("taco"));
		int y = sc.nextInt();
		sc.nextLine();
		for(int x = 0; x < y; x++) {
			int m = sc.nextInt();
			
			int e = sc.nextInt();
			
			int c = sc.nextInt();
			
			int u = sc.nextInt();
			
			
			int a = m / c;
			
			int b = e / u;
			
			int z = Math.min(a, b);
	
			
			
			System.out.println("" + z + "");
		}
	
}
	
}
