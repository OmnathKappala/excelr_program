 public class Automorphic {

    // Method to check if a number is Automorphic
    public static boolean isAutomorphic(int num) {
        int sqr = num * num;

        while (num > 0) {
            int rem = num % 10;
            int sqrRem = sqr % 10;

            if (rem != sqrRem) {
                return false;
            }

            num /= 10;
            sqr /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 76;

        if (isAutomorphic(n)) {
            System.out.println(n + " is an Automorphic number.");
        } else {
            System.out.println(n + " is not an Automorphic number.");
        }
    }
}

