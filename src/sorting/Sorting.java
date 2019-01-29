package sorting;

import utils.Utils;

import java.util.Arrays;

/**
 * Created by mhan on 2/2/2017.
 * This class implements various sorting methods
 */
public class Sorting {

    public static void main(String[] args){
        int [] nums = Utils.randomArray(10, 10);
        System.out.println("before sorting: " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("after sorting: " + Arrays.toString(nums));
    }

    public static void bubbleSort(int[] a){
        //WRITE YOUR CODE HERE
    }

    public static void selectionSort(int[] a){
        //WRITE YOUR CODE HERE
    }

    //find index of smallest element starting from start till a.length
    private static int findSmallestIndex(int[] a, int start){
        return -1; //overwrite this code
    }

    //swap the element at i and the one at j in array a
    private static void swap(int[] a, int i, int j){
    }
}
