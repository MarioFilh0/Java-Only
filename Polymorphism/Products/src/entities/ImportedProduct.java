package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    // Constructor
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //Getter n Setters
    public Double getCustomsFee() {
        return customsFee;
    }

    public ImportedProduct setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
        return this;
    }

    //Methods
    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Custom fee: $ "
                +String.format("%.2f",getCustomsFee())+")";

    }

    public Double totalPrice(){
        return getPrice() + getCustomsFee();
    }
}
