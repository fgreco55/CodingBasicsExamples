import java.util.ArrayList;
import java.util.Random;

public class ArrayListExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        var mySongs = new ArrayList<>();         // create an ArrayList that can grow and shrink

        for(int i = 0; i < number; i++) {
            mySongs.add(new Song());
        }

        System.out.println(mySongs.size() + " songs created w/ an ArrayList!");
    }
}
