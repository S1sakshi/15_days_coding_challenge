/*
Majority Element
https://leetcode.com/problems/majority-element/
*/

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

import java.util.Arrays;

public class majorityElement {
    public int majorityElement(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
        return arr[n/2];
    }
}
//Optimal solution
public class majorityElement {
    public int majorityElement(int[] arr) {
        int n = arr.length;

        int votes = 1;
        int majority = arr[0];

        for(int i=1; i<n; i++){
            if(majority==arr[i]){
                votes++;
            }
            else if(majority!=arr[i] && votes==1){
                majority = arr[i];
                votes = 1;
            }
            else{
                votes--;
            }
        }
        return majority;
    }
}