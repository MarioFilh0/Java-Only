package entities;

public class Juridica extends Empresa{
    private int employeeNumbers;

    public Juridica(String name, Double annualRent, int employeeNumbers) {
        super(name, annualRent);
        this.employeeNumbers = employeeNumbers;
    }

    public int getEmployeeNumbers() {
        return employeeNumbers;
    }

    public Juridica setEmployeeNumbers(int employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
        return this;
    }

    @Override
    public Double tax() {
        double tax = 0d;
        if(employeeNumbers > 10){
            tax = (14.00d/100.00d) * getAnnualRent();
        }else{
            tax = (16.00d/100.00d) * getAnnualRent();
        }
        return tax;
    }
}
