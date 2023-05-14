package Secuencias;

import java.util.Scanner;

public class Ejercicio02 {
    public static String[] eliminarNombre(String[] nombres, String nombreAEliminar) {

        int posicionAEliminar = -1;

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length(); j++)
            {
                if (nombres[i].charAt(j) != nombreAEliminar.charAt(j)) break;
                if (j == nombres[i].length() - 1) posicionAEliminar = i;
            }

            if (posicionAEliminar >= 0 ) break;
        }

        if (posicionAEliminar == -1) return nombres;

        for (int i = posicionAEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = null;

        String[] arregloFiltrado = new String[nombres.length - 1];

        for (int i = 0; i < nombres.length - 1; i++) {
            arregloFiltrado[i] = nombres[i];
        }

        return arregloFiltrado;
    }

    public static void main(String[] args) {
        /*Elaborar un algoritmo para cargar un arreglo de 50 nombres de 30 caracteres*/
        Scanner myScanner = new Scanner( System.in );

        int cantidadNombres = 3;
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

        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ": " + nombres[i]);
        }

        System.out.println("Ingrese un nombre a eliminar: ");
        String nombreAEliminar = myScanner.nextLine();

        nombres = Ejercicio02.eliminarNombre(nombres, nombreAEliminar);

        System.out.println("Nuevo arreglo: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ": " + nombres[i]);
        }
    }
}