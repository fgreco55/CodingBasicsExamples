import java.util.ArrayList;

public class Mixer {

    public static void main(String[] args) {
        ArrayList<Song> mySongs = new ArrayList<Song>();    // Create a reference to an empty ArrayList

        Song s;

        s = new Song("H.E.R", "Slide", 1.50, 2019);         // Add a Song to the ArrayList
        mySongs.add(s);

        s = new Song("So What", "Miles Davis", .99, 1959);  // Add another one
        mySongs.add(s);

        mySongs.add(new Song("Stay High", "Brittany Howard", 1.50, 2019));      // Add a few more...
        mySongs.add(new Song("Purple Rain", "Prince", 1.99, 1984));
        mySongs.add(new Song("Drop It Like It's Hot", "Snoop Dogg", .99, 2004));

        for (int i = 0; i < mySongs.size(); i++) {
            Song selected = mySongs.get(i);
            selected.show();
        }
    }
}
