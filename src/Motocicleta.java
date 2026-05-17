import java.util.Scanner;
public class Motocicleta extends Vehiculos {

    private int cilindrada;
    
    public Motocicleta(){

        super("", "", 0);
    }

    public void Registar(Scanner scanner){

        super.Registar(scanner);

        scanner.nextLine();
        System.out.print("Digite la cilindrada: ");
        cilindrada = scanner.nextInt();
    }

    public void mostrar(){

        super.mostrar();

        System.out.print("Cilindrada: " + cilindrada + "cc");
    }
}
