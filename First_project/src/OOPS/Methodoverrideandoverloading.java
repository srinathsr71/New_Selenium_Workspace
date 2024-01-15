package OOPS;

//Parent class
class Shape {
 public void calculateArea(int side) {
     System.out.println("Area of the square: " + (side * side));
 }

 public void calculateArea(int length, int breadth) {
     System.out.println("Area of the rectangle: " + (length * breadth));
 }
}

//Child class
class Square extends Shape {
 @Override
 public void calculateArea(int side) {
     System.out.println("Area of the square (overridden): " + (side * side));
 }
}

//Main class
public class Methodoverrideandoverloading {
 public static void main(String[] args) {
     Shape shape = new Shape();
     shape.calculateArea(5);  // Invokes calculateArea(int side)
     shape.calculateArea(4, 6);  // Invokes calculateArea(int length, int breadth)

     Square square = new Square();
     square.calculateArea(7);  // Invokes overridden calculateArea(int side)
 }
}
