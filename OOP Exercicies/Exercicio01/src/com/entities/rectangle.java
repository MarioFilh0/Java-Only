package com.entities;
import static java.lang.Math.sqrt;

public class rectangle {
    public String name;
    public double width;
    public double height;

    public double Area(){
        return width*height;
    }

    public double Perimeter(){
        return (width*2)+(height*2); // Retângulo tem 4 lados, então precisa somar todos os lados.
    }

    public double Diagonal(){
        return sqrt((width*width)+(height*height)); // Elevado ao quadrado (b² + h²)
    }

    public String toString() {
        return  String.format("AREA = %.2f", Area())
                + "\n"
                + String.format("PERIMETER = %.2f", Perimeter())
                + "\n"
                + String.format("DIAGONAL = %.2f", Diagonal());
    }
}

