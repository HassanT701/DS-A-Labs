package videoStore;
import java.util.*;

public class VideoStore {
	
	ArrayList<Rental> rentals;
	
	public VideoStore() {
        rentals = new ArrayList<>();

        rentals.add(new Video("Spider Man", 10, Video.PG13, "Amazing world of spiderman", "Robert downey", new ArrayList<>(Arrays.asList("Zendaya", "Tom Holland")), 120));

        rentals.add(new Video("Cars", 10, Video.G, "A childhood classic", "Oppenheimer", new ArrayList<>(Arrays.asList("Bill O-Brian", "Sally ")), 110));

        rentals.add(new Video("Big Hero 6", 10, Video.G, "A story of friendship and sorrow", "Christopher Nolan", new ArrayList<>(Arrays.asList("Mathew Hoffson", "Vanessa Bryant")), 114));

        rentals.add(new Video("Kung Fu Panda", 10, Video.PG, "A W Movie", "Jackie Chan", new ArrayList<>(Arrays.asList("Tai Lung", "Panda 2")), 90));

        rentals.add(new Game("Fortnite", 0, Game.TEEN, "ALL CONSOLES", 16));
        rentals.add(new Game("F1 23", 60, Game.EVERYONE, "ALL CONSOLES", 4));
        rentals.add(new Game("Call of Duty Warzone", 60, Game.MATURE, "XBOX AND PLAYSTATION ONLY", 4));
        rentals.add(new Game("NBA 2k24", 60, Game.EVERYONE_TEN_PLUS, "XBOX PLAYSTATION AND PC ONLY", 3));
    }
	
	 public ArrayList<Video> getVideos() {
		 ArrayList<Video> returnList = new ArrayList<>();

		 for (Rental rental : rentals) {
			 if (rental instanceof Video) {
				 returnList.add((Video) rental);
			 }
		 }
		 return returnList;
	 }

	 public ArrayList<Game> getGames() {
	     ArrayList<Game> returnList = new ArrayList<>();

	     for (Rental rental : rentals) {
	    	 if (rental instanceof Game) {
	             returnList.add((Game) rental);
	    	 }
	     }
	     return returnList;
	 }
	 
	 public ArrayList<Rental> getRented() {
		 ArrayList<Rental> returnArray = new ArrayList<>();

		 for (Rental rental : this.rentals) {
			 if (rental.getRented()) {
				 returnArray.add(rental);
			 }
		 }

		 return returnArray;
	 }
	 
	 public void addRental(Rental r) {
		 this.rentals.add(r);
	 }
	 
	 public ArrayList<Game> gamesInStock() {
	        ArrayList<Game> allGames = getGames();
	        ArrayList<Game> returnList = new ArrayList<>();

	        for (Game game : allGames) {
	            if (!game.getRented()) {
	                returnList.add(game);
	            }
	        }

	        return returnList;
	    }
	 
	 public ArrayList<Video> videosInStock() {
	        ArrayList<Video> allVideos = getVideos();
	        ArrayList<Video> returnList = new ArrayList<>();

	        for (Video video : allVideos) {
	            if (!video.getRented()) {
	                returnList.add(video);
	            }
	        }

	        return returnList;
	    }
	 
}
