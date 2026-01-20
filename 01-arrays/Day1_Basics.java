// Day 1: Java DSA Basics
// Topics: Arrays, Input/Output
// Time Complexity: O(n) for array traversal
import java.util.*;
public class Day1_Basics {
public static void main(String[] args) {
 // creation of the array
 int[] arr = {10, 20, 30, 40, 50};
 // transversing of array
System.out.println("Array elements:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        sc.close();
    }
}
