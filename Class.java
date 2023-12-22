// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class extending the Animal class
class Dog extends Animal {
    void eat() {
        // invoking the eat() method of the parent class using super
        super.eat();
        System.out.println("Dog is eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Class {
    public static void main(String[] args) {
        // Creating an object of the child class
        Dog myDog = new Dog();

        // Calling the eat() method of the child class
        myDog.eat();

        // Calling the bark() method of the child class
        myDog.bark();
    }
}