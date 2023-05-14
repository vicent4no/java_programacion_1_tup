public class EjercicioClase01 {

}

class Persona {
    private long ID;
    private String name;
    private String surname;
    private String birthDate;

    Persona(long ID, String name, String surname, String birthDate) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    
}