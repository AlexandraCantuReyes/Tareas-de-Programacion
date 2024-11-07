import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");

        int numero = imput.nextInt();
        if (numero % 3 == 0) {
            System.out.println("es divisible entre 3");
        } else if  (numero % 5 == 0) {
            System.out.println("es divisible entre 5");
        } else {
            System.out.println("numero no divisible");
        }

        //Triangulo

        System.out.println("Ingrese lado uno");
        int ladoUno = imput.nextInt();

        System.out.println("Ingrese lado dos");
        int ladoDos = imput.nextInt();

        System.out.println("Ingrese lado tres");
        int ladoTres = imput.nextInt();
        if ( ladoUno!=ladoDos && ladoDos != ladoTres && ladoTres != ladoUno ) {
            System.out.println("El triangualo es escaleno");
        } else if ( ladoUno == ladoDos && ladoDos == ladoTres && ladoTres == ladoUno) {
            System.out.println("El triangular equilatero");
        } else System.out.println("El triangular es isoceles");

        // SALARIO

        System.out.println("Ingrese salario");
        double salario = imput.nextDouble();

        if (salario <= 10000) {
            System.out.println("No paga impuesto");
        } else if (salario >= 10001 && salario <= 20000) {
            System.out.println("se aplica 10% de impuestos");
        } else if ( salario > 20000) {
            System.out.println("paga 20% de impuestos");
            //numero par
            System.out.println("Ingrese numero");
            double numeroDos = imput.nextDouble();
            if (numeroDos % 2 == 0) { System.out.println("el numero es par");
            } else { System.out.println("el numero es impar");}
        }
    }
}
