package POO;

import java.util.Scanner;

/**Ejercicio 1:
 Crea una clase llamada Cuenta que tendr� los siguientes atributos:
 1. titular y cantidad (puede tener decimales). Crear sus m�todos get, set.
 2. Crear dos constructores que permitan crear una cuenta para un titular y la cantidad.
 Tendr� dos m�todos especiales:
 1. ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida
 es negativa, no se har� nada.
 2. retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual
 a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular: ");
        String titular = myScanner.nextLine();

        System.out.println("Ingrese la cantidad inicial en la cuenta: ");
        double cantidad = myScanner.nextDouble();

        Cuenta cuenta = new Cuenta(titular, cantidad);

        System.out.println("Cantidad en la cuenta: " + cuenta.getCantidad());
        System.out.println("Ingrese una cantidad a la cuenta, si la cantidad introducida es negativa, no se hara nada: ");
        cuenta.ingresar(myScanner.nextDouble());
        System.out.println("Cantidad en la cuenta: " + cuenta.getCantidad());

        System.out.println("Retire una cantidad en la cuenta. Si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.");
        cuenta.retirar(myScanner.nextDouble());
        System.out.println("Cantidad en la cuenta: " + cuenta.getCantidad());

        System.out.println("Fin");


    }
}

class Cuenta {
    // Atributos
    private String titular;
    private double cantidad;

    // Constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this(titular, 0);
    }

    // Setters y getters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad < 0) return;
        this.setCantidad(this.getCantidad() + cantidad);
    }

    public void retirar(double cantidad) {
        if (this.getCantidad() - cantidad < 0) this.setCantidad(0);
        else this.setCantidad(this.getCantidad() - cantidad);
    }
}