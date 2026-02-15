/*
Prefix Sum + Range Query
https://www.geeksforgeeks.org/prefix-sum-array-implementation-applications-competitive-programming/ 
*/

/*
Given an array arr[], the goal is to compute its prefix sum array. The prefix sum array, prefixSum[], should be of the same length as arr[], where each element prefixSum[i] represents the sum of all elements from the start of the array up to index i, i.e., prefixSum[i] = arr[0] + arr[1] + .... + arr[i].

Examples:

Input: arr[] = [10, 20, 10, 5, 15]
Output: [10, 30, 40, 45, 60]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 10, 
prefixSum[1] = 10 + 20 = 30, 
prefixSum[2] = 10 + 20 + 10 = 40 and so on.
Input: arr[] = [30, 10, 10, 5, 50]
Output: [30, 40, 50, 55, 105]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 30, 
prefixSum[1] = 30 + 10 = 40, 
prefixSum[2] = 30 + 10 + 10 = 50 and so on.
*/

import java.util.ArrayList;

public class prefixSum {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum+arr[i];
            list.add(sum);
        }
        return list;
    }
}
