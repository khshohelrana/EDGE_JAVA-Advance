


interface Aaaanimal {
    void eat();
}


interface Pet {
    void play();
}


class Ddddog implements Aaaanimal, Pet {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing.");
    }
}


public class Multiple_Inheritance {
    public static void main(String[] args) {
        Ddddog myDog = new Ddddog();
        myDog.eat();
        myDog.play();
    }
}

