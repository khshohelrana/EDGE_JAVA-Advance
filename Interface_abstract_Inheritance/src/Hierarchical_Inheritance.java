
class Aanimal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Ddog extends Aanimal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("The cat is meowing.");
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Ddog myDog = new Ddog();
        myDog.eat();
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();
    }
}
