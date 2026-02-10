//Maximum and minimum of an array using minimum number of comparisons

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
