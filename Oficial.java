package Relacion11;

public class Oficial extends Operario {
    //Constructor
    public Oficial(){
        super();
    }

    //ToString
    /*public String toString(){
        return "Empleado " + nombre + " -> Operario -> Oficial";
    }*/

    @Override
    public void sacarPantalla() {
        System.out.println("Empleado " + nombre + " -> Operario -> Oficial");        
    }

}
