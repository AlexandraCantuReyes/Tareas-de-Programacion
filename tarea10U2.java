public class Main {
    public static void main(String[] args) {
        String palabra = ("supercalifrangilisticoespialidoso");
        int longitud = palabra.length();
        System.out.println(longitud);
        char mostrar = palabra.charAt(10);
        System.out.println(mostrar);
        String Mayusculas = palabra.toUpperCase();
        System.out.println(Mayusculas);
        String subcadena = palabra.substring(5, 15);
        System.out.println(subcadena);
        int primerOcurrencia = palabra.lastIndexOf("i");
        System.out.println(primerOcurrencia);
        int ultimaOcurencia = palabra.lastIndexOf("o");
        System.out.println(ultimaOcurencia);
        String convertirMinusculas = palabra.toLowerCase();
        System.out.println(convertirMinusculas);
        String subcadenaDos = palabra.substring(7, 29);
        System.out.println(subcadenaDos);
        int ocurrencia = palabra.lastIndexOf("li");
        System.out.println(ocurrencia);

    }
}
