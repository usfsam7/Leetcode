

/*

 * Two Integer Sum II

 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

  Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

  The tests are generated such that there is exactly one solution. You may not use the same element twice.

  Your solution must use only constant extra space.

 

       Example 1:

       Input: numbers = [2,7,11,15], target = 9
       Output: [1,2]
       Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

       Example 2:

       Input: numbers = [2,3,4], target = 6
       Output: [1,3]
       Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

       Example 3:

       Input: numbers = [-1,0], target = -1
       Output: [1,2]
       Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


       here is my solution -->
 */



import java.util.Arrays;

public class twoSumII {

    public static void main(String[] args) {
        int[] numbers = { 2,7,11,15 };
        int target = 9;
        int[] result = twoSum(numbers, target);

        System.out.println(Arrays.toString(result)); // result [ 1, 2 ]
    }
    

        public static int[] twoSum(int[] numbers, int target) {
    
               for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
    
                    if (numbers[i] + numbers[j] == target) {
    
                        return new int[] {i + 1, j + 1};
    
                    }
                 }
               }
    
       
               return new int[] {};
        }
}



/*
 * diff syntax
 * 
 * 
 * class Solution {
    public int[] twoSum(int[] numbers, int target) {

           int index1 = 0;
           int index2 = 0;

           for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                int targetToCompare = numbers[i] + numbers[j];

                  
                  if (targetToCompare == target) {

                       index1 = i + 1;
                       index2 = j + 1;
                  }
             }
           }

        return new int[] {index1, index2};
    }
  }
 */
