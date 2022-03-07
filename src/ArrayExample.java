public class ArrayExample {
    public static void main(String[] args) {
        int number = 100;
        Song[] mySongs = new Song[number];         // create 100 slots... no Songs yet

        for(int i = 0; i < number; i++) {
            mySongs[i] = new Song();
        }

        System.out.println(number + " songs created w/ an Array!");
    }
}
