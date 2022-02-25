import java.util.ArrayList;

public class Mixer {

    public static void main(String[] args) {
        ArrayList<Song> mySongs = new ArrayList<Song>();

        Song s;

        s = new Song("H.E.R", "Slide", 1.50, 2019);
        mySongs.add(s);

        s = new Song("So What", "Miles Davis", .99, 1959);
        mySongs.add(s);

        mySongs.add(new Song("Stay High", "Brittany Howard", 1.50, 2019));
        mySongs.add(new Song("Purple Rain", "Prince", 1.99, 1984));
        mySongs.add(new Song("Drop It Like It's Hot", "Snoop Dogg", .99, 2004));

        for (int i = 0; i < mySongs.size(); i++) {
            Song selected = mySongs.get(i);
            System.out.println(selected.title + ":" + selected.artist + ":" + selected.year + ":" + selected.price + ":" + selected.worth());
        }
    }
}
