import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Transactions {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("transaction"));
		int y = sc.nextInt();
		sc.nextLine();
		for(int x = 0; x < y; x++) {
			Double c = sc.nextDouble();
	
			if(c < 5000) {
				System.out.println("approved");
		}
		
			else if(c >= 5000 && c < 50000) {
	
		System.out.println("maybe not");
		
			}
			else { 
				System.out.println("uh-oh");
				
			}
		}
		
	}
}
