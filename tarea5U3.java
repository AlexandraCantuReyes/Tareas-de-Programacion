import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿El candidato es ciudadano o residente? (si/no): ");
        String esCiudadano = scanner.nextLine();

        if (esCiudadano.equalsIgnoreCase("si")) {
            System.out.println("El candidato es elegible para cualquier puesto sin revisar experiencia.");
        } else {
            System.out.println("¿El candidato tiene una visa de trabajo válida? (si/no): ");
            String tieneVisa = scanner.nextLine();

            if (tieneVisa.equalsIgnoreCase("si")) {
                System.out.println("¿Cuántos años de experiencia tiene el candidato?");
                int experiencia = scanner.nextInt();

                if (experiencia >= 5) {
                    System.out.println("El candidato es elegible para un empleo calificado.");
                } else {
                    System.out.println("El candidato es elegible solo para empleos no calificados.");
                }
            } else {
                System.out.println("El candidato es rechazado por no tener una visa válida.");
            }
        }

        //SISTEMA DOS

        System.out.println("¿USA o Europa");
        String pais = scanner.nextLine();

        System.out.println("Ingresa codigo postal");
        String postal = scanner.nextLine();

        System.out.println("¿Ha hecho compras previas?");
        String comprasPrevias = scanner.nextLine();

        if (pais.equalsIgnoreCase("U.S.A")) {
        } else if (postal.startsWith("9")) {
        } else {
            System.out.println("Ingrese tarjeta de credito");
        }
        if (comprasPrevias.equalsIgnoreCase("Si")) {
            System.out.println("Pagar con paypal");
        } else if (comprasPrevias.equalsIgnoreCase("No")) {
            System.out.println("Realizar verificacion con su dirrecion");
        }

        //SISTEMA

        if (pais.equalsIgnoreCase("Europa")) {
        } else if (postal.length() == 5) {
        } else if (comprasPrevias.equalsIgnoreCase("Si")) {
            System.out.println("Pagar con transferencia bancaria");
        } else {
            System.out.println("Verificacion bancaria");
        }
        if (postal.length() < 5) {
            System.out.println("Usuario rechazado");
        } else {
            System.out.println("Ingresa verificacion manual");
        }

        //SISTEMA TRES

        int personas = 1;
        int noches = 0;
        int suite = 3;

        String preferencia = "Estandar";

        if (preferencia.equalsIgnoreCase("Suite") && personas == 1){
        } else if (suite > 3) {
        } else if ( noches >3) {
            System.out.println("Se ofrece 10% de descuento");
        } else {
            System.out.println("Se ofrece un habitacion estandar");
        } if (preferencia.equalsIgnoreCase("estandar")){
            System.out.println("Se asigna sin verificacion");}
        if (personas > 2) {
        } else if (noches > 5 ) {
            System.out.println("Se ofrece paquete de desayuno incluido");
        } else if (noches<5){
            System.out.println("Se ofrece paquete normal");
        } else {
            System.out.println("Se asigna una habitacion doble");
        }

    }
}
