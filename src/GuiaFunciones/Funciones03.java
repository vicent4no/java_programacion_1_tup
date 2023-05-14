package GuiaFunciones;/*
Ejercicio 3:
Escribir dos funciones que resuelvan los siguientes problemas:
a) Dados dos números, imprimir la suma, resta, división y multiplicación de ambos.
b) Dado un número entero n, imprimir su tabla de multiplicar.
 */

public class Funciones03 {
    public static void main(String[] args) {
        float flotante_a = 20;
        float flotante_b = 0;
        int entero_a = 9;

        operaciones(flotante_a, flotante_b);
        tablaMultiplicar(entero_a);
    }
    private static void operaciones(float a, float b) {

        System.out.println("Suma: " + a + " + " + b + " = " + (a + b));
        System.out.println("Resta: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplicacion: " + a + " * " + b + " = " + (a * b));
        if (b != 0) {
            System.out.println("División: " + a + " / " + b + " = " + (a / b));
        }
        else {
            System.out.println("División: " + a + " / " + b + " = " + "indefinido");
        }
    }

    private static void tablaMultiplicar(int a) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}