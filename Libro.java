package Relacion11;

public class Libro extends Publicacion implements Prestable{
    //Atributos
    boolean prestado;

    //Metodos
    public Libro(int codigo, String titulo, int año){
        super();
        this.titulo=titulo;
        this.codigo=codigo;
        this.año=año;
        this .prestado = false;
    }

    //Metodo prestar
    public void prestar(){
        if(!this.prestado){
            this.prestado=true;
            System.out.println("El libro ha sido prestado");
            } else{
            System.out.println("El libro ya ha sido prestado");
            }
        }

    //Metodo devuelve
    public void devuelve(){
        if(this.prestado){
            this.prestado=false;
            System.out.println("El libro ha sido devuelto");
        }
        }

    //Metodo esta prestado
    public boolean estaPrestado(){
        return this.prestado;
    }

    //To String
    public String toString(){
        return "Libro [titulo=" + titulo + ", codigo=" + codigo + ", año="+ año + ", prestado=" + prestado + "]";
    }
}
