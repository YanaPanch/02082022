package Task1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<>();

        SalariedEmployee john = new SalariedEmployee("123", "John", "Johnson", "Junior Java developer", "123456789");
        ContractEmployee marry = new ContractEmployee("234", "Marry", "Smith", "Junior Java developer",20, 120,"234567891");

        employee.add(john);
        employee.add(marry);

        for (Employee em : employee) {
            String info = em.toString();
            System.out.println(info);
        }
    }
}
