package com.ieschabas;
import java.util.Scanner;

/**
 * Suma de duraciones (minutos:segundos)
 * Lea los minutos y segundos de dos canciones y muestre la suma en formato mm:ss.
 * @author Oleksiy
 * @version 1.0
 */

public class Actividad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los minutos de la primera canción:");
        int minutos1 = scanner.nextInt();
        System.out.println("Introduce los segundos de la primera canción:");
        int segundos1 = scanner.nextInt();
        System.out.println("Introduce los minutos de la segunda canción:");
        int minutos2 = scanner.nextInt();
        System.out.println("Introduce los segundos de la segunda canción:");
        int segundos2 = scanner.nextInt();

        int total = minutos1 * 60 + segundos1 + minutos2 * 60 + segundos2; // Convertimos todo al segundos
        int minutos = total / 60; //Convertimos resultado a los minutos
        int segundos = total % 60; //Division por modulo para los segundos
        System.out.println("Duracion total: " + minutos + ":" + String.format("%02d", segundos)); // Muestra minutos y segundos en formato de dos digitos y si falta un digito pone 0 a izquierda
    }
}
