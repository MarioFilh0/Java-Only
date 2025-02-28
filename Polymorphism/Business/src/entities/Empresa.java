package entities;

public abstract class Empresa {
    private String name;
    private Double annualRent;

    public Empresa(){
        super();
    }

    public Empresa(String name, Double annualRent){
        super();
        this.name = name;
        this.annualRent = annualRent;
    }

    public Double getAnnualRent() {
        return annualRent;
    }

    public Empresa setAnnualRent(Double annualRent) {
        this.annualRent = annualRent;
        return this;
    }

    public String getName() {
        return name;
    }

    public Empresa setName(String name) {
        this.name = name;
        return this;
    }

    public abstract Double tax();

    @Override
    public String toString() {

        return getName()
                + ": $ "
                + String.format("%.2f", tax());
    }
}
