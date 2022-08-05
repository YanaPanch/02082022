package PracticalTask2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        Teacher john = new Teacher("John", "teacher");
        Cleaner tom = new Cleaner("Tom", "cleaner");
        Student jo = new Student("Jo", "student");

        persons.add(john);
        persons.add(tom);
        persons.add(jo);

        for (Person pr : persons) {
            pr.print();
        }

        john.salary();
        tom.salary();
    }
}
