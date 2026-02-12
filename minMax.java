//Maximum and minimum of an array using minimum number of comparisons

/*
Given an array of integers arr[], the task is to find the maximum and minimum elements in the array 
using the minimum number of comparisons.

Examples:

Input: arr[] = [3, 5, 4, 1, 9]
Output: [1, 9]
Explanation: The minimum element is 1, and the maximum element is 9.

Input: arr[] = [22, 14, 8, 17, 35, 3]
Output: [3, 35] 
Explanation: The minimum element is 3, and the maximum element is 35. 
*/

//Brute force
import java.util.*;

public class minMax {

    public static ArrayList<Integer> minAndMax(int arr[]){
        int n = arr.length; 

        ArrayList<Integer> newArr = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        newArr.add(min);
        newArr.add(max);

        return newArr;
    }
    
}


//Optimal approach
public class minMax {

    public static ArrayList<Integer> minAndMax(int arr[]){
        int n = arr.length; 

        if (arr.length == 0) {
            return result; // or throw IllegalArgumentException
        }

        ArrayList<Integer> newArr = new ArrayList<>();

        int min = 0;
        int max = 0;
        int i = 0;

        if(n%2==1){
            min = arr[0];
            max = min;
            i=1;
        }
        
        else{
            if(arr[0]<arr[1]){
                min = arr[0];
                max = arr[1];
            }
            else{
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        }
        while(i<n-1){
            if(arr[i]<arr[i+1]){
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i+1]);
            }
            else{
                min = Math.min(min, arr[i+1]);
                max = Math.max(max, arr[i]); 
            }
            i= i+2;
        }
        newArr.add(min);
        newArr.add(max);
        return newArr;
    }
    
}
/*GREEDY ALGORITHM is required for its optimized solution*/
