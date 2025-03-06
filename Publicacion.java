package Relacion11;

public abstract class Publicacion {
    //Atributos
    String titulo;
    int año;
    int codigo;

    //Metodos
    /*public Publicacion(String titulo, int año, int codigo){
    this.titulo = titulo;
    this.año = año;
    this.codigo = codigo;
    }*/
    /*public Publicacion(){
        titulo = "";
        año = 0;
        codigo=1111;
    }*/

    public int getAño() {
        return año;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public abstract String toString();

}
