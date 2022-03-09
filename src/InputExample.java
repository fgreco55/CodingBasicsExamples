public class InputExample {
    public static void main(String[] args){
            Console console;
            String target;

            while (true) {
                console = new Console();            // Notice older Console objects are reclaimed by the GC

                System.out.print("Enter commands and args: ");

                console.consoleToArrayList();
                System.out.print("command line (" + console.numTokens() + "): ");
                console.show();
            }
        }
}
