package com.ieschabas;
import java.util.Scanner;

/**
 * Media de 3 notas
 * @Lea tres notas decimales introducidas por el usuario y muestre la media con dos decimales.
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la primera nota:");
        double primera = scanner.nextDouble();
        System.out.println("Introduce la segunda nota:");
        double segunda = scanner.nextDouble();
        System.out.println("Introduce la tercera nota:");
        double tercera = scanner.nextDouble();
        System.out.println("Media: " + ((primera + segunda + tercera)/3)); //Suma tres notas y divide por tres
        scanner.close();
    }
}
