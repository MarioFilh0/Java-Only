package entities;

import java.util.*;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;

    public Contract(Date date, Double totalValue, Integer number) {
        this.date = date;
        this.totalValue = totalValue;
        this.number = number;
    }

    public Contract(){
        super();
    }

    public Date getDate() {
        return date;
    }

    public Contract setDate(Date date) {
        this.date = date;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Contract setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public Contract setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
        return this;
    }
}
