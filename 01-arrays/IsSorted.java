// Problem: Check if Array is Sorted
// Approach: Linear traversal
// Time: O(n), Space: O(1)

public class IsSorted {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
