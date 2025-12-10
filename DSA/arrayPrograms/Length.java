 public class Length {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        // Using built-in length property instead of manual counting
        int size = arr.length;
        System.out.println("Array size: " + size);

        // Iterating safely without triggering exceptions
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Optional: If you still want to demonstrate exception handling
        try {
            int index = 0;
            while (true) {
                int temp = arr[index];
                System.out.println("Accessing: " + temp);
                index++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds during access.");
        }
    }
}
