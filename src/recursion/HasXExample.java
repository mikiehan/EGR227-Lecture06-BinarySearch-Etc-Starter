package recursion;

public class HasXExample {
    public static boolean hasX(String s) {
        //base case



        //otherwise

        return false;//overwrite this code
    }

    public static boolean hasX2(String s) {
        //simplify above

        return false;//overwrite this code
    }

    public static boolean hasX3(String s) {
        //simplify even more

        return false;//overwrite this code
    }

    public static void main(String[] args) {
        String[] tests    = {"hello", "xylophone", "abcdx", "qrst"};
        boolean[] correct = {false,   true,        true,    false};

        for (int i = 0; i < tests.length; i++) {
            System.out.println("hasX(" + tests[i] + ") -> " + hasX3(tests[i]) +
                    " (should be " + correct[i] + ")");
        }
    }
}
