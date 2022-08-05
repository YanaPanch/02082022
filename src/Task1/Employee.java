package Task1;

public abstract class Employee {
    private String employeeId;
    private String name;
    private String surname;
    private String position;

    public Employee(String employeeId, String name, String surname, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee: " + "employeeId " + employeeId +
                ", name " + name +
                ", surname " + surname +
                ", position " + position;
    }
}
