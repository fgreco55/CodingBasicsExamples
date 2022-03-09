import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private InputStream stdin = System.in;
    private ArrayList<String> commandline = new ArrayList<>();

    /*
        Get line from the console (user) and break it up into tokens.
        Save the tokens in our ArrayList.
     */
    ArrayList<String> consoleToArrayList() {
        Scanner console = new Scanner(stdin);           // text scanner that can break up input into tokens

        while (console.hasNextLine()) {

            String line = console.nextLine();
            if (line.equals(""))                       // If nothing was input, nothing to do
                break;

            Scanner tokens = new Scanner(line);         // Need another Scanner to break up the string for the ArrayList

            while (tokens.hasNext()) {                  // Put each token in an element of the ArrayList
                commandline.add(tokens.next());
            }
            break;                                      // when no more tokens, we're done
        }
        return commandline;                             // return the ArrayList to the caller
    }

    /*
     Clear out the ArrayList
     */
    void clearArrayList() {
        commandline.clear();
    }

    /*
     How many tokens were in the last line inputted by the user
     */
    int numTokens() {
        return commandline.size();
    }

    /*
     Display all the elements of the ArrayList
     */
    void show() {
        for (int i = 0; i < commandline.size(); i++)
            System.out.print("[" + commandline.get(i) + "] ");
        System.out.println();
    }
}


