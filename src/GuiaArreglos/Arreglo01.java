package GuiaArreglos;

import java.util.Scanner;

public class Arreglo01 {
    /**
     * Ejercicio 1:
     * Escriba un programa que solicite al usuario un valor entero para establecer el tama�o de un
     * arreglo de n�meros enteros. Luego utilice ese valor para crear el arreglo y posteriormente
     * solicitar al usuario que ingrese cada uno de los valores para completar el arreglo.
     * Finalmente, imprima por pantalla la lista de valores ingresados por el usuario en:
     * a) El mismo orden en que fueron le�dos por el teclado.
     * b) En orden inverso al que fueron cargados.
     * c) Una lista de todos los n�meros pares.
     * d) Un lista de todos los valores que se encuentran ubicados en posiciones impares en el
     * arreglo.
     * **/

    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del arreglo: ");
        int longitudArray = MyScanner.nextInt();

        int[] numerosIngresados = new int[longitudArray];

        System.out.println("Ingrese " + longitudArray + " valores uno a uno: ");
        for (int i = 0; i < numerosIngresados.length; i++) {
            numerosIngresados[i] = MyScanner.nextInt();
        }

        for (int numero : numerosIngresados) {
            System.out.println("Valor: " + numero);
        }

        for (int i = longitudArray - 1; i >= 0; i--) {
            System.out.println("Valor: " + numerosIngresados[i]);
        }

        for (int numero : numerosIngresados) {
            if (numero % 2 == 0) {
                System.out.println("Numero par: " + numero);
            }
        }

        for (int i = 0; i <= numerosIngresados.length; i++) {
            if (i % 2 != 0) {
                System.out.println("Numero en posicion " + i + " y su valor es: " + numerosIngresados[i]);
            }
        }
    }
}