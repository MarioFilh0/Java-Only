package entities;

public class Fisica extends Empresa{
    private Double healthExpenses;


    public Fisica(String name, Double annualRent, Double healthExpenses) {
        super(name, annualRent);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public Fisica setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
        return this;
    }

    @Override
    public Double tax() {
        double tax = 0d;
        if(getAnnualRent() < 20000.00d){
            tax = (15.00d/100) * getAnnualRent();
        }if(getAnnualRent() >= 20000.00d){
            tax = (25.00d/100.00d) * getAnnualRent();
        }if(getAnnualRent() < 20000.00d && healthExpenses > 0){
            tax = ((15.00d/100.00d) * getAnnualRent()) - ((50.00d/100.00d) * healthExpenses);
        }if(getAnnualRent() >= 20000.00d && healthExpenses > 0){
            tax = ((25.00d/100.00d) * getAnnualRent()) - ((50.00d/100.00d) * healthExpenses);
        }
        return tax;
    }
}
