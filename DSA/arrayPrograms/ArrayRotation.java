 import java.util.*;
public class ArrayRotation {
 public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Original: " + Arrays.toString(arr));

        int rotations = 3;
        int n = arr.length;

        // Normalize rotations if greater than array length
        rotations = rotations % n;

        for (int r = 0; r < rotations; r++) {
            int first = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = first;
        }

        System.out.println("Rotated: " + Arrays.toString(arr));
    }
}
    

