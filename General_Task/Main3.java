class Person {
    // Overloaded talk method with different parameters
    public void talk() {
        System.out.println("Hello");
    }

    public void talk(String name) {
        System.out.println("Hello " + name);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.talk(); // Will print "Hello"
        person.talk("Alice"); // Will print "Hello Alice"
    }
}
