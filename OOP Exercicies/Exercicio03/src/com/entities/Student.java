package com.entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    public String toString(){
        return name
               +"\n"
               +String.format("%.2f", n1)
               +"\n"
               +String.format("%.2f", n2)
               +"\n"
               +String.format("%.2f", n3);
    }

    public void media(){
        double MediaMin = 60;
        double NotaAluno = n1+n2+n3;
        System.out.printf("FINAL GRADE = %.2f%n",NotaAluno);
        if(NotaAluno >= MediaMin){
            System.out.println("PASS");
        }else{
            double total = MediaMin - NotaAluno;
            System.out.println("FAILED");
            System.out.printf("%.2f%n", total);
        }

    }
}
