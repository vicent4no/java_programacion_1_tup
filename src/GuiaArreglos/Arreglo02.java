public class Arreglo02 {
    public static void main(String[] args) {
        /**Ejercicio 2:
         Escribir un programa que dada una lista de n�meros enteros, escribir una funci�n que:
         a) Devuelva una lista con todos los que sean primos.
         b) Devuelva la sumatoria de los valores
         c) Devuelva el promedio de los valores.*/

        int[] datosNumericos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int longitudArregloPrimos = 0;
        int sumatoria = 0;
        int promedio = 0;

        for (int numero: datosNumericos) {
            int contadorDivisores = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contadorDivisores++;
                }
            }
            if (contadorDivisores == 2 || numero == 1) {
                longitudArregloPrimos++;
            }
            sumatoria += numero;
        }

        promedio = sumatoria / datosNumericos.length;

        // Ahora extraigo los números primos.
        int[] numerosPrimos = new int[longitudArregloPrimos];

        int posicionPrimo = 0;
        for (int numero: datosNumericos) {
            int contadorDivisores = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contadorDivisores++;
                }
            }
            if (contadorDivisores == 2 || numero == 1) {
                numerosPrimos[posicionPrimo] = numero;
                posicionPrimo++;
            }
        }

        System.out.println("Los numeros primos ingresados son: ");
        for (int primo : numerosPrimos) {
            System.out.print(primo + " ");
        }
        System.out.println("");

        System.out.println("La sumatoria de los valores es: ");
        System.out.println(sumatoria);

        System.out.println("El promedio de los valores es: ");
        System.out.println(promedio);

    }
}