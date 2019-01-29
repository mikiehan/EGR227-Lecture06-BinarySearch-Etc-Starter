package performance;// This program allows you to execute one of three different algorithms for
// finding the maximum sum of a subsequence of values.  It runs the algorithm
// for a base size n and also for 2n and 3n, reporting the individual times
// and the ratios.
//
// The program was modified to add a "trial run" of the three executions prior
// to the timed executions.  Java performs some optimizations that distort the
// times without these trial runs.  Initially these trial runs were done with
// arrays filled with all 0's but the JVM technology reached a point where it
// no longer warmed up the JVM, so they were switched to arrays or random
// values, as in the timed tests.

import utils.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSum {
    public static final boolean DO_PRINT = false;
    public static void main(String[] args) {
        // find out how big of a list to process and which algorithm to use
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to use? ");
        int n = console.nextInt();
        System.out.print("Which algorithm do you want to use? ");
        int algorithm = console.nextInt();

        int divisor = 10000;
        if(DO_PRINT) divisor = 50;

        // run three trial runs that aren't timed
        findMax(Utils.randomArray(n, divisor), algorithm);
        findMax(Utils.randomArray(2 * n, divisor), algorithm);
        findMax(Utils.randomArray(3 * n, divisor), algorithm);

        // run the three timed tests
        double time1 = test(n, algorithm, divisor);
        double time2 = test(2 * n, algorithm, divisor);
        double time3 = test(3 * n, algorithm, divisor);

        System.out.println("Double/single ratio = " + time2 / time1);
        System.out.println("Triple/single ratio = " + time3 / time1);
    }

    // This method performs a single test for a given input size of n and a
    // given algorithm, returning the elapsed time in seconds.
    public static double test(int n, int algorithm, int divisor) {
        // construct the list
        int[] numbers = Utils.randomArray(n, divisor);

        // run the algorithm and time it
        long start = System.currentTimeMillis();
        findMax(numbers, algorithm);
        double elapsed = (System.currentTimeMillis() - start) / 1000.0;

        // report and return results
        System.out.println("for n = " + n + ", time = " + elapsed);
        System.out.println();
        return elapsed;
    }

    // Finds the max subsequence sum of the given array using the given
    // algorithm.  Throws an IllegalArgumentException if the algorithm number
    // is not between 1 and 3 inclusive.
    public static void findMax(int[] list, int algorithm) {
        if (algorithm < 1 || algorithm > 3) {
            throw new IllegalArgumentException("algorithm:" + algorithm);
        }
        if (algorithm == 1) {
            findMax1(list);
        } else if (algorithm == 2) {
            findMax2(list);
        } else {  // algorithm == 3)
            findMax3(list);
        }
    }

    // This method uses the brute force method of finding every possible
    // starting and stopping index and adding up the values in that range.
    // It has O(n^3) complexity.  Assumes list.size > 0.
    public static void findMax1(int[] list) {
        // initalize max sequence to just the first element of the list
        int max = list[0];
        int maxStart = 0;
        int maxStop = 0;

        for (int start = 0; start < list.length; start++) {
            for (int stop = start; stop < list.length; stop++) {
                int sum = 0;
                for (int i = start; i <= stop; i++) {
                    sum += list[i];
                }
                if (sum > max) {
                    max = sum;
                    maxStart = start;
                    maxStop = stop;
                }
            }
        }
        if(DO_PRINT) {
            System.out.println("n : " + list.length + " " + Arrays.toString(list));
            System.out.println("max : " + max + " (start : " + maxStart + ", end : " + maxStop + ")");
        }
    }

    // This method improves on the brute force method by keeping partial sums
    // instead of recomputing from scratch each time.  It has O(n^2)
    // complexity.  Assumes list.size > 0.
    public static void findMax2(int[] list) {
        // initalize max sequence to just the first element of the list
        int max = list[0];
        int maxStart = 0;
        int maxStop = 0;

        for (int start = 0; start < list.length; start++) {
            //FILL IN YOUR CODE HERE
        }
        if(DO_PRINT) {
            System.out.println("n : " + list.length + " " + Arrays.toString(list));
            System.out.println("max : " + max + " (start : " + maxStart + ", end : " + maxStop + ")");
        }
    }

    // This method keeps a running sum, resetting the starting point and
    // resetting the sum to 0 if the sum ever goes negative.  It has O(n)
    // complexity.  Assumes list.size > 0.
    public static void findMax3(int[] list) {
        // initalize max sequence to just the first element of the list
        int max = list[0];
        int maxStart = 0;
        int maxStop = 0;

        int start = 0;
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            //FILL IN YOUR CODE HERE
        }
        if(DO_PRINT) {
            System.out.println("n : " + list.length + " " + Arrays.toString(list));
            System.out.println("max : " + max + " (start : " + maxStart + ", end : " + maxStop + ")");
        }
    }
}
