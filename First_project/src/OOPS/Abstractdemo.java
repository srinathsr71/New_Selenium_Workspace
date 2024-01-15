package OOPS;

//Abstract class
abstract class Shape1 {
 // Abstract methods
 public abstract void draw();
 public abstract double calculateArea();
}

//Abstract class extending Shape
abstract class TwoDimensionalShape extends Shape1 {
 // Abstract method
 public abstract double calculatePerimeter();
}

//Concrete class implementing TwoDimensionalShape
class Rectangle extends TwoDimensionalShape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public void draw() {
     System.out.println("Drawing a rectangle");
 }

 @Override
 public double calculateArea() {
     return length * width;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * (length + width);
 }
}

//Main class
final class Abstractdemo {
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(4.5, 6.8);
     rectangle.draw();
     System.out.println("Area: " + rectangle.calculateArea());
     System.out.println("Perimeter: " + rectangle.calculatePerimeter());
 }
}
