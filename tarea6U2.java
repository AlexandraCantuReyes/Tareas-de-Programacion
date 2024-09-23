import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para almacenar el total acumulado de los tres productos

        double totalAcumulado = 0;

        // Procesar los datos para 3 productos

           for (int i = 1; i <= 3; i++) {
            System.out.println("Producto " + i + ":");

            // Entrada de datos del producto

            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Cantidad del producto: ");
            int cantidad = sc.nextInt();

            System.out.print("Precio unitario del producto: ");
            double precioUnitario = sc.nextDouble();

            System.out.print("Porcentaje de descuento (0 si no aplica): ");
            double descuento = sc.nextDouble();

            System.out.print("Porcentaje de impuestos aplicables: ");
            double impuesto = sc.nextDouble();

            //Cálculos

            double precioSinDescuento = cantidad * precioUnitario;
            double montoDescuento = (precioSinDescuento * descuento) / 100;
            double precioConDescuento = precioSinDescuento - montoDescuento;
            double montoImpuestos = (precioConDescuento * impuesto) / 100;
            double precioTotal = precioConDescuento + montoImpuestos;

            //Sumar al total acumulado

            totalAcumulado += precioTotal;

            // Mostrar resultados del producto

            System.out.println("Resumen del Producto " + i + ":");
            System.out.printf("Nombre: %s\n", nombre);
            System.out.printf("Cantidad: %d\n", cantidad);
            System.out.printf("Precio total sin descuento: %.2f\n", precioSinDescuento);
            System.out.printf("Monto de descuento: %.2f\n", montoDescuento);
            System.out.printf("Precio con descuento: %.2f\n", precioConDescuento);
            System.out.printf("Impuestos aplicados: %.2f\n", montoImpuestos);
            System.out.printf("Precio total a pagar: %.2f\n", precioTotal);
            System.out.println("-");
        }

        // Mostrar el total acumulado para los tres productos

        System.out.printf("Total acumulado a pagar por los tres productos: %.2f\n", totalAcumulado);

    }
}
