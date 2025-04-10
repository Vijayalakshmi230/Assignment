//package day3;
//
//import java.util.Scanner;
//
//// Custom exception class
//class AgeValid extends Exception {
//    private String msg;
//
//    // Constructor
//    public AgeValid(String msg) {
//        super(msg);
//        this.msg = msg;
//    }
//
//    // Method to return the message
//    public String getMsg() {
//        return msg;
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter age: ");
//        
//        try {
//            int age = sc.nextInt();
//            if (age < 22) {
//                throw new AgeValid("Age should be > 22");
//            } else {
//                System.out.println("Valid age: " + age);
//            }
//        } catch (AgeValid e) {
//            System.out.println(e.getMsg()); // Catching custom exception
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter a number.");
//        } finally {
//            sc.close(); // Closing Scanner to prevent resource leaks
//        }
//    }
//}
