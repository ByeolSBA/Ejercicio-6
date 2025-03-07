import java.util.Arrays;
import java.util.Scanner;
public class DiezTeclado {
    public static void main (String [] args){
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        int positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("\nCantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
        
        scanner.close();
    }
}
