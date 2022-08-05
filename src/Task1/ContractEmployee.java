package Task1;

public class ContractEmployee extends Employee implements Payment{
    private int paidPerHour;
    private int amountHoursPerMonth;
    private String federalTaxIdmember;

    public ContractEmployee(String employeeId, String name, String surname, String position, int paidPerHour, int amountHoursPerMonth, String federalTaxIdmember) {
        super(employeeId, name, surname, position);
        this.paidPerHour = paidPerHour;
        this.amountHoursPerMonth = amountHoursPerMonth;
        this.federalTaxIdmember = federalTaxIdmember;
    }


    public int getPaidPerHour() {
        return paidPerHour;
    }

    public void setPaidPerHour(int paidPerHour) {
        this.paidPerHour = paidPerHour;
    }

    public int getAmountHoursPerMonth() {
        return amountHoursPerMonth;
    }

    public void setAmountHoursPerMonth(int amountHoursPerMonth) {
        this.amountHoursPerMonth = amountHoursPerMonth;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public int calculatePay() {
        return paidPerHour * amountHoursPerMonth;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + calculatePay();
    }
}
