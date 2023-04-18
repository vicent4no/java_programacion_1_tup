/*
Calcula el precio de un boleto de viaje, tomando en cuenta el número de kilómetros que
se van a recorrer, siendo el precio Bs/.10,50 por Km
 */

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia a recorrer en kilómetros: ");
        float distancia = MyScanner.nextFloat();

        System.out.println("El precio del boleto es: " + distancia * 10.50 + "Bs");
    }
}