/*Leetcode-1752
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

 
Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
*/

public class check_if_array_sorted_and_rotated {
    public boolean check(int[] arr) {
        int n = arr.length;

        int count = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        else if(count==1){
            if(arr[n-1]<=arr[0]){
                return true;
            }
        }
        return false;
    }
}
