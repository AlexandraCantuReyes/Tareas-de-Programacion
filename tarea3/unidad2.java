import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Información de un libro favorito
        System.out.print("Sección 1: Información de un libro favorito");

        System.out.print("Ingresa el título del libro: ");
        String titulo = input.nextLine();

        System.out.print("Ingresa el nombre del autor: ");
        String autor = input.nextLine();

        System.out.print("Ingresa año de publicación: ");
        int anoPublicacion = input.nextInt();

        System.out.print("Ingresa el género del libro: ");
        String genero = input.nextLine();

        System.out.print("Ingresa número de páginas: ");
        int paginas = input.nextInt();

        System.out.print("Información del libro: ");
        System.out.println("Título: " + titulo);
        System.out.print("Autor: " + autor);
        System.out.println("Año de publicación: " + anoPublicacion);
        System.out.print("Género: " + genero);
        System.out.println("Número de páginas: " + paginas);

        // Sección 2: Información de un país que deseas visitar

        System.out.println("Sección 2: Información de un país que desee visitar");

        System.out.print("Ingresa el país: ");
        String pais = input.nextLine();
        System.out.print("Ingresa la capital del país: ");
        String capital = input.nextLine();
        System.out.print("Ingresa idioma oficial del país: ");
        String idioma = input.nextLine();
        System.out.print("Ingresa población en millones: ");
        double poblacion = input.nextDouble();
        System.out.print("Ingresa la moneda del país: ");
        String moneda = input.nextLine();

        System.out.println("\nInformación del país:");
        System.out.println("Nombre del país: " + pais);
        System.out.println("Capital: " + capital);
        System.out.println("Idioma: " + idioma);
        System.out.println("Poblacion (en millones): " + poblacion);
        System.out.println("Moneda: " + moneda);

        // Sección 3: Información de un personaje histórico favorito

        System.out.println("Sección 3: Información de un personaje histórico favorito");

        System.out.print("Ingresa nombre completo del personaje: ");
        String nombrePersonaje = input.nextLine();

        System.out.print("Ingresa fecha de nacimiento del personaje: ");
        String fechaNacimiento = input.nextLine();

        System.out.print("Ingresa nacionalidad del personaje: ");
        String nacionalidad = input.nextLine();

        System.out.print("Ingresa ocupación de personaje: ");
        String ocupacion = input.nextLine();

        System.out.print("Ingresa logro destacado: ");
        String logroDestacado = input.nextLine();

        System.out.println("\nInformación del personaje histórico:");
        System.out.println("Nombre completo del personaje: " + nombrePersonaje);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Ocupacion: " + ocupacion);
        System.out.println("Logro destacado: " + logroDestacado);

    }
}
