package recursion;

import java.util.Arrays;

// [1, 2, 2, 1]
// start: 1, end: 3
//
public class PalindromeTester {
    // pre: begin >= 0, end <= arr.length - 1
    private static boolean isPalindrome(/*write your params*/) {
        //base case 1
        //base case 2

        //other
        return false; //overwrite this code
    }

    private static boolean isPalindrome2(/*write your params*/) {
        //simplify above

        return false;//overwrite this code
    }

    private static boolean isPalindrome3(/*write your params*/) {
        //simplify even more

        return false;//overwrite this code
    }


    public static boolean isPalindrome(int[] arr) {
        //define helper method

        return false;//overwrite this code
    }


    public static void main(String[] args) {
        int[][] tests    = {
                {1, 1, 1, 1},
                {1, 2, 3, 4},
                {1},
                {},
                {1,2,3,2,1},
                {3,2,2,3,2,3},
        };
        boolean[] correct = {
                true,
                false,
                true,
                true,
                true,
                false
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("isPalindrome(" + Arrays.toString(tests[i]) + ") -> " +
                    isPalindrome(tests[i]) +
                    " (should be " + correct[i] + ")");
        }
    }
}
