package com.ieschabas;
import java.util.Scanner;

/**
 * Conversor de temperatura
 * Pide una temperatura en grados Celsius y muestre su equivalente en Fahrenheit y en Kelvin.
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Celsius:");
        double temperatura = scanner.nextDouble();
        System.out.println("Fahrenheit: " + (temperatura*1.8 + 32)); //Multiplica temperatura dada 1.8 mas 32
        System.out.println("Kelvin: " + (temperatura+273.15)); //Suma temperatura + kelvin
        scanner.close();
    }
}
