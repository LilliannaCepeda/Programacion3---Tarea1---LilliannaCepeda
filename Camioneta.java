import java.util.Scanner;

public class Camioneta extends Vehiculos{
    
    private double CapacidadDeCarga;

    public Camioneta(){
        super("", "", 0);
    }

    public Camioneta(String marca, String modelo, int year, double capacidadDeCarga){

        super(marca, modelo, year);
        this.CapacidadDeCarga = capacidadDeCarga;
    }

    public void Registrar(Scanner scanner){
        super.Registar(scanner);

        scanner.nextLine();
        System.out.print("Ingresa la capacidad de carga: ");
        CapacidadDeCarga = scanner.nextDouble();
    }

    public void mostrar(){
        super.mostrar();
        System.out.print("Capacidad de carga: " + CapacidadDeCarga + "Toneladas");
    }
}
