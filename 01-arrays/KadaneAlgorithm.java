// Problem: Maximum Subarray Sum (Kadane's Algorithm)
// Approach: Dynamic Programming
// Time: O(n), Space: O(1)

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        System.out.println("Maximum subarray sum: " + maxSoFar);
    }
}
