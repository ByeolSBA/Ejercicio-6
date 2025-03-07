import java.util.Scanner;
public class Potencia {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite un numero: ");
        float numero = scanner.nextFloat();
        System.out.println("Digite un exponente: ");
        float exponente = scanner.nextFloat();
        if (exponente > 0){
            numero = (float)Math.pow(numero, exponente);
            System.out.println("La potencia es: "+numero);
        } else if (exponente == 0){
            numero = 1;
        } else {
            numero = 1/(float)Math.pow(numero, exponente);
        }
    }
}
