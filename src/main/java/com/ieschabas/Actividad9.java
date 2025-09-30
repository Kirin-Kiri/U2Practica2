package com.ieschabas;
import java.util.Scanner;

/**
 * Iniciales en mayúscula
 * Pide al usuario su nombre y primer apellido y muestre sus iniciales en mayúscula, separadas por punto.
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu primer apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Iniciales: " + nombre.substring(0,1).toUpperCase() + "." + apellido.substring(0,1).toUpperCase()); //Mostramos posicion de 0 a 1 del nombre en mayuscula, y apellido posicion de 0 a 1 en mayuscula
        scanner.close();
    }
}
