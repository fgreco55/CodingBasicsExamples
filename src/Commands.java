public class Commands {
    public static void main(String[] argv) {

        while (true) {                          // Loop until user enters "quit"
            System.out.print("Command> ");
            java.util.Scanner in = new java.util.Scanner(System.in);
            String cmd = in.next();

            if (cmd.equals("F2C")) {		// string match
                double f = in.nextDouble();
                double c = (f - 32) * 5./9.;
                System.out.println("Fahrenheit: " + f + "  Celsius: " + c);
            } else if (cmd.equals("C2F")) {
                double c = in.nextDouble();
                // double f = ....
                System.out.println("You want to convert from C to F");
            } else if (cmd.equals("P2K")) {
                double p = in.nextDouble();
                // double kilos = ...
                System.out.println("You are converting pounds to kilos");
            } else if (cmd.equals("quit")) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.println("I don't understand that command");
                System.out.println("Format is: [F2C|C2F|P2K|quit] [argument]");
            }
        }
    }
}


