package PracticalTask1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Animal dog = new Dog();
        Animal cat = new Cat();

        animals.add(dog);
        animals.add(cat);

        dog.voice();
        dog.feed();
        cat.voice();
        cat.feed();
    }
}
