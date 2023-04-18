package GuiaPractica01;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner( System.in );

        System.out.println("Ingrese la cantidad de kilómetros a recorrer: ");
        float distancia = MyScanner.nextFloat();

        System.out.println("El precio del boleto es: " + distancia * 45);
    }
}