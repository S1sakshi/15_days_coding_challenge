/*Maximum and minimum of an array using minimum number of comparisons

Given an array of integers arr[], the task is to find the maximum and minimum elements in the array using the minimum number of comparisons.

Examples:

Input: arr[] = [3, 5, 4, 1, 9]
Output: [1, 9]
Explanation: The minimum element is 1, and the maximum element is 9.

Input: arr[] = [22, 14, 8, 17, 35, 3]
Output: [3, 35] 
Explanation: The minimum element is 3, and the maximum element is 35.
*/

public class min_max {

    public static int[] min_and_max(int arr[]){
        int n = arr.length; 

        int newArr[] = new int[2];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else if(arr[i]>max){
                max = arr[i];
            }
        }
        newArr[0] = min;
        newArr[1] = max;
        return newArr;
    }
    
}

/*GREEDY ALGORITHM is required for its optimized solution*/
