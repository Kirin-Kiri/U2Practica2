package com.ieschabas;
import java.util.Scanner;

/**
 * Área y perímetro de un rectángulo
 * Pide al usuario la base y la altura de un rectángulo y muestre su área y perímetro.
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base:");
        double base = scanner.nextDouble();
        System.out.println("Introduce la altura:");
        double altura = scanner.nextDouble();
        System.out.println("Area: " + (base*altura)); //Multiplica base por altura
        System.out.println("Perimetro: " + 2*(base + altura)); //Suma base con altura y multiplica por 2
        scanner.close();
    }
}
