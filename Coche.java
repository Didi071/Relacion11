package Relacion11;

public class Coche extends Vehiculo{

    //Constructor
    public Coche (int kmRecorridos){
        this.kmRecorridos = kmRecorridos;
        vehiculosCreados ++;
        kmTotales += kmRecorridos;
    }

    //Metodos

    public void andarCoche(){
        System.out.println("Estás andando en coche!!");
    }

    public void quemarRueda(){
        System.out.println("Haz quemado la rueda del coche :(");
    }
@Override
public int getKmRecorridos() {
    return kmRecorridos;
}

    @Override
    public String toString() {
        return "El coche con un recorrido de " + kmRecorridos;
    }
}
