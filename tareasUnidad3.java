//Tarea 1: Calcular el promedio de una serie de números
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();
        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double promedio = suma / cantidad;
        if (promedio > 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        scanner.close();
    }
}

//Tarea 2: Contar pares e impares
import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        int pares = 0, impares = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        scanner.close();
    }
}

//Tarea 3: Serie Fibonacci hasta n
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número n: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Serie Fibonacci: " + a);

        while (b <= n) {
            System.out.print(", " + b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        scanner.close();
    }
}

//Tarea 4: Números primos
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        boolean esPrimo = n > 1;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }
        scanner.close();
    }
}

//Tarea 5: Mostrar los divisores de un número
import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        System.out.print("Los divisores de " + n + " son: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}

//Traea 6: Verificar si un número es palíndromo
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String numero = scanner.next();

        String invertido = new StringBuilder(numero).reverse().toString();
        if (numero.equals(invertido)) {
            System.out.println(numero + " es un palíndromo.");
        } else {
            System.out.println(numero + " no es un palíndromo.");
        }
        scanner.close();
    }
}

//Tarea 7: Adivina el número
import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número (entre 1 y 100)");
        do {
            System.out.print("Ingrese su intento: ");
            intento = scanner.nextInt();

            if (intento < secreto) {
                System.out.println("El número es mayor.");
            } else if (intento > secreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("Correcto, el número era " + secreto);
            }
        } while (intento != secreto);

        scanner.close();
    }
}

//Tarea 8: Tablas de multiplicar personalizadas
import java.util.Scanner;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número base: ");
        int numero = scanner.nextInt();
        System.out.print("Ingrese el rango: ");
        int rango = scanner.nextInt();

        for (int i = 1; i <= rango; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}

//Tarea 9: Ordenar tres números
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = scanner.nextInt();

        // Ordenamiento manual
        if (a > b) { int temp = a; a = b; b = temp; }
        if (a > c) { int temp = a; a = c; c = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }

        System.out.println("Números ordenados: " + a + ", " + b + ", " + c);
        scanner.close();
    }
}









