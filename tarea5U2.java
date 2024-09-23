import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y capturar datos del domicilio

        System.out.println("Ingrese su domicilio completo:");
        System.out.print("Calle: ");
        String calle = sc.nextLine();
        System.out.print("Número: ");
        String numero = sc.nextLine();
        System.out.print("Colonia: ");
        String colonia = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Estado: ");
        String estado = sc.nextLine();
        System.out.print("Código postal: ");
        String codigoPostal = sc.nextLine();

        // Solicitar y capturar datos académicos

        System.out.println("\nIngrese los datos de su educación:");
        System.out.println("Datos de la primaria:");
        System.out.print("Nombre de la primaria: ");
        String primaria = sc.nextLine();
        System.out.print("Año de inicio: ");
        String inicioPrimaria = sc.nextLine();
        System.out.print("Año de fin: ");
        String finPrimaria = sc.nextLine();

        System.out.println("\nDatos de la secundaria:");
        System.out.print("Nombre de la secundaria: ");
        String secundaria = sc.nextLine();
        System.out.print("Año de inicio: ");
        String inicioSecundaria = sc.nextLine();
        System.out.print("Año de fin: ");
        String finSecundaria = sc.nextLine();

        System.out.println("\nDatos de la preparatoria:");
        System.out.print("Nombre de la preparatoria: ");
        String preparatoria = sc.nextLine();
        System.out.print("Año de inicio: ");
        String inicioPrepa = sc.nextLine();
        System.out.print("Año de fin: ");
        String finPrepa = sc.nextLine();

        // Solicitar y capturar datos del deporte favorito
        System.out.println("\nDatos de su deporte favorito:");
        System.out.print("Nombre del deporte: ");
        String deporte = sc.nextLine();
        System.out.print("¿Con qué frecuencia lo practica?: ");
        String frecuencia = sc.nextLine();
        System.out.print("¿Por cuántos años lo ha practicado?: ");
        String anosPractica = sc.nextLine();
        System.out.print("¿En qué nivel lo practica (amateur/profesional)?: ");
        String nivel = sc.nextLine();

        // Mostrar los datos ingresados
        System.out.println("\nDatos ingresados:");
        System.out.println("Domicilio:");
        System.out.println("Calle: " + calle + ", Número: " + numero);
        System.out.println("Colonia: " + colonia + ", Ciudad: " + ciudad + ", Estado: " + estado + ", Código postal: " + codigoPostal);

        System.out.println("\nEducación:");
        System.out.println("Primaria: " + primaria + " (de " + inicioPrimaria + " a " + finPrimaria + ")");
        System.out.println("Secundaria: " + secundaria + " (de " + inicioSecundaria + " a " + finSecundaria + ")");
        System.out.println("Preparatoria: " + preparatoria + " (de " + inicioPrepa + " a " + finPrepa + ")");

        System.out.println("\nDeporte favorito:");
        System.out.println("Deporte: " + deporte);
        System.out.println("Frecuencia de práctica: " + frecuencia);
        System.out.println("Años practicándolo: " + anosPractica);
        System.out.println("Nivel: " + nivel);

    }
}
