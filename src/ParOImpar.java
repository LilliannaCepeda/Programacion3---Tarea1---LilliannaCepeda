import java.util.Scanner;


public class ParOImpar{

    //"main" de prueba:

    //  public static void main(String[] args){

    //      ParOImpar valor = new ParOImpar();

    //      valor.CalculaParOImpar();

    //  }

    public void CalculaParOImpar(Scanner scanner){
        
        System.out.print("Digite el numero: ");
        int num = scanner.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Este numero es Par");
        }
        else
        {
            System.out.println("Este numero es impar");
        }
    
    }

}