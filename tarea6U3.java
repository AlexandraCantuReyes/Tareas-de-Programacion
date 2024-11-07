import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Ingresa nombre");
        String nombre = imput.nextLine();
        imput.nextLine();

        System.out.println("Ingrese numero de verificacion");
        String verificacion = imput.nextLine();
        imput.nextLine();

        System.out.println("Ingrese promedio general");
        double promedio = imput.nextDouble();
        imput.nextLine();

        System.out.println("Ingrese materia a inscribir");
        int materia = imput.nextInt();
        imput.nextLine();

        System.out.println("Materia aprobada el semestre pasado");
        int semestre = imput.nextInt();
        imput.nextLine();
        if (promedio < 7) {
            System.out.println("Se niega la inscripcion a cualquier materia");
        }
        if (promedio >= 7 && promedio < 8.5) {
        } else if (materia < 3) {
            System.out.println("Se le permite la inscripcion");
        } else {
            System.out.println("Se niega la inscripcion, sobrecarga");
        }
        if (promedio >= 8.5) {
        } else if (nombre.length() > 25) { System.out.println("Corrige el nombre");
        } else if (verificacion.length() < 8) {
            System.out.println("Formato incorrecto");
        } else if (verificacion.length() >= 8) { System.out.println("Se le permite mas de 5 materias");
        } else if (semestre > 3){ System.out.println("Se le permite hasta 6 materias");
        }else { System.out.println("Se le restrige a 5 materias");
        }

        //Ejercicio 2

        System.out.println("Ingresa tipo de membresia (premiun, estandar o basico)");
        String tipo = imput.nextLine().toLowerCase();
        imput.nextLine();

        System.out.println("Ingrese tu edad");
        int edadd = imput.nextInt();
        imput.nextLine();

        System.out.println("Ingrese evento (nacional o internacional)");
        String evento = imput.nextLine().toLowerCase();
        imput.nextLine();
        if (tipo.equals("Premium")) {
        } else if ( edadd < 18) {
            System.out.println("Se le niega la compra para eventos internacionales");
        } else if ( edadd >= 18 && edadd <= 25) {
        }  else if ( evento.equals("Nacional")) {
            System.out.println("Se le ofrece 10% de escuento");
        } else { System.out.println("Se le ofrece 25% de escuento");
        } if (edadd >= 25) {
        } else if (evento.equals("Internacional")) {
            System.out.println("Se le ofrece 25% de descuento");
        } else {
            System.out.println("Se le ofrece 15% de descuento");}
        if (tipo.equals("Estandar")) {
        } else if ( edadd < 18) {
            System.out.println("Se le niega la compra a eventos internacionales");
        }  else if ( edadd < 18) {
        } else if (evento.equals("Nacional")) {
            System.out.println("Se le ofrece 5% de escuento");
        } else {
            System.out.println("no tiene descuento");}
        if (tipo.equals("basico")) {
        } else { System.out.println("no tiene derecho a descuento y no puedes comprr boletos para enventos internacionales");}

        System.out.println("Ingresa tu nombre");
        String nombre = imput.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = imput.nextInt();
        imput.nextLine();

        System.out.println("Ingresa tu país");
        String pais = imput.nextLine();

        System.out.println("Ingresa tu estado civil: (soltero / casado)");
        String estadoCivil = imput.nextLine();

        System.out.println("Ingresa tus ingresos anuales:");
        double ingresos = imput.nextDouble();
        imput.nextLine();

        System.out.println("Ingresa si tienes hijos o no (si / no)");
        String tieneHijos = imput.nextLine();
        if (nombre.matches(".*\\d.*")) {
            System.out.println("Error. El usuario no debe de contener dígitos.");
        } else {
            if (edad < 25) {
                System.out.println("No eres elegible para beneficios.");
            } else {
                if (pais.equals("México") && estadoCivil.equals("Casado")) {
                    if (ingresos < 300000) {
                        if (tieneHijos.equals("si")) {
                            double descuento = ingresos * .10;
                            double montoFinal = ingresos - descuento;
                            String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                            System.out.println(resultado);
                        } else {
                            double descuento = ingresos * .05;
                            double montoFinal = ingresos - descuento;
                            String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                            System.out.println(resultado);
                        }
                    }
                } else if(pais.equals("México") && estadoCivil.equals("soltero")) {
                    if (ingresos < 400000) {
                        double descuento = ingresos * .08;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %.2f, monto final: %.2f", nombre, descuento, montoFinal);
                        System.out.println(resultado);
                    } else {
                        System.out.println("No recibes beneficios");
                    }
                } else if (pais.equals("U.S.A")) {
                    if (ingresos < 500000 && estadoCivil.equals("Casado")) {
                        double descuento = ingresos * .12;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                        System.out.println(resultado);
                    } else if (ingresos < 200000 && estadoCivil.equals("soltero")) {
                        double descuento = ingresos * .07;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                        System.out.println(resultado);
                    } else if (tieneHijos.equals("si")) {
                        double descuento = ingresos * .03;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                        System.out.println(resultado);
                    }
                } else {
                    double descuento;
                    double descuentoAdicional = 0;
                    if (estadoCivil.equals("Casado")) {
                        System.out.println("Se aplica 5% de descuento");
                        descuento = ingresos * .05;
                    } else {
                        descuento = ingresos * .03;
                    }
                    if (ingresos < 200000) {
                        descuentoAdicional = ingresos * .02;
                    }
                    double montoFinal = ingresos - descuento - descuentoAdicional;
                    String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                    System.out.println(resultado);
                }
            }
        }
    }
}
