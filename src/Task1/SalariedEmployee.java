package Task1;

public class SalariedEmployee extends Employee implements Payment{
    private int salary;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, String surname, String position, String socialSecurityNumber) {
        super(employeeId, name, surname, position);
        this.salary=3000;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + calculatePay();
    }
}
