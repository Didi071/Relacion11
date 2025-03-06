package Relacion11;

public class Yogur {
    //Atributos
    float calorias;

    //Constructor
    public Yogur(){
        calorias=120.5f;
    }
    //get
    public float getCalorias() {
        return calorias;
    }
    @Override
    public String toString() {
        return "El yogur tiene " + calorias + "calorias";
    }
    
}
