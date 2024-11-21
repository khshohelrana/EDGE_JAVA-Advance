
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}


public class Single_Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
