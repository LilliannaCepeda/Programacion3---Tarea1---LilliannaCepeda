import java.util.Scanner;

public class ContadorVocales{

    //main de prueba
    // public static void main(String[] args){

    //     ContadorVocales texto = new ContadorVocales();

    //     texto.contarVocales();
    // }


    public void contarVocales(Scanner scanner){


        scanner.nextLine();
        System.out.print("Digite el texto: ");
        String texto = scanner.nextLine().toLowerCase();;
        int Contador = 0;

        for(int i = 0; i < texto.length(); i++){

            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

                Contador ++;
                
            }

    }

        System.out.print("En este texto se encontraron " + Contador + " vocales");


    }
}
