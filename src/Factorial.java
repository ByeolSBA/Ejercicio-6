import java.util.Scanner;
public class Factorial {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite un numero");
        int numero = scanner.nextInt();
        if (numero < 0){
            System.out.println("Digite un numero positivo");
        } else{
            long factorial = 1;
            int i = numero;
            while (i > 1){
                factorial*=i;
                i--;
            }
            System.out.println("El factorial de "+numero+ " es: "+factorial);
        }

    }
}
