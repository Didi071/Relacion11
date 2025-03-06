package Relacion11;

public class Bicicleta extends Vehiculo {
        //Constructor
        public Bicicleta (int kmRecorridos){
            this.kmRecorridos = kmRecorridos;
            vehiculosCreados ++;
            kmTotales += kmRecorridos;
        }
    
        //Metodos
        public void andarBicicleta(){
            System.out.println("Estás andando en bici!!");
        }
    
        public void caballitoBici(){
            System.out.println("Estas haciendo el caballito con la bici");
        }
        @Override
        public int getKmRecorridos() {
            return kmRecorridos;
        }
    @Override
    public String toString() {
        return "La bicicleta con un recorrido de " + kmRecorridos;
    }
}
