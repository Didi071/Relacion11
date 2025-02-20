package Relacion11;

public class Ingeniero extends Persona{
    //Metodos ejercicio 2
    public void razonar(){
        System.out.println("Razonando");
    }
    public void trabajarEnGrupo(){
        System.out.println("Trabajando en equipo");
    }

    public Ingeniero(String nif, int altura, int edad){
        super(nif, altura, edad);
    }

    public Ingeniero(){
        super();
    }
    @Override
    public String toString() {
        return "Ingeniero: NIF: " + nif + " altura: " + altura + " edad: " + edad;
    }
}
