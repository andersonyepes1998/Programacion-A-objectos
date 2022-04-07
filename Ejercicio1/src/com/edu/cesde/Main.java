package com.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        Product monitorhp = new Product();
        monitorhp.setName("Monitor HP 24 FULL HD");
        //monitorhp.setCode("SKU1020");
        //monitorhp.setPrince(monitorhp.getPrince());


        Product cpuhd = new Product();
        cpuhd.setName("CPU HP Corei 15");
        cpuhd.setPrince(cpuhd.getPrince());

        //System.out.println("precio del monitor: " +monitorhp.getPrince());
        //System.out.println("precio de la cpu: " +cpuhd.getPrince());

        // write your code here
    }
}
