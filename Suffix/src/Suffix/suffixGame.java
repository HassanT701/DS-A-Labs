package Suffix;

import java.io.*;
import java.util.Scanner;

public class suffixGame {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("suffixgame"));
		
		int g = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < g; i++) {
        	System.out.println("Game #" + (i + 1) + ":\n");

            String[] words = sc.nextLine().split(" ");
            String word1 = words[0];
            String word2 = words[1];

            System.out.println("       The input words are " + word1 + " and " + word2 + ".\n");

            int index1 = word1.length() - 1;
            int index2 = word2.length() - 1;

            while (index1 >= 0 && index2 >= 0 && word1.charAt(index1) == word2.charAt(index2)) {
                index1--;
                index2--;
            }

            String finalWord1 = word1.substring(0, index1 + 1);

            index1 = word2.length() - 1;
            index2 = word1.length() - 1;

            while (index1 >= 0 && index2 >= 0 && word2.charAt(index1) == word1.charAt(index2)) {
                index1--;
                index2--;
            }

            String finalWord2 = word2.substring(0, index1 + 1);

            if (finalWord1.isEmpty()) {
                finalWord1 = word1.substring(0, 1);
            }
            if (finalWord2.isEmpty()) {
                finalWord2 = word2.substring(0, 1);
            }

            System.out.println("       The words entered in the notebook are " + finalWord1 + " and " + finalWord2 + ".\n");
      
        }

	}

}
