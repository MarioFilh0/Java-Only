package entities;

public class Product {
    private String name;
    private Double price;


    // Constructor
    public Product(){
        super();
    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    //Getters nd Setters
    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Product setPrice(Double price) {
        this.price = price;
        return this;
    }

    //Methods
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f", getPrice());
    }

}
