// Problem: Count Even and Odd Numbers
// Approach: Linear traversal
// Time: O(n), Space: O(1)

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
