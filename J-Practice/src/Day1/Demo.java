package Day1;
import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, num;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Factorial");
            System.out.println("2. Prime Number Check");
            System.out.println("3. Sum of Digits");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.print("Enter a number: ");
            num = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Factorial of " + num + " is: " + factorial(num));
                    break;
                case 2:
                    if (isPrime(num)) {
                        System.out.println(num + " is a prime number.");
                    } else {
                        System.out.println(num + " is not a prime number.");
                    }
                    break;
                case 3:
                    System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (true);
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

