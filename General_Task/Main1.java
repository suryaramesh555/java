abstract class Animal {
    abstract void speak(); // Abstract method
    abstract void eat(); // Abstract method
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("woof");
    }

    @Override
    void eat() {
        System.out.println("num num");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.speak(); // Will print "woof"
        myDog.eat(); // Will print "num num"
    }
}