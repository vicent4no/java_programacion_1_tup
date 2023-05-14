package Secuencias;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*Elaborar un algoritmo para cargar un arreglo de 50 nombres de 30 caracteres*/
        Scanner myScanner = new Scanner( System.in );

        int cantidadNombres = 5;
        int cantidadLetras = 30;
        String[] nombres = new String[cantidadNombres];

        for (int i = 0; i < cantidadNombres; i++) {
            boolean error = true;
            System.out.println("Ingrese el " + (i + 1) + " nombre: ");
            while (error) {
                String temporal = myScanner.nextLine();
                if (temporal.length() > cantidadLetras) {
                    System.out.println("Nombre de mas de 30 letras. Intente de nuevo;");
                    continue;
                }
                nombres[i] = temporal;
                error = false;
            }
        }

        for (String nombre : nombres) {
            System.out.print(nombre + "; ");
        }
    }
}