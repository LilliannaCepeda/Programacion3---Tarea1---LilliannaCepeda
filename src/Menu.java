import java.util.Scanner;


public class Menu {

    //Main General del programa
    public static void main(String[] args){


        //objeto estudiante para usar la clase ClaseEstudiante
        ClaseEstudiante estudiante = new ClaseEstudiante(); 

        Scanner scanner = new Scanner (System.in);
        int option;
        do{
            System.out.println("\n\n--------------------MENU--------------------\n");
            System.out.println("OPCIONES\n");
            System.out.println("1. Calcualdora basica");
            System.out.println("2. Numero par  o impar");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Contador de vocales");
            System.out.println("5. Promedio de notas");
            System.out.println("6. Clase estudiante");
            System.out.println("7. Cuenta bancaria");
            System.out.println("8. Herencia de vehiculos");
            System.out.println("9. Matriz 3x3");
            System.out.println("10. Sistema basico de inventario");
            System.out.println("11. Salir de la aplicacion\n");
            System.out.print("Digite el numero de la opcion correspondiente:\t");

            option = scanner.nextInt();
            
            switch (option) {
                case 1: new CalculadoraBasica().menu(scanner);
                    break;

                case 2: new ParOImpar().CalculaParOImpar(scanner);
                    break;

                case 3: new TablaDeMultiplicar().tablasMultiplicar(scanner);
                    break;

                case 4: new ContadorVocales().contarVocales(scanner);
                    break;

                case 5: new PromedioNotas().calculaPromedio(scanner);
                    break;

                case 6: new ClaseEstudiante();
                        estudiante.RegistroEstudiante(scanner);
                        estudiante.MostrarEstudiante();
                    break;

                case 7: new CuentaBancaria().menuCuentaBancaria(scanner);
                    break;

                case 8: new Vehiculos(null, null, option).menu(scanner);
                    break;

                case 9: Matriz3x3 matriz = new Matriz3x3();
                        matriz.GuardarValores(scanner);
                        matriz.mostarMatriz();
                    break;

                case 11: System.out.println("Saliendo...");
                    break;

                default: System.out.print("Elige una opcion valida");
                    break;
            }

        }while (option != 11);
    }

}