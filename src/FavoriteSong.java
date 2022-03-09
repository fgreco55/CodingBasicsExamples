public class FavoriteSong {

    private String firstName;
    private String lastName;
    private String favSong;
    private String favArtist;
    private double priceOfSong;
    private int songYear;

    /*
     Constructors
     */
    public FavoriteSong(String firstName, String lastName, String favSong, String favArtist, double priceOfSong, int songYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favSong = favSong;
        this.favArtist = favArtist;
        this.priceOfSong = priceOfSong;
        this.songYear = songYear;
        System.out.println("***Inside the BIG constructor");
    }

    public FavoriteSong(String firstName, String lastName) {
        this(firstName, lastName, "No favorite song", "No favorite artist", 1.00d, 1930);
        System.out.println("->Inside the fname/lname constructor.");
    }

    public FavoriteSong(String firstName, String lastName, String favSong) {
        this(firstName, lastName, favSong, "Unknown", 2.00d, 2000);
        System.out.println("->Inside the fname/lname/fsong constructor.");
    }

    public FavoriteSong() {
        this("no Lastname", "no Firstname");
        System.out.println("->Inside the no argment constructor.");
    }

    /*
     Quick and dirty display of the instance variables.
     To be formally correct, I should put "this." in front of every instance variable
     */
    public void show() {
        System.out.println("INFO [" + firstName + ":" + lastName + ":"
                + favSong + ":" + favArtist + ":"
                + priceOfSong + ":" + songYear + "]");
    }

    /*
     Simple test of this class...
     */
    public static void main(String[] args) {
        FavoriteSong fs = new FavoriteSong("frank", "greco");
        fs.show();

        FavoriteSong another = new FavoriteSong();
        another.show();
    }

}
