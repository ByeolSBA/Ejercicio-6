import java.util.Scanner;
public class CalculoIVA {
    public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Digite el precio del producto: ");
            float Precio = scanner.nextFloat();
            var IVA = Precio * 0.21 ;
            var Pfinal = Precio + IVA ;
            System.out.println("El precio total con el IVA es de: "+Pfinal);


    }
}
