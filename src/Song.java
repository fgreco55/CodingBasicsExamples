public class Song {
    String artist;
    String title;
    double price;
    int year;

    Song(String title, String artist, double price, int year) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.year = year;
    }
    double worth() {
        return price * 2.0;
    }


}
