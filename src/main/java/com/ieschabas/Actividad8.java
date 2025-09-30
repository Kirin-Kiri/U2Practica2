package com.ieschabas;
import java.util.Scanner;

/**
 * Euros y céntimos
 * Pide un precio en euros con céntimos (por ejemplo, 12.34) y muestre por separado la parte entera (euros) y los céntimos.
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un precio en euros:");
        String precio = scanner.nextLine(); //Escaneamos al String para poder usar "busqueda por indice"
        int value = precio.indexOf("."); //Saca el indice(posicion) del punto
        System.out.println("Euros: " + precio.substring(0,value) + "\nCentimos: " + precio.substring((value+1))); //Mostramos Euros de posicion 0 hasta posicion del punto, luego mostramos segundos de posicion del punto mas 1 y hasta final
        scanner.close();
    }
}
