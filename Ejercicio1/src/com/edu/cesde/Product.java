package com.edu.cesde;

import java.util.Scanner;

public class Product {

    private double prince;
    private String name;
    private String reference;
    private String Kind0fMeasure;
    private double size;
    private String code;

    void setPrince(double prince){
        Scanner inputData = new Scanner(System.in);

        if (prince <= 10000000){
            this.prince = prince;
        }
        else{
            System.out.println("No se puede poder un precio mayor a 10 millones.");
        }
    }
    double getPrince(){
        return this.prince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getKind0fMeasure() {
        return Kind0fMeasure;
    }

    public void setKind0fMeasure(String kind0fMeasure) {
        Kind0fMeasure = kind0fMeasure;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
