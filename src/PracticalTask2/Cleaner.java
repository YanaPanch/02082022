package PracticalTask2;

class Cleaner extends Staff{
    final String TYPE_PERSON;

    Cleaner(String name, String type_person) {
        super(name);
        this.TYPE_PERSON = type_person;
    }

    @Override
    void salary() {
        System.out.println("My salary is - 2000");
    }
}
