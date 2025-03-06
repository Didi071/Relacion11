package Relacion11;

public abstract class Empleado {
    //Atributos
    protected String nombre;

    //Constructor por defecto
    public Empleado() {
        this.nombre = "María";
    }
    //Constructor con parámetros
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //get
    public String getNombre() {
        return nombre;
    }

    public abstract void sacarPantalla();
}
