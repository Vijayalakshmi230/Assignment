package day3;

//Abstract class
abstract class Animal {
 // Abstract method (does not have a body)
 abstract void makeSound();

 // Concrete method
 void sleep() {
     System.out.println("Sleeping...");
 }
}

//Subclass (must implement the abstract method)
class Dog extends Animal {
 void makeSound() {
     System.out.println("Bark! Bark!");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Animal a = new Animal(); // Cannot instantiate an abstract class
     Dog d = new Dog();
     d.makeSound(); // Output: Bark! Bark!
     d.sleep();     // Output: Sleeping...
 }
}


// abstract method
//abstract class Shape {
//    abstract void draw(); // Abstract method (no body)
//}


//Non - abstract method
//class Circle extends Shape {
//    void draw() { // Non-abstract method (implementation provided)
//        System.out.println("Drawing a circle");
//    }
//}


