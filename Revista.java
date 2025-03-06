package Relacion11;

public class Revista extends Publicacion{
    //Atributo 
    int numero;
    
    //Constructor
    public Revista(int cod, int numero, int año, String titulo){
        super();
        this.numero = numero;
        this.año = año;
        this.titulo = titulo;
        codigo = cod;
    }

    //ToString
    public String toString(){
        return "Revista: " + titulo + " - " + año + " - " + numero + " - " + codigo;
    }
}
