public class Main {
    public static void main(String[] args) {
        String palabra = "Garcia, Juan Carlos";
        int longitud = palabra.length();
        System.out.println("Longitud: " + longitud);
        String cortarCadena =palabra.substring(0, 6);
        System.out.println("Cortar cadena: " + cortarCadena);
        String cortarNombre =palabra.substring(8, 19);
        System.out.println("Cortar nombre: " + cortarNombre);
        String cortarnombre = palabra.substring(8, 12);
        System.out.println("Cortarnombre: " + cortarnombre);
        String  apellidoMayusculas = palabra.substring(0, 6);
        String apellido = apellidoMayusculas.toUpperCase();
        System.out.println(apellido);
        String minusculas = palabra.toLowerCase();
        System.out.println(minusculas);
        char caracterposicion=palabra.charAt(5);
        System.out.println(caracterposicion);
        int ocurrenciaA = palabra.indexOf("a");
        System.out.println(ocurrenciaA);
        int ocurrenciaB = palabra.lastIndexOf("a");
        System.out.println(ocurrenciaB);
    }
}
