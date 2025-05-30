import java.util.Scanner;

public class sethird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose interest type:");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter Principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of interest (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time = scanner.nextDouble();

        if (choice == 1) {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + simpleInterest);
        } else if (choice == 2) {
            double amount = principal * Math.pow((1 + rate / 100), time);
            double compoundInterest = amount - principal;
            System.out.println("Compound Interest = " + compoundInterest);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

       
    }
}
