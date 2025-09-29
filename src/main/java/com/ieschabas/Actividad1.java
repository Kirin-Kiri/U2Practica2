package com.ieschabas;
import java.util.Scanner;

/**
 * Eco con guiones
 * Pide al usuario una palabra por consola y la muestre tres veces separadas por guiones
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = scanner.nextLine();
        System.out.println(palabra + "-" + palabra + "-" + palabra);
        scanner.close();
    }
}
