                              // Question: Explain the concept of polymorphism in Java.


// Polymorphism allows objects of different types to be treated as objects of a common type.
// In Java, polymorphism is achieved through method overriding and interfaces.
// Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.


class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
