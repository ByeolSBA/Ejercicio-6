import java.util.Scanner;

public class CompraCliente {
    public static void main(String[] args) {
        String[] productos = {"Plancha", "Licuadora", "Lavadora", "Cocina"};
        double[] precios = {500, 300, 400, 600};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        double totalCompra = 0;
        for (double precio : precios) {
            totalCompra += precio;
        }
        double descuento = 0;
        if (totalCompra > 1200) {
            descuento = totalCompra * 0.17;
        }
        double totalFinal = totalCompra - descuento;
        System.out.println("\n--- Factura ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Productos comprados:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("- " + productos[i] + ": $" + precios[i]);
        }
        if (descuento > 0) {
            System.out.println("\nDescuento aplicado: 17% ($" + descuento + ")");
        } else {
            System.out.println("\nNo se aplica descuento.");
        }
        System.out.println("Total a pagar: $" + totalFinal);
        scanner.close();
    }
}
