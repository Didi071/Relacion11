package Relacion11;

public class PruebaAlProf {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("2ºE", 9.2, "Ana", "López", "15/19/2005");
        Alumno alumno2 = new Alumno("1ºA", 8.5, "Carlos", "García", "25/8/2002");
        Profesor prof1 = new Profesor("X", 1800, "III", "AAA", "14/02/1980");
        
        alumno1.mostrar();
        alumno2.mostrar();
        prof1.mostrar();
    }
}
