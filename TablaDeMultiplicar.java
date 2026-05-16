import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args){

        TablaDeMultiplicar tabla = new TablaDeMultiplicar();
        tabla.tablasMultiplicar();
    }
    
    public void tablasMultiplicar(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nElige que tabla de multiplicar quieres ver (Solo disponible hasta la 12): ");
        //numero fijo de la tabla
        
        int numTabla = scanner.nextInt();
        //variable tabla que sera el resultado

        //salto de linea
        System.out.println();

         int tabla = 0;

        for(int i = 1; i <= 12; i++)
        {

            tabla = numTabla * i;
            System.out.println( + numTabla+ " x " + i + " = "+ tabla);
        }

        scanner.close();
    }
    
}
