import java.util.Scanner;
public class DiaSemana {
     public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Digite un numero del 1 al 7: ");
            int Numero = scanner.nextInt();
            while (Numero != 0) {
                if (Numero >= 8){
                    System.out.println("Inserte un numero valido");
                    System.out.println("Digite un numero del 1 al 7: ");
                    Numero = scanner.nextInt();
                } else if (Numero == 1) {
                    System.out.println("Es lunes");
                    break;
                } else if (Numero == 2) {
                    System.out.println("Es martes");
                    break;
                } else if (Numero == 3) {
                    System.out.println("Es miercoles");
                    break;
                } else if (Numero == 4) {
                    System.out.println("Es jueves");
                    break;
                } else if (Numero == 5) {
                    System.out.println("Es viernes");
                    break;
                } else if (Numero == 6) {
                    System.out.println("Es sabado");
                    break;
                } else if (Numero == 7) {
                    System.out.println("Es domingo");
                    break;
                }



            }
    }
}
