package entities;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class UsedProduct extends Product{


    private LocalDate manufactureDate;

    //Constructor
    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //Getters nd Setters
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public UsedProduct setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }

    //Methods
    @Override
    public String priceTag(){
        return getName() + " (used)" + " $ " + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                +manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
