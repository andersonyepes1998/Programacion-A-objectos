package com.edu.cesde;
import javax.imageio.metadata.IIOMetadataFormat;
import java.util.Scanner;

public class objecto {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("INGRESE LA CANTIDAD DEL PRODUCTO A REGISTRAR: ");
        int cantproduct = Integer.parseInt(inputData.nextLine());
        Product[] products = new Product[cantproduct];


        //lleno la base de datos
        for (int i = 0; i < products.length; i++) {
            Product monitorhp = new Product();
            System.out.println("Ingrese el nombre del producto: ");
            monitorhp.setName(inputData.nextLine());
            System.out.println("Ingrese el precio: ");
            monitorhp.setPrince(Double.parseDouble(inputData.nextLine()));
            products[i] = monitorhp;
        }

        System.out.println("Ingrese producto a buscar: ");
        String userInput = inputData.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(userInput)){
                System.out.println(products[i].getPrince());
                break;
            }
        }
    }
}
