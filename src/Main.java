import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("n must be a natural number");
        } else {
            // The number of n-digit numbers
            long count = (long) Math.pow(10, n) - (long) Math.pow(10, n - 1);
            System.out.println("The number of: " + n + "-digit numbers: " + count);
        }
    }
}
