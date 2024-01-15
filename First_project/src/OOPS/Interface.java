package OOPS;

//Interface
interface Printable {
 void print();
}

//Class implementing the interface
class demo implements Printable {
 @Override
 public void print() {
     System.out.println("Printing from MyClass");
 }
}

//Main class
public class Interface {
 public static void main(String[] args) {
     demo myObject = new demo();
     myObject.print();  // Invoke the print() method of MyClass
 }
}
