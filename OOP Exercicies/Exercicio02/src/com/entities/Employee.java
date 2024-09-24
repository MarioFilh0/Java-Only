package com.entities;

public class Employee {

    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        double NetSalary = GrossSalary - Tax;
        return NetSalary -= Tax;
    }

    public void IncreaseSalary(double pc){
        GrossSalary += (pc/100)*GrossSalary;
    }

    public String toString(){
        return name
               +", "
               +String.format("$%.2f",NetSalary());
    }

}
