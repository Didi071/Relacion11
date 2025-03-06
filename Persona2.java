package Relacion11;

public abstract class Persona2 {
    String nombre;
    String apellido;
    String fechaNacim;

    public Persona2(String nom, String ape, String fNac){
        nombre = nom;
        apellido = ape;
        fechaNacim = fNac;
    }
    public String getApellido() {
        return apellido;
    }
    public String getFechaNacim() {
        return fechaNacim;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract String toString();

    public abstract void mostrar();
}
