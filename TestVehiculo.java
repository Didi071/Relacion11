package Relacion11;

import java.util.Scanner;

public class TestVehiculo {
    public static void main(String[] args) {
    int opc;
    Scanner entrada = new Scanner(System.in);

    Bicicleta b1 = new Bicicleta(50);
    Coche c1 = new Coche(5000);
        // Menu
        do {
            System.out.printf(" %18s \n", "---Menú---");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8)");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    b1.andarBicicleta();
                    break;
                
                case 2:
                    b1.caballitoBici();
                    break;
                case 3:
                    c1.andarCoche();
                    break;
                case 4:
                    c1.quemarRueda();
                    break;
                case 5:
                    System.out.println("El kilometraje actual es " + b1.getKmRecorridos());
                    break;
                case 6:
                    System.out.println("El kilometraje actual es " + c1.getKmRecorridos());
                    break;
                case 7:
                    System.out.println("El kilometraje total es " + Vehiculo.getKmTotales());
                    break;
                case 8:
                    System.out.println("Haz salido del programa.");
                    break;
                default:
                    break;
            }
        } while (opc!=8);

    entrada.close();
    }
}
