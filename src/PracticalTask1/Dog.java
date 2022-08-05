package PracticalTask1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Grrrrrrrrr");
    }

    @Override
    public void feed() {
        System.out.println("Feed dog with meat");
    }
}
