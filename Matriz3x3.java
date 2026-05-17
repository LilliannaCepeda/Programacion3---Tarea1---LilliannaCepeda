import java.util.Scanner;

public class Matriz3x3 {
    
    private int[][] matriz;

    public Matriz3x3(){
        this.matriz = new int[3][3];
    }

    public void GuardarValores(Scanner scanner){
        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

               System.out.print("Ingrese un valor para la posicion [" + i + "][" + j + "]: ");

                matriz[i][j] = scanner.nextInt();
                
            }
        }
    }

    public void mostarMatriz(){

        System.out.print("\nMatriz 3x3 \n");
        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
