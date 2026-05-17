import java.util.Scanner;

public class PromedioNotas {

    //main de prueba
    // static void main(String[] args){

    //     Scanner scanner = new Scanner(System.in);
    //     PromedioNotas promedio =new  PromedioNotas();
    //    System.out.printf("El promedio es de: %.2f%n ", promedio.calculaPromedio(scanner));
    // }

    public void calculaPromedio(Scanner scanner){

        System.out.print("\nIngrese la primera nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Ingrese la segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Ingrese la tercera nota: ");
        float nota3= scanner.nextFloat();

        System.out.print("Ingrese la cuarta nota: ");
        float nota4 = scanner.nextFloat();

        System.out.println();

        float sumatoria = nota1 + nota2 + nota3 + nota4;
        
        float promedio = sumatoria / 4;

        System.out.print("El promedio es = " + promedio);

    }
}