import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CandyQuota {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("candy"));
		int y = sc.nextInt();
		sc.nextLine();
		for(int x = 0; x < y; x++) {
			int a = sc.nextInt();
			int d = a * 11;
			int b = sc.nextInt();
			int e = b * 20;
			int c = sc.nextInt();
			int f = c * 8;
			
			int z = d + e + f;
	
			System.out.println(sugar(z));
		}
	
}
	
	public static boolean sugar (int z) {
		if(z <= 600) {
			return true;
	}
		else {
			return false;
		}
	}
}
