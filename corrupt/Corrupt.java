package corrupt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Corrupt {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("comm"));
		 int n = sc.nextInt();
	        ArrayList<String> lis = new ArrayList<String>();
	        sc.nextLine();
	        for(int i = 0; i < n; i++) {
	            String y = sc.nextLine();
	            String[] words = y.split(" ");
	            if(words.length > 0){
	                lis.add(words[0]);
	                lis.add(words[words.length-1]);
	            }
	        }
	        String corruptMSG = "";
	        for (int i = 0; i < lis.size(); i++) {
	            corruptMSG += lis.get(i);
	            if (i < lis.size() - 1) {
	                corruptMSG += " ";
	            }
	        }
	        corruptMSG += ".";
	        System.out.print(corruptMSG);


}
