package binarysearch;

import java.util.Arrays;
import java.util.Random;

/**
 * Program for binary search using array of binarysearch.Circle's
 * Created by mhan on 2/2/2017.
 */
public class BinarySearchWithObject {
    public static void main(String[] args) {
        Circle[] circles = randomCircle(10);
        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));
        System.out.println(binarySearch(circles, new Circle(new Point(0,0), 1)));
    }

    //Binary search algorithm
    //Returns an index at which the target
    //appears in the given input array, or -1 if not found.
    //pre: array is sorted
    public static int binarySearch(Circle [] circles, Circle target){
        //Implement your code here
        return -1;
    }

    // This method constructs and returns an array of random int values of
    // length n
    public static Circle[] randomCircle(int n) {
        Circle[] circles = new Circle[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            circles[i] =  new Circle( new Point(r.nextInt() % 2, r.nextInt() % 2), Math.abs(r.nextInt() % 2 + 1));
        }
        return circles;
    }
}
