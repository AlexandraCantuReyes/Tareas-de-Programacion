import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.println("Ingresa el nombre del producto 1:");
        String nombrep1 = input.nextLine();

        System.out.println("Ingresa la cantidad de productos:");
        int cantidadp1 = input.nextInt();

        System.out.println("Ingresa el precio unitario del producto:");
        double precio1 = input.nextDouble();

        System.out.println("Ingresa el porcentaje del descuento del producto:");
        double descuento1 = input.nextDouble();

        System.out.println("Ingresa los impuestos aplicables en porcentaje:");
        double impuestos1 = input.nextDouble();

        System.out.println("Ingresa el nombre del producto 2:");
        String nombrep2 = input.nextLine();

        System.out.println("Ingresa la cantidad de productos:");
        int cantidadp2 = input.nextInt();

        System.out.println("Ingresa el precio unitario del producto:");
        double precio2 = input.nextDouble();

        System.out.println("Ingresa el porcentaje del descuento del producto:");
        double descuento2 = input.nextDouble();

        System.out.println("Ingresa los impuestos aplicables en porcentaje:");
        double impuestos2 = input.nextDouble();

        System.out.println("Ingresa el nombre del producto 3:");
        String nombrep3 = input.nextLine();

        System.out.println("Ingresa la cantidad de productos:");
        int cantidadp3 = input.nextInt();

        System.out.println("Ingresa el precio unitario del producto:");
        double precio3 = input.nextDouble();

        System.out.println("Ingresa el porcentaje del descuento del producto:");
        double descuento3 = input.nextDouble();

        System.out.println("Ingresa los impuestos aplicables en porcentaje:");
        double impuestos3 = input.nextDouble();

        double operacion = (cantidadp1*precio1);
        double operacion1 =((descuento1/100)*operacion);
        double operacion4 = operacion-operacion1;
        double operacion2 = ((impuestos1/100)* operacion4);
        double operacion5 = (operacion-operacion1) + operacion2;

        double operacion122 = (cantidadp2*precio2);
        double operacion12 =((descuento2/100)*operacion122);
        double operacion42 = operacion122-operacion12;
        double operacion22 = ((impuestos2/100)* operacion42);
        double operacion52 = (operacion122-operacion12) + operacion22;

        double operacion133 = (cantidadp3*precio3);
        double operacion13 =((descuento3/100)*operacion133);
        double operacion43 = operacion133-operacion13;
        double operacion23 = ((impuestos3/100)* operacion43);
        double operacion53 = (operacion133-operacion13) + operacion23;

        double resultadofinal = operacion5+operacion52+operacion53;

        System.out.println("Producto 1: " + nombrep1);
        System.out.println("Cantidad: " + cantidadp1);
        System.out.println("Precio total sin descuento: " + operacion);
        System.out.println("Descuento aplicable: " + operacion1);
        System.out.println("Precio con descuento: " + operacion4);
        System.out.println("Impuestos aplicados: " + operacion2);
        System.out.println("Total apagar: " + operacion5 +"\n" );

        System.out.println("Producto 2: " + nombrep2);
        System.out.println("Cantidad: " + cantidadp2);
        System.out.println("Precio total sin descuento: " + operacion122);
        System.out.println("Descuento aplicable: " + operacion12);
        System.out.println("Precio con descuento: " + operacion42);
        System.out.println("Impuestos aplicados: " + operacion22);
        System.out.println("Total apagar: " + operacion52 + "\n");

        System.out.println("Producto 1: " + nombrep3);
        System.out.println("Cantidad: " + cantidadp3);
        System.out.println("Precio total sin descuento: " + operacion133);
        System.out.println("Descuento aplicable: " + operacion13);
        System.out.println("Precio con descuento: " + operacion43);
        System.out.println("Impuestos aplicados: " + operacion23);
        System.out.println("Total apagar: " + operacion53 + "\n" );

        System.out.println("Cantidad final" + resultadofinal);

    }
}
