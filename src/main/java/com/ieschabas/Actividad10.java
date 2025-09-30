package com.ieschabas;
import java.util.Scanner;

/**
 * Fecha con ceros a la izquierda
 * Pide al usuario el día, mes y año y muestre la fecha en formato YYYY-MM-DD.
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el día:");
        int dia = scanner.nextInt();
        System.out.println("Introduce el mes:");
        int mes = scanner.nextInt();
        System.out.println("Introduce el año:");
        int anyo = scanner.nextInt();

        System.out.println("Fecha: " + anyo + "-" + String.format("%02d", mes) + "-" + String.format("%02d",dia)); //Mostramos años como tal esta, mes en formato de dos digitos, y dia en dos digitos
        scanner.close();
    }

}
