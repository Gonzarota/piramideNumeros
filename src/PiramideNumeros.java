import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {
        System.out.println("Dime el número de filas que quieres");
        Scanner input= new Scanner(System.in);
        int fila=input.nextInt();

        /*for(int i=1;i<=fila;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        */

        for(int i=fila;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
