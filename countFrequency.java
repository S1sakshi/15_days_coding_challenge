/*
Counting frequencies of array elements

Given an array arr[] of non-negative integers which may contain duplicate elements. Return the frequency of each distinct element present in the array.

Examples: 

Input:  arr[] = [10, 20, 10, 5, 20]
Output: [[5, 1], [10, 2], [20, 2]]
Explanation: Here 5 occurs once, 10 occurs 2 times and 20 occurs 2 times.

Input: arr[] = [10, 20, 20]
Output: [[10, 1], [20, 2]] 
Explanation: Here 10 occurs 1 time, 20 occurs 2 times. 
*/

import java.util.ArrayList;
import java.util.Arrays;

public class countFrequency {
    class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        int n = arr.length;
        
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> newArr = new ArrayList<>();
        
        int i=0;
        int j=i+1;
        int count = 1;
        
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
                count++;
            }
            else{
                ArrayList<Integer> res = new ArrayList<>();
                res.add(arr[i]);
                res.add(count);
                newArr.add(res);
                
                i = j;
                j = i+1;
                count=1;
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[i]);
        res.add(count);
        newArr.add(res);
        
        return newArr;

        //Optimization would be done through Hashmap
    }
}
}

/*HASHMAP is required for its optimized solution*/
