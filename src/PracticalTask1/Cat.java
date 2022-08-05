package PracticalTask1;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Mrrrrr");
    }

    @Override
    public void feed() {
        System.out.println("Give cat fish");
    }
}
