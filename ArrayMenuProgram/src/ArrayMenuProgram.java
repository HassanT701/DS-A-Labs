import java.util.Arrays;
import java.util.Scanner;

public class ArrayMenuProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        int[] array = null;
        int howMany = 0;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements: ");
                    howMany = scanner.nextInt();
                    array = new int[howMany];
                    for (int i = 0; i < howMany; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        array[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    printArray(array);
                    break;

                case 3:
                    reverse(array, howMany);
                    break;

                case 4:
                    System.out.print("Enter the number to seek: ");
                    int numToSeek = scanner.nextInt();
                    int position = seek(array, howMany, numToSeek);
                    if (position != -1) {
                        System.out.println("Number found at position: " + position);
                    } else {
                        System.out.println("Number not found.");
                    }
                    break;

                case 5:
                    array = sort(array);
                    break;

                case 6:
                    int sum = sum(array);
                    System.out.println("Sum: " + sum);
                    break;

                case 7:
                    double avg = average(array, howMany);
                    System.out.println("Average: " + avg);
                    break;

                case 8:
                    int min = minimum(array, howMany);
                    System.out.println("Minimum: " + min);
                    break;

                case 9:
                    int max = maximum(array, howMany);
                    System.out.println("Maximum: " + max);
                    break;

                case 10:
                    double med = median(array, howMany);
                    System.out.println("Median: " + med);
                    break;

                case 11:
                    System.out.print("Enter the number to insert: ");
                    int numToInsert = scanner.nextInt();
                    array = insert(array, howMany, numToInsert);
                    howMany++;
                    break;

                case 12:
                    System.out.print("Enter the number to delete: ");
                    int numToDelete = scanner.nextInt();
                    array = delete(array, howMany, numToDelete);
                    howMany--;
                    break;

                case 13:
                    int mod = mode(array, howMany);
                    System.out.println("Mode: " + mod);
                    break;

                case 14:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        } while (choice != 14);
        
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1) Input");
        System.out.println("2) Output");
        System.out.println("3) Reverse");
        System.out.println("4) Seek");
        System.out.println("5) Sort");
        System.out.println("6) Sum");
        System.out.println("7) Average");
        System.out.println("8) Minimum");
        System.out.println("9) Maximum");
        System.out.println("10) Median");
        System.out.println("11) Insert");
        System.out.println("12) Delete");
        System.out.println("13) Mode");
        System.out.println("14) Exit");
        System.out.print("Enter your choice: ");
    }

    public static void printArray(int array[]) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int array[], int howmany) {
        System.out.print("Reversed Array: ");
        for (int i = howmany - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int seek(int array[], int howmany, int num) {
        for (int i = 0; i < howmany; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int[] sort(int array[]) {
        Arrays.sort(array);
        System.out.println("Array sorted.");
        return array;
    }

    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int array[], int howmany) {
        int sum = sum(array);
        return (double) sum / howmany;
    }

    public static int minimum(int array[], int howmany) {
        int min = array[0];
        for (int i = 1; i < howmany; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int array[], int howmany) {
        int max = array[0];
        for (int i = 1; i < howmany; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double median(int array[], int howmany) {
        array = sort(array);

        if (howmany % 2 == 0) {
            int middle1 = array[howmany / 2 - 1];
            int middle2 = array[howmany / 2];
            return (double) (middle1 + middle2) / 2;
        } else {
            return array[howmany / 2];
        }
    }

    public static int[] insert(int array[], int howmany, int num) {
        int[] newArray = Arrays.copyOf(array, howmany + 1);
        int i;
        for (i = howmany - 1; i >= 0 && array[i] > num; i--) {
            newArray[i + 1] = array[i];
        }
        newArray[i + 1] = num;
        System.out.println("Number inserted.");
        return newArray;
    }

    public static int[] delete(int array[], int howmany, int num) {
        int[] newArray = new int[howmany - 1];
        int i;
        for (i = 0; i < howmany - 1 && array[i] != num; i++) {
            newArray[i] = array[i];
        }
        for (; i < howmany - 1; i++) {
            newArray[i] = array[i + 1];
        }
        System.out.println("Number deleted.");
        return newArray;
    }

    public static int mode(int array[], int howmany) {
        int most = 0;
        int mode = 0;
        int counter = 1;
        Arrays.sort(array);

        for (int i = 1; i < howmany; i++) {
            if (array[i] == array[i - 1]) {
                counter++;
                if (counter > most) {
                    most = counter;
                    mode = array[i];
                }
            } else {
                counter = 1;
            }
        }

        return mode;
    }
}



