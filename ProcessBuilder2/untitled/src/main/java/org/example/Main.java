package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la ruta del ejecutable:");
        String ejecutable = scanner.next();
        System.out.println("La ruta es: " + ejecutable);

        System.out.println("Introduce el tiempo en segundos: ");
        int tiempo = scanner.nextInt();
        long milisegundos = tiempo * 1000L;

        System.out.println("Esperando " + tiempo + " segundos...");

        Thread.sleep(milisegundos);

        ProcessBuilder pb = new ProcessBuilder(ejecutable);
        pb.start();

        System.out.println("PROGRAMA LANZADO");


    }
}