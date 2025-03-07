import java.util.Scanner;
public class arreglo {
    public static void main (String [] Args) {
        Scanner scanner = new Scanner (System.in);
        int [] Matriz = new int [5];
        for (int i = 0; i < Matriz.length; i++) {
                System.out.println("Digite un numero para la posicion [ "+i+" ]");
                Matriz[i] = scanner.nextInt();
        }
        System.out.println("Indice de posiciones");
        for (int i = 0; i < Matriz.length; i++) {

            System.out.println(i+":"+"["+Matriz[i]+"]");
        }
    }
}
