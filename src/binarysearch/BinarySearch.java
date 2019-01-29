package binarysearch;

import java.util.Arrays;

/**
 * Program for binarysearch.BinarySearch using array of int's
 * Created by mhan on 2/2/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int [] nums = Utils.randomArray(10,10);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(binarySearch(nums, 0));
    }

    //Binary search algorithm
    //Returns an index at which the target
    //appears in the given input array, or -1 if not found.
    //pre: array is sorted
    public static int binarySearch(int[] numbers, int target){
        //WRITE YOUR CODE HERE
        return -1;
    }

    public static int binarySearch2(int[] numbers, int target){
        //WRITE YOUR CODE HERE
        return -1;
    }

    private static int binarySearchHelper(int[] numbers, int target, int min, int max){
        //WRITE YOUR CODE HERE
        return -1;
    }
}
