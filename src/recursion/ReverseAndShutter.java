package recursion;

import java.util.Scanner;

public class ReverseAndShutter {
    // post: reads a file, writing the lines to System.out in reverse order
    public void reverse(Scanner input) {
        if (input.hasNextLine()) {
            String line = input.nextLine();
            reverse(input);
            System.out.println(line);
        }
    }

    // returns the integer obtained by replacing every digit of n with two of
    // that digit. For example, stutter(348) returns 334488.
    public int stutter(int n) {
        return -1; //overwrite this code.
    }

}
