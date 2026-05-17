import java.util.Scanner;

public class Carro extends Vehiculos {

    private int NumPuertas;

    public Carro(){

        super("", "", 0);
    }

    public void Registar(Scanner scanner){

        super.Registar(scanner);

        scanner.nextLine();
        System.out.print("Ingrese el numero de puertas: ");
        NumPuertas = scanner.nextInt();

    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Numero de puertas: " + NumPuertas);
    }
    
}
