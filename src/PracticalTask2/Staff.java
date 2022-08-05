package PracticalTask2;

abstract class Staff extends Person{

    Staff(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am a staff");
    }

    abstract void salary();
}
