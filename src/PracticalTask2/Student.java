package PracticalTask2;

class Student extends Person{
    final String TYPE_PERSON;

    Student(String name, String type_person) {
        super(name);
        this.TYPE_PERSON = type_person;
    }

    @Override
    void print() {
        System.out.println("I am a student");
    }
}
