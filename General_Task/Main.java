 class Pet {
    public void brag() {
        System.out.println("I have the best pet!");
    }
}

class Dog extends Pet {
    @Override
    public void brag() {
        super.brag(); // Call Pet's brag method
        System.out.println("I have the best dog.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.brag();
    }
}