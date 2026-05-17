import java.util.Scanner;

public class Vehiculos {

    protected String marca;
    protected String modelo;
    protected int year;

    public void menu(Scanner scanner) {
    int opcion;

    do {
        System.out.println("\n--- HERENCIA DE VEHICULOS ---\n");
        System.out.println("1. Registrar Carro");
        System.out.println("2. Registrar Camioneta");
        System.out.println("3. Registrar Motocicleta");
        System.out.println("4. Volver al menu principal\n");
        System.out.print("Elige una opcion: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1: {
                Carro carro = new Carro();
                carro.Registar(scanner);
                carro.mostrar();
                break;
            }
            case 2: {
                Camioneta camioneta = new Camioneta();
                camioneta.Registar(scanner);
                camioneta.mostrar();
                break;
            }
            case 3: {
                Motocicleta moto = new Motocicleta();
                moto.Registar(scanner);
                moto.mostrar();
                break;
            }
            case 4: System.out.println("Volviendo al menu...");
                break;
            default: System.out.println("Opcion invalida");
                break;
        }

    } while (opcion != 4);
}

    public Vehiculos(String marca, String modelo, int year){

        this.marca = marca;
        this.modelo = modelo;
        this.year = year;

    }

    public void Registar(Scanner scanner){

        scanner.nextLine();

        System.out.print("Ingrese la marca: ");
        marca = scanner.nextLine();

        System.out.print("Ingrese el modelo: ");
        modelo = scanner.nextLine();

        System.out.print("Ingrese el year: ");
        year = scanner.nextInt();

    }

    public void mostrar() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);

    }

}