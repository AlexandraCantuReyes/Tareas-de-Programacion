import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String localidad = ("Av. Villa universidad, calle viena 30, Ciudad de Morelia, C.P. 58069");
        int longitud = localidad.length();
        System.out.println("su logitud es " + longitud);;

        char PrimerCaracter=localidad.charAt(0);
        System.out.println("el primer caracter es: " + PrimerCaracter);

        char ultimoCaracter=localidad.charAt(67);
        System.out.println("el ultimo caracter es: " + ultimoCaracter);
        String Mayusculas =localidad.toUpperCase();

        System.out.println("el mayusculas es: " + Mayusculas);
        String calle = localidad.substring(23,35);

        System.out.println("el calle es: " + calle);
        String numero = localidad.substring(35, 37);

        System.out.println("el numero es: " + numero);
        String ciudad= localidad.substring(39,56);

        System.out.println("el ciudad es: " + ciudad);
        String codigoPostal = localidad.substring(63,68);

        System.out.println("el codigoPostal es: " + codigoPostal);
        int primerAparicion = localidad.indexOf("3");

        System.out.println("el primerAparicion es: " + primerAparicion);
        String direccionCorregida = localidad.replace("," ,"");
        String Direccion = direccionCorregida.replace(".", "");

        System.out.println("el direccion es: " + Direccion);
        String direccionCompleta = localidad.replaceAll("\\s+","");

        System.out.println("el direccionCompleta sin espacio es: " + direccionCompleta);
        String versionA= localidad.substring(4,21);
        String versionM= localidad.substring(49,56);
        String codigop= localidad.substring(63,68);

        System.out.println("version abreviada: " + versionA + "," + numero + "," + versionM + "," + codigop);

    }
}
