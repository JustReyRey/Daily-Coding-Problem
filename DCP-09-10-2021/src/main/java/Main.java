/*

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

 */


import java.util.Arrays;

public class Main {

    static int [] problemArray = {};
    static int k = 17;

    public static void main(String [] args){

        Arrays.sort(problemArray);
        int check = 0;
        int arrayPos = 0;


        for (int i = 0; i < problemArray.length; i++ ){

            check = Math.abs(k - problemArray[i]);

            arrayPos = binarySearch(problemArray,check);
            if (arrayPos != -1){
                System.out.println("Solution Found. k of 17, " + problemArray[i] + " + " + problemArray[arrayPos]);
                return;
            }

        }

        System.out.println("No Solution Found");

    }

    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

}


