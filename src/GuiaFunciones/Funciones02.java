package GuiaFunciones;/*
Ejercicio 2:
Escribir dos funciones que permitan calcular:
a) La duración en segundos de un intervalo dado en horas, minutos y segundos.
b) La duración en horas, minutos y segundos de un intervalo dado en segundos.
 */

public class Funciones02 {
    public static void main(String[] args) {
        int horas = 4;
        int minutos = 31;
        int segundos = 59;

        int segundosSinFormatear = 9743;

        System.out.println("Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundos + ", Resultado: " + calcularSegundos(horas, minutos, segundos));

        int[] horasMinutosSegundos = calcularHorasMinutosYSegundos(segundosSinFormatear);
        for (int i = 0; i < horasMinutosSegundos.length; i++) {
            System.out.println("\t" + horasMinutosSegundos[i] + "\t");
        }
    }

    static int calcularSegundos(int horas, int minutos, int segundos) {
        return (horas * 60 * 60) + (minutos * 60) + segundos;
    }

    static int[] calcularHorasMinutosYSegundos(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        int[] resultado = {horas, minutos, segundosRestantes};
        return resultado;
    }
}