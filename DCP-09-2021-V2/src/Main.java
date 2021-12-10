/*

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

 */


import java.util.HashMap;

public class Main {


    public static void main (String[] args){


        int k = 17;
        int[] problemArray = {10,15,3,7};

        int check = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < problemArray.length; i++){

            map.put(problemArray[i],problemArray[i]);

        }

        for (int i = 0; i < problemArray.length; i++){

            check = Math.abs(k - problemArray[i]);

            if (map.containsValue(check)){

                System.out.println("sum found: " + problemArray[i] + " + " + check);
                return;

            }

        }

        System.out.println("No two numbers in array add to sum: " + k);


    }





}
