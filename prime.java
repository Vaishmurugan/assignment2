import java.util.Scanner;

public class prim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
