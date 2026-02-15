/* 
Given an array arr[] of positive integers which may contain duplicate elements, return the frequency of each distinct element.

Examples:

Input: arr[] = [1, 2, 2, 3, 3, 5]
Output: [[1, 1], [2, 2], [3, 2], [5, 1]]
Explaiantion: Here element 1 and 5 occur 1 times, 2 and 3 occur 2 times.
Input: arr[] = [1, 5, 6, 7, 7]
Output: [[1, 1], [5, 1], [6, 1], [7, 2]]
Explanation: Here element 1, 5 and 6 occur 1 times, 7 occur 2 times.
*/

class countFrequency {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        Arrays.sort(arr);
        
        int i = 0;
        int j = 1;
        int count = 1;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
                count++;
            }
            else{
                ArrayList<Integer> inner = new ArrayList<>();
                inner.add(arr[i]);
                inner.add(count);
                list.add(inner);
                i = j;
                j = i+1;
                count = 1;
            }
        }
        ArrayList<Integer> inner = new ArrayList<>();
        inner.add(arr[i]);
        inner.add(count);
        list.add(inner);
        return list;
    }
}