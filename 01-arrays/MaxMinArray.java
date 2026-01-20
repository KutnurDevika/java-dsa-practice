// Problem: Find Max and Min in an Array
// Approach: Linear traversal
// Time: O(n), Space: O(1)

public class MaxMinArray {
 public static void main(String[] args) {
int[] arr = {10, 5, 20, 3, 40};
int max = arr[0];
int min = arr[0];
 for (int i = 1; i < arr.length; i++) {
if (arr[i] > max) {
                max = arr[i];
            }
if (arr[i] < min) {
                min = arr[i];
            }
        }
 System.out.println("Max: " + max);
System.out.println("Min: " + min);
    }
}
