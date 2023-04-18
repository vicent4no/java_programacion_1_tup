package GuiaPractica01;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Ej03Presupuestos[] budgetAreas = Ej03Presupuestos.values();
        Scanner MyScanner = new Scanner(System.in);

        System.out.println("Ingrese el presupuesto asignado: ");
        double presupuesto = MyScanner.nextDouble();

        for (Ej03Presupuestos area: budgetAreas) {
            System.out.println("El presupuesto correspondiente a " + area + " es: " + area.getBudget() * presupuesto);
        }
    }
}
