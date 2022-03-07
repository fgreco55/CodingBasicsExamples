public class Programmers {
    private String[] programmers = {
            "Yukihiro Matsumoto",
            "David Nolen",
            "Clarence Ellis",
            "Jerry Lawson",
            "Grace Hopper",
            "Linux Torvalds"
    };

    /*
     Constructor that sets the list of programmers at creation time.
     */
    public Programmers(String[] programmers) {
        this.programmers = programmers;
    }
    /*
     Constructor that keeps the default list of programmers.
     */
    public Programmers() {
        // this constructor doesn't initialize anything
    }

    public void printMenu() {
        for (int i = 0; i < programmers.length; i++) {
            System.out.println(i + ". " + programmers[i]);  // formally should be "this.programmers[i]", but since there's no ambiguity...
        }
    }
}
