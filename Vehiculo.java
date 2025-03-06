package Relacion11;

public abstract class Vehiculo {
    //Atributos
    static int vehiculosCreados=0;
    static int kmTotales=0;
    int kmRecorridos;

    //Metodos
    public abstract int getKmRecorridos();
    public static int getKmTotales() {
        return kmTotales;
    }
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
    public static void setKmTotales(int kmTotales) {
        Vehiculo.kmTotales = kmTotales;
    }
    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    @Override
    public abstract String toString();
}
