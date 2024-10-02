package videoStore;

public class Game extends Rental {
	
	 public static final int G = 0;
	    public static final int EVERYONE = 1;
	    public static final int EVERYONE_TEN_PLUS = 2;
	    public static final int TEEN = 3;
	    public static final int MATURE = 4;
	    public static final int ADULTS_ONLY = 5;
	    public static final int RATING_PENDING = 6;
	    private String platform;
	    private int numberOfPlayers;
	    
	    public Game(String title, double cost, int rating, String platform, int numberOfPlayers) {
	        super(title, cost, rating);
	        this.platform = platform;
	        this.numberOfPlayers = numberOfPlayers;
	    }
	    
	    public String getPlatform() {
	        return this.platform;
	    }

	    public int getNumberOfPlayers() {
	        return this.numberOfPlayers;
	    }
	    
	    @Override
	    public String toString() {
	        String rating;

	        int ratingValue = getRating();
	        if (ratingValue == G) {
	            rating = "G";
	        } else if (ratingValue == EVERYONE) {
	            rating = "EVERYONE";
	        } else if (ratingValue == EVERYONE_TEN_PLUS) {
	            rating = "EVERYONE TEN PLUS";
	        } else if (ratingValue == TEEN) {
	            rating = "TEEN";
	        } else if (ratingValue == MATURE) {
	            rating = "MATURE";
	        } else if (ratingValue == ADULTS_ONLY) {
	            rating = "ADULTS ONLY";
	        } else if (ratingValue == RATING_PENDING) {
	            rating = "RATING PENDING";
	        } else {
	            throw new Error();
	        }

	        return super.toString() + ", RATED: " + rating + ", PLATFORM: " + this.platform + ", NUMBER OF PLAYERS: " + this.numberOfPlayers;
	    }

}
