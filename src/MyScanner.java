/*
 Simple example of getting input from the console and breaking up the input into words ("tokens")

 Notice "java.util.Scanner" is a lot to type.  Paste this code into IntelliJ and change them to just "Scanner" using the import statement
 */

public class MyScanner {
    public static void main (String[] argv) {
        java.util.Scanner userinput;

        while (true) {
            System.out.print("Command> ");                  // show prompt to user
            userinput = new java.util.Scanner(System.in);   // create a Scanner

            if (userinput.hasNextLine()) {                  // If the user typed something... even just a <CR>
                String cmd = userinput.nextLine();

                if ( cmd.isEmpty() == false ) {             // If the user typed some words.

                    java.util.Scanner tokens = new java.util.Scanner(cmd);      // break up the line into words
                    while( tokens.hasNext() ) {             // While there are words in the input, print them
                        System.out.println(tokens.next());
                    }

                } else {                                    // If the user only hit the <CR>
                    System.out.println("You didn't type anything!");
                }
            }
        }
    }
}
