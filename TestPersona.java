package Relacion11;
public class TestPersona {
    public static void main(String[] args){
        Persona p1 = new Persona();
        Persona p2 = new Persona("22222222B", 165, 19);
        System.out.println(p1);
        System.out.println(p2);

        p1.setEdad(30);
        System.out.println("Persona con altura: " + p1.getAltura() + " edad: " +  p1.getEdad() + " y NIF: " + p1.getNif());

        Ingeniero i1 = new Ingeniero("33333333C", 170, 25);
        i1.razonar();
        System.out.println(i1);
    }
}
