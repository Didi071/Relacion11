package Relacion11;

public class Coche extends Vehiculo implements Arrancable{

    boolean arrancado;
    boolean detenido;
    boolean andando;

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

    //Ejercicio 9. Arrancable
    @Override
    public void arrancar() {
        System.out.println("Andando con el coche");   
        this.andando=true;
        this.arrancado=false;    
    }
    @Override
    public void detener() {
        System.out.println("Deteniendo el coche.");   
        this.andando=false;
        this.detenido=true;    
    }
    @Override
    public void estaArrancando() {
        System.out.println("El choche se está arrancando"); 
        this.detenido=false;
        this.arrancado=true;       
    }
    @Override
    public boolean estaAndando() {
        return andando;
    }
    @Override
    public boolean estaArrancado() {
        return arrancado;
    }
    @Override
    public boolean estaDetenido() {
        return detenido;
    }
    public void setAndando(boolean andando) {
        this.andando = andando;
    }
    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    public void setDetenido(boolean detenido) {
        this.detenido = detenido;
    }
}
