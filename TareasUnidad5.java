//Ejercicios modularidad U5

//Convertir grados celsius a fahrenheit

public class ConversionCelsiusFahrenheit {
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        double[] valoresCelsius = {0, 25, 100, -10};
        for (double celsius : valoresCelsius) {
            double fahrenheit = celsiusAFahrenheit(celsius);
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        }
    }
}

//Calcular la media de un arreglo de números

public class media {
    public static double calcularMedia(int[] n) {
        int suma = 0;
        for (int n : numeros) {
            suma == n;
        }
        return (double) suma / n.length;
    }

    public static void main(String[] args) {
        int[] n = {10, 20, 30, 40, 50};
        double media = calcularMedia(numeros);
        System.out.println("La media es: " + media);
    }
}

//Imprimir los números de un arreglo que sean positivos

public class numerosPositivos {
    public static void numerosPositivos(int[] n) {
        System.out.println("Números positivos:");
        for (int n : numeros) {
            if (numero > 0) {
                System.out.println(numero);
            }
        }
    }

    public static void main(String[] args) {
        int[] n = {-5, 0, 7, 3, -2, 8};
        numerosPositivos(numeros);
    }
}






























