package GuiaPractica01;

public enum Ej03Presupuestos {
    URGENCIA(0.37),
    PEDIATRIA(0.42),
    TRAUMATOLOGIA(0.21);

    private double budget;

    Ej03Presupuestos(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}