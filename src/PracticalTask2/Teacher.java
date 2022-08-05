package PracticalTask2;

public class Teacher extends Staff{
    final String TYPE_PERSON;

    public Teacher(String name, String type_person) {
        super(name);
        this.TYPE_PERSON = type_person;
    }

    @Override
    void salary() {
        System.out.println("My salary is - 4000");
    }
}
