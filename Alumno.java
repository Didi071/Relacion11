package Relacion11;


public class Alumno extends Persona2 {
    String grupo;
    double notaMedia;

    public Alumno(String gr, double nMedia, String nom, String ape, String fNac){
        super(nom, ape, fNac);
        grupo = gr;
        notaMedia = nMedia;
    }

    @Override
    public String toString() {
        return "El alumno " + nombre + " " + apellido + " del grupo " + grupo +" con una nota media de " + notaMedia + " y su fecha de naicmiento " + fechaNacim;
    }

    @Override
    public void mostrar() {
        System.out.println("El alumno " + nombre + " " + apellido + " del grupo " + grupo +" con una nota media de " + notaMedia + " y su fecha de naicmiento " + fechaNacim);
    }
}
