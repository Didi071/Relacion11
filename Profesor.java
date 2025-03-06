package Relacion11;


public class Profesor extends Persona2{
    String especialidad;
    double salario;


    public Profesor(String esp, double sal, String nom, String ape, String fNac){
        super(nom, ape, fNac);
        especialidad = esp;
        salario = sal;
    }

    @Override
    public String toString() {
        return "El profesor " + nombre + " " + apellido + " con especialidad en " + especialidad +" con un salario de " + salario + " y su fecha de naicmiento " + fechaNacim;
    }
    @Override
    public void mostrar() {
        System.out.println("El profesor " + nombre + " " + apellido + " con especialidad en " + especialidad +" con un salario de " + salario + " y su fecha de naicmiento " + fechaNacim);
    }
}
