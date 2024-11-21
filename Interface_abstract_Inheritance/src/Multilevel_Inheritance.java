
class Aaanimal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Mammal extends Aaanimal {
    void walk() {
        System.out.println("This mammal walks on legs.");
    }
}


class Dddog extends Mammal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Dddog myDog = new Dddog();
        myDog.eat();
        myDog.walk();
        myDog.bark();
    }
}
