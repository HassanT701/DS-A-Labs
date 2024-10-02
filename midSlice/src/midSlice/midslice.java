package midSlice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class midslice {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("mid"));
		int io = sc.nextInt();
		sc.nextLine();
		
		for(int x = 0; x < io; x++) {
			String obj = sc.nextLine();
			if(obj.charAt(obj.length()-1) == '?') {
				System.out.println("A’ight, wha’ever.");
		}
			else if(obj.charAt(obj.length()-1) == '.') {
				System.out.println("Dood, tha’s jus like you are ‘pinion man");
			}
			else {
				System.out.println("Quit killin’ me vibes mon.");
			}
	}
}
}
