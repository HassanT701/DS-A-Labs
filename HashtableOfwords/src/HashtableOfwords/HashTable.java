package HashtableOfwords;

import java.util.LinkedList;

public class HashTable <T>{

	private LinkedList<T>[] table;

    private int greatest = 0;

    public HashTable(int size) {
        table = new LinkedList[size];
    }

    public void add(T element) {
        int index = element.hashCode();
        LinkedList<T> val;

        try {
            val = table[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }

        if (val == null) {
            table[index] = new LinkedList<>();
        }

        if (index > greatest) {
            greatest = index;
        }

        table[index].add(element);
    }

    public String toString() {
        String output = "HASHTABLE\n";

        for (int i = 0; i < table.length; i++) {
            if (i <= greatest) {
                output += "Bucket " + i + ": ";
                if (table[i] != null) {
                    output += table[i].toString().replaceAll("\\[|\\]|,|\\s", " ");
                }
                output += "\n";
            }
        }

        return output;
    }
}
