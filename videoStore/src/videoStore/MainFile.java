package videoStore;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class MainFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoStore x = new VideoStore();
		ArrayList<Rental> cart = new ArrayList<>();
		
		for (;;) {
			System.out.println("");
            System.out.println("---Video Store---");
            System.out.println("1. Rent Movies");
            System.out.println("2. Rent Games");
            System.out.println("3. Check Out");
            System.out.println("4. Exit Terminal");
            System.out.println("Enter a corresponding number\n");
            int input = sc.nextInt();

            switch (input) {
            case 1:
                ArrayList<Video> videosInStock = x.videosInStock();
                for (int i = 0; i < videosInStock.size(); i++) {
                	if(!cart.contains(videosInStock.get(i))) {
                    System.out.println((i + 1) + ". " + videosInStock.get(i));
                	}
                }
                System.out.println("Enter the number of the video you want to rent (or 0 to cancel):");
                int videoInput = sc.nextInt();
                if (videoInput != 0 && videoInput <= videosInStock.size() && !cart.contains(videosInStock.get(videoInput - 1))) {
                	System.out.println(videosInStock.get(videoInput - 1));
                    System.out.println("Do you want to rent this video? (Y/N)");
                    char rentChoice = sc.next().charAt(0);
                    if (rentChoice == 'Y' || rentChoice == 'y') {
                        cart.add(videosInStock.get(videoInput - 1));
                        System.out.println("Video added to cart.");
                    } else {
                        System.out.println("Cancelled.");
                    }
                } else if(videoInput == 0) {
                    System.out.println("Back to menu");
                }
                else {
                    System.out.println("Invalid input/ already added");
                }
                break;
            case 2:
                ArrayList<Game> gamesInStock = x.gamesInStock();
                for (int i = 0; i < gamesInStock.size(); i++) {
                	if(!cart.contains(gamesInStock.get(i))) {
                    System.out.println((i + 1) + ". " + gamesInStock.get(i));
                	}
                }
                System.out.println("Enter the number of the game you want to rent (or 0 to cancel):");
                int gameInput = sc.nextInt();
                if (gameInput != 0 && gameInput <= gamesInStock.size() && !cart.contains(gamesInStock.get(gameInput - 1))) {
                	System.out.println(gamesInStock.get(gameInput - 1));
                    System.out.println("Do you want to rent this game? (Y/N)");
                    char rentChoice = sc.next().charAt(0);
                    if (rentChoice == 'Y' || rentChoice == 'y') {
                        cart.add(gamesInStock.get(gameInput - 1));
                        System.out.println("Game added to cart.");
                    } else {
                        System.out.println("Cancelled.");
                    }
                } else if(gameInput == 0){
                	System.out.println("Back to menu");
                }
                else {
                    System.out.println("Invalid input/ already added");
                }
                break;
            case 3:
                double subtotal = 0;
                System.out.println("---Reciept---");
                LocalDateTime y = LocalDateTime.now();
                DateTimeFormatter date = DateTimeFormatter.ofPattern("MM-dd-yyyy");
                DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
                String finDate = y.format(date);
                String finTime = y.format(time);
                System.out.println(finDate);
                System.out.println(finTime);
                
                for (Rental rental : cart) {
                    System.out.println(rental.getTitle() + " - $" + rental.getCost());
                    subtotal += rental.getCost();
                }
                double taxRate = 0.0825; 
                double tax = subtotal * taxRate;
                double total = subtotal + tax;
                total = Math.round(total * 100.00) / 100.00;
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Tax: $" + tax);
                System.out.println("Total: $" + total);
                cart.clear();
                break;
             case 4:
                System.exit(0);
                break;
             default:
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }
	}
}

