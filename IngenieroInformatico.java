package Relacion11;

public class IngenieroInformatico extends Ingeniero {
    //Metodos ejercicio 2
    public void crearPrograma() {
        System.out.println("Creando un programa");
    }

    //Constructor
public IngenieroInformatico(String nif, int altura, int edad) {
    super(nif, altura, edad);
}
}
