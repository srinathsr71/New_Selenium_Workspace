package OOPS;

//Superclass
class Animal {
 private String name;

 public Animal(String name) {
     this.name = name;
 }

 public void eat() {
     System.out.println(name + " is eating.");
 }
}

//First subclass
class Dog extends Animal {
 public Dog(String name) {
     super(name);
 }

 public void bark() {
     System.out.println("Woof!");
 }
}

//Second subclass
class Cat extends Animal {
 public Cat(String name) {
     super(name);
 }

 public void meow() {
     System.out.println("Meow!");
 }
}

//Main class
public class Inheritance {
 public static void main(String[] args) {
     // Create objects of the subclasses
     Dog dog = new Dog("Buddy");
     Cat cat = new Cat("Whiskers");

     // Call methods of the subclasses
     dog.eat();
     dog.bark();

     cat.eat();
     cat.meow();
 }
}
