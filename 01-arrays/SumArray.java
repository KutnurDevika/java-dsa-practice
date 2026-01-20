// Problem: Sum of Array Elements
// Approach: Linear traversal
// Time: O(n), Space: O(1)

public class SumArray {
public static void main(String[] args) {
 int[] arr = {10, 20, 30, 40};
 int sum = 0;
for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
System.out.println("Sum of elements: " + sum);
    }
}
