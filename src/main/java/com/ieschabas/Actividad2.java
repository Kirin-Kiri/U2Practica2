package com.ieschabas;
import java.util.Scanner;

/**
 * Suma formateada
 * Pide dos números enteros al usuario y muestre la suma en formato a + b = resultado.
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int numero2 = scanner.nextInt();
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        scanner.close();
    }
}
