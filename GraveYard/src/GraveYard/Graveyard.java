package GraveYard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Graveyard {

	public static void main(String[]args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("graveyard.dat"));
		
		List<String> arr = new ArrayList();
		Map<String, Integer> letCount = new HashMap<>();
		
		while(sc.hasNextLine()) {
			
			String in = sc.nextLine();
			in = in.toUpperCase();
			//System.out.println(in);
			in = in.replaceAll("[\\s\\p{Punct}‘’“”]", "");
			//System.out.println(in);
			
			
			for(int v = 1; v < in.length() - 1; v++) {
	
				arr.add(String.valueOf(in.charAt(v)));
				
			}
		}
			//System.out.println(arr);
			
	        for (String letter : arr) {
	            letCount.put(letter, letCount.getOrDefault(letter, 0) + 1);
	        }

	        
	        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(letCount.entrySet());
	        
	        
	        sorted.sort((entry1, entry2) -> {
	            int comp = entry2.getValue().compareTo(entry1.getValue());
	            return comp != 0 ? comp : entry1.getKey().compareTo(entry2.getKey());
	        });
	        
	        for (Map.Entry<String, Integer> entry : sorted) {
	        	String letter = entry.getKey();
	            int count = entry.getValue();

	            for (int i = 0; i < count; i++) {
	                System.out.print(letter);
	            }

	            System.out.println("");
	        }
	        
	        
	       
		}
	}

