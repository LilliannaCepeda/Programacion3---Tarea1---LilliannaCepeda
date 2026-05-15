import java.util.Scanner;

public class CalculadoraBasica {

    public double Sumar(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite el primer valor: ");
        int num1 = scn.nextInt();

        System.out.println("Digite el segundo valor: ");
        int num2 = scn.nextInt();

        scn.close();

        return num1 + num2;

    }

    public double Restar(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite el primer valor: ");
        int num1 = scn.nextInt();
        
        System.out.println("Digite el segundo valor: ");
        int num2 = scn.nextInt();

        scn.close();

        return num1 - num2;
    }

    public double multiplicar(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite el primer valor: ");
        int num1 = scn.nextInt();
        
        System.out.println("Digite el segundo valor: ");
        int num2 = scn.nextInt();

        scn.close();

        return num1 * num2;
    }

    public double Dividir(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite el primer valor: ");
        int num1 = scn.nextInt();
        
        System.out.println("Digite el segundo valor: ");
        int num2 = scn.nextInt();

        scn.close();

        return num1 / num2;
    }
    
}
//entonces cuando uso un scanner debo al final de cada uso agregar .nextLine y al final de todo el uso .close?