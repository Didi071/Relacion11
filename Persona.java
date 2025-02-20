package Relacion11;

public class Persona {

    //Atributos
    String nif;
    int altura;
    int edad;

    //Constructor por defecto
    public Persona(){
        nif = "11111111A";
        altura = 175;
        edad=25;
    }
    
    //Constructor 
    public Persona(String nif, int altura, int edad){
        this.nif=nif;
        this.altura=altura;
        this.edad=edad;
    }

    //getters
    public int getAltura() {
        return altura;
    }
    public int getEdad() {
        return edad;
    }
    public String getNif() {
        return nif;
    }

    //setters
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Años: " + edad + " atura: " + altura + " y NIF: " + nif;
    }

    // Metodos Ejercicio 2
    public void hablar(){
        System.out.println("Hablar");
    }
    public void comer(){
        System.out.println("Comer");
    }
}