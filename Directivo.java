package Relacion11;

public class Directivo extends Empleado{
    //Constructor
    public Directivo(){
        super();
    }

    //ToString
    /*public String toString(){
        return "Empleado " + nombre + " -> Directivo";
    }*/

    @Override
    public void sacarPantalla() {
        System.out.println("Empleado " + nombre + " -> Directivo");
    }
}
