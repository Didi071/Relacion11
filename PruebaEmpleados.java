package Relacion11;

public class PruebaEmpleados {
    public static void main(String[] args) {
        /*Empleado e1 = new Empleado("Rafa");*/
        Directivo d1 = new Directivo();
        /*Operario op1 = new Operario();*/
        Tecnico t1 = new Tecnico();
        
        d1.setNombre("Mario");
        /*op1.setNombre("Alfonso");*/
        t1.setNombre("Luis");
        /*System.out.println(e1);*/
        System.out.println(d1);
        /*System.out.println(op1);*/
        System.out.println(t1);

    }
}
