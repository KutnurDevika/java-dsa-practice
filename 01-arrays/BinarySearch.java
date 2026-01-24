// Problem: Binary Search
// Approach: Divide and conquer
// Time: O(log n), Space: O(1)

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;

        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
