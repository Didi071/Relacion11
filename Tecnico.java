package Relacion11;

public class Tecnico extends Operario{
    //Cosntructor
    public Tecnico(){
        super();
    }

    //ToString
    /*public String toString(){
        return "Empleado " + nombre + " -> Operario -> Técnico";
}*/

    @Override
    public void sacarPantalla() {
        System.out.println("Empleado " + nombre + " -> Operario -> Técnico");        
    }
}
