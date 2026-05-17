import java.util.Scanner;

public class CuentaBancaria {

    private double saldo;

    public void menuCuentaBancaria(Scanner scanner){

        int opcion;

        do {
            System.out.println("\n--- CUENTA BANCARIA ---\n");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Volver al menu principal\n");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

              switch (opcion) {
                case 1:  depositar(scanner);
                    break;
                case 2: retirar(scanner);
                    break;
                case 3: ObtenerSaldo();
                    break;
                case 4: System.out.println("Volviendo al menu...");
                    break;
                default: System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 4);


    }

    public void depositar(Scanner scanner){

        System.out.print("Introduce el monto a depositar: ");
        double cantidad = scanner.nextDouble();
        saldo = saldo + cantidad;
        System.out.print("Su monto ha sido depositado con exito \n");

    }

    public void retirar(Scanner scanner){

        System.out.print("Ingrese el monto a retirar: ");
        double cantidad = scanner.nextDouble();
        
        if(cantidad > saldo){
            System.out.print("Saldo insuficiente");
        }
        else{

            saldo = saldo - cantidad;
            System.out.print("Su monto ha sido retirado");
        }

        System.out.print("Su monto ha sido retirado con exito: \n");
    }

    public void ObtenerSaldo(){

        System.out.print("Su monto actual es de: " + saldo);
    }
    
}
