import java.util.Arrays;
import java.util.Scanner;
public class DiezTeclado {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int [] Matriz = new int [10];
        for (int i = 0; i < Matriz.length; i++) {
            System.out.println("Digite un numero positivo: ");
            int numero = scanner.nextInt();
            if (numero < 0){
                System.out.println("Digite un numero positivo valido");
                i--;
            } else {
                Matriz [i] = numero;
            }
        }
        int suma = 0;
        for (int i = 0; i < Matriz.length; i++) {
            suma += Matriz[i];
        }
        System.out.println(suma);
    }
}
