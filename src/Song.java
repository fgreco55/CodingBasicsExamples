public class Song {
    String artist;
    String title;
    double price;
    int year;

    Song(String title, String artist, double price, int year) {
        this.title = title;             // use "this" to avoid confusion... we want to set the class instance variables
        this.artist = artist;
        this.price = price;
        this.year = year;
    }

    Song() {
        this.title = "";
        this.artist = "";
        this.price = 0.0d;
        this.year = 1950;
    }
    /*
     Return twice the price... how much my recordings are worth today!  :)
     */
    double worth() {
        return price * 2.0;
    }

    /*
     Just display the contents of this object's values
     */
    void show() {
        System.out.println(title + ":" + artist + ":" + year + ":" + price + ":" + worth());
    }

}
