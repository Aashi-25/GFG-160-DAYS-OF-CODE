//You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.
package Day_2;

class Solution {
    int[] pushZerosToEnd(int[] arr) {
        int count = 0;
        int len = arr.length;
        for(int i=0 ; i<len ; i++){
            if(arr[i] != 0) {
                if(i != count)
                {
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                }
                count += 1;
            }
        }
        return arr;
    }
}

public class Day_2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr1 ={1, 2, 0, 4, 3, 0, 5, 0};
        int[] res1 = obj.pushZerosToEnd(arr1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}