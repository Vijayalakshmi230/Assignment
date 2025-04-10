package Day1;
import java.util.Scanner;
import java.util.Arrays;

public class Dm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String users[] = {"ajay", "kavita", "asha", "deepa", "komal"};
        String passwords[] = {"a101", "b102", "c103", "d104", "e105"};

        for (;;) { // Infinite loop, will break when choice is 5
            System.out.println("\nMenu:");
            System.out.println("1. Display Users");
            System.out.println("2. Update Password");
            System.out.println("3. Remove User");
            System.out.println("4. Sign In");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  

            if (choice == 5) {
                System.out.println("Exiti");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Users in the system:");
                    for (String user : users) {
                        System.out.println(user);
                    }
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    int index = Arrays.asList(users).indexOf(username);
                    
                    if (index != -1) {
                        System.out.print("Enter new password: ");
                        passwords[index] = sc.nextLine();
                        System.out.println("Password updated successfully.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter username to remove: ");
                    String removeUser = sc.nextLine();
                    int removeIndex = Arrays.asList(users).indexOf(removeUser);
                    
                    if (removeIndex != -1) {
                        users[removeIndex] = null;
                        passwords[removeIndex] = null;
                        System.out.println(removeUser + " has been removed.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter username: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter password: ");
                    String upass = sc.nextLine();
                    
                    int signInIndex = Arrays.asList(users).indexOf(uname);
                    if (signInIndex != -1 && passwords[signInIndex].equals(upass)) {
                        System.out.println("Sign in successful!");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
