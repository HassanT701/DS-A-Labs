package HashtableOfwords;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class HashTableRunner {

	public static void main(String[] args)throws FileNotFoundException {
		//Scanner sc = new Scanner(new File("words.dat"));
		//int y = sc.nextInt();
		
		//for(int x = 0; x <= y; x++) {
		try {
			Scanner sc = new Scanner(new File("words.dat"));
            
            HashTable<Word> hashTable = new HashTable<>(sc.nextInt());

            while (sc.hasNextLine()) {
                hashTable.add(new Word(sc.nextLine()));
            }

            System.out.println(hashTable);
        } catch (Exception e) {
            System.out.println("Houston, we have a problem!");
        }
    //}
	}
}
