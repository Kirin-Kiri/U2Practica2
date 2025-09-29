package com.ieschabas;
import java.util.Scanner;

/**
 * Volumen de un cilindro
 * Pide al usuario el radio y la altura de un cilindro y muestre su volumen.
 */

public class Actividad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio:");
        double radio = scanner.nextDouble();
        System.out.println("Introduce la altura:");
        double altura = scanner.nextDouble();
        System.out.println("Volumen: " + (Math.PI*Math.pow(radio, 2)*altura)); //Multiplica PI por radio cuadrado(utilizando Math.pow) y por altura
        scanner.close();
    }
}
