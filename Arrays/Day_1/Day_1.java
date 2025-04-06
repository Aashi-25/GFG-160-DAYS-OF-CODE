package Day_1;

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length < 2) {
            return -1;
        }

        int largest = 0;
        int secLargest = 0;

        for (int num : arr) {
            if (num > largest) {
                secLargest = largest ;
                largest = num;
            }
            else if (num > secLargest && num != largest){
                secLargest = num;
            }
        }

        return(secLargest==0 ? -1 : secLargest);
    }
}

public class Day_1 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int result1 = sol.getSecondLargest(arr1);
        System.out.println("Second largest in arr1: " + result1); // Output: 34

        // Test case 2
        int[] arr2 = {10, 10, 10};
        int result2 = sol.getSecondLargest(arr2);
        System.out.println("Second largest in arr2: " + result2); // Output: -1

        // Test case 3
        int[] arr3 = {5, 2};
        int result3 = sol.getSecondLargest(arr3);
        System.out.println("Second largest in arr3: " + result3); // output : 2

        //test case 4
        int[] arr4 = {2};
        int result4 = sol.getSecondLargest(arr4);
        System.out.println("Second largest in arr4: " + result4); //output: -1

        //test case 5
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result5 = sol.getSecondLargest(arr5);
        System.out.println("Second largest in arr5:" + result5); //output: 9
    }
}
