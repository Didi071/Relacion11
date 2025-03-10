package Relacion11;

public class Bibloteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro(123456,"La Ruta Prohibida",2007);
        Libro libro2 = new Libro(112233, "Los Otros", 2016);
        Libro libro3 = new Libro(456789, "La rosa del mundo", 1995);
        Revista revista1 = new Revista(444555, 344, 2019, "Año Cero");
        Revista revista2 = new Revista(002244, 255, 2003, "National Geographic");

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);

        libro2.prestar();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro2.prestar();
        libro2.devuelve();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro3.prestar();
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
