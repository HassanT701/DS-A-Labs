import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class unique {
	
	public static void main (String[]args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("dupes"));
		
		while(sc.hasNextLine()){
			String[] words = sc.nextLine().split(" ");
			
			Set<String> set1 = new TreeSet<>();
			Set<String> set2 = new TreeSet<>();
			
			for(String x: words) {
				if(!set1.add(x)) {
					set2.add(x);
				}
			}
			System.out.println("Original list: " + Arrays.toString(words));
			System.out.println("Uniques: " +  set1);
			System.out.println("Duplicates: " + set2);
			System.out.println("");
		}
		
		
		
		
		
		
		
		
	}

}
