// Problem: Two Sum (sorted array)
// Approach: Two pointers
// Time: O(n), Space: O(1)

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int target = 14;

        int left = 0, right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                found = true;
                break;
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
