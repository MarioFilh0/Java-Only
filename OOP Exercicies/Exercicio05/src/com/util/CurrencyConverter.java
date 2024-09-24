package com.util;

public class CurrencyConverter {

    public static double convertReais(double dol, double dol_bought){
        double total_Dol = dol*dol_bought;
        return total_Dol += (0.06*total_Dol); // Adicional de 6% de IOF.
    }
}
