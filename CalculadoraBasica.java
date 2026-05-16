import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class CalculadoraBasica {
    
   // main falso de prueba

     public static void main(String[] args){

         CalculadoraBasica calculadoraBasica = new CalculadoraBasica();
         Scanner scanner = new Scanner(System.in);
         int opcion = 0;

         do{

            System.out.println("\nOperaciones: \n");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            System.out.println();
            System.out.print("Elige la operacion con el numero correspondiente: ");

            opcion = scanner.nextInt();

            switch (opcion){

                case 1:
                    
                    System.out.println("Resultado = " + calculadoraBasica.Sumar(scanner));
                break;

                case 2:
                      System.out.println("Resultado = " + calculadoraBasica.Restar(scanner));
                break;

                case 3: 
                     System.out.println("Resultado = " + calculadoraBasica.multiplicar(scanner));
                break;

                case 4:
                     System.out.println("Resultado = " + calculadoraBasica.Dividir(scanner));
                    break;

                case 5: 
                    System.out.println("Saliendo...");
                    break;

                default: System.out.print("Elige una opcion valda");

            }
            
         }while(opcion != 5);

         scanner.close();
        
    }

    public double Sumar(Scanner scanner){

        System.out.print("Digite el primer valor: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite el segundo valor: ");
        int num2 = scanner.nextInt();

        return num1 + num2;

    }

    public double Restar(Scanner scanner){

        System.out.println("Digite el primer valor: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite el segundo valor: ");
        int num2 = scanner.nextInt();

        return num1 - num2;
    }

    public double multiplicar(Scanner scanner){

        System.out.println("Digite el primer valor: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite el segundo valor: ");
        int num2 = scanner.nextInt();

        return num1 * num2;
    }

    public double Dividir(Scanner scanner){

        
        System.out.println("Digite el primer valor: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite el segundo valor: ");
        int num2 = scanner.nextInt();

        return num1 / num2;

    }
    
}
