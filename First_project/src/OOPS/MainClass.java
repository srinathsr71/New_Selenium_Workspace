package OOPS;

//First class
class MyClass {
 private String message;

 // Constructor
 public MyClass(String message) {
     this.message = message;
 }

 // Method 1
 public void printMessage() {
     System.out.println("Message: " + message);
 }

 // Method 2
 public void printLength() {
     System.out.println("Length: " + message.length());
 }
}

//Second class with the main method
public class MainClass {
 public static void main(String[] args) {
     // Create an object of MyClass
     MyClass myObject = new MyClass("Hello, world!");

     // Call the methods of MyClass
     myObject.printMessage();
     myObject.printLength();
 }
}
