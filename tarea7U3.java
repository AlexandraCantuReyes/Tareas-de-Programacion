import java.util.Scanner;

public class EvaluacionCreditoHipotecario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar nombre y datos
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Validar que el nombre no contenga números
        if (!nombre.matches("[a-zA-Z ]+")) {
            System.out.println("El nombre solo debe contener letras.");
            return;
        }

        System.out.print("Ingrese su puntaje crediticio (300 a 850): ");
        int puntajeCrediticio = sc.nextInt();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresosMensuales = sc.nextDouble();

        System.out.print("Ingrese la cantidad solicitada para el crédito: ");
        double cantidadSolicitada = sc.nextDouble();

        System.out.print("Ingrese la duración del préstamo en años: ");
        int duracionPrestamo = sc.nextInt();

        System.out.print("Ingrese el porcentaje de ahorro personal: ");
        double porcentajeAhorro = sc.nextDouble();

        // Validación del puntaje crediticio
        double tasaInteres;
        if (puntajeCrediticio < 600) {
            System.out.println("Solicitud rechazada: puntaje crediticio insuficiente.");
            return;
        } else if (puntajeCrediticio >= 600 && puntajeCrediticio <= 740) {
            tasaInteres = 0.06;
        } else {
            tasaInteres = 0.04;
        }

        // Calcular la cuota mensual usando la fórmula de amortización
        int numeroPagos = duracionPrestamo * 12;
        double tasaMensual = tasaInteres / 12;
        double cuotaMensual = (cantidadSolicitada * tasaMensual * Math.pow(1 + tasaMensual, numeroPagos))
                / (Math.pow(1 + tasaMensual, numeroPagos) - 1);

        // Condiciones adicionales según el puntaje crediticio
        if (puntajeCrediticio >= 600 && puntajeCrediticio <= 740) {
            if (ingresosMensuales < 3 * cuotaMensual) {
                System.out.println("Solicitud rechazada: ingresos insuficientes.");
                return;
            }
        } else if (puntajeCrediticio > 740) {
            if (ingresosMensuales / cuotaMensual < 2.5) {
                System.out.println("Solicitud rechazada: relación ingresos-cuota insuficiente.");
                return;
            }
        }

        // Calcular el monto total a pagar después de la duración del préstamo
        double montoTotal = cuotaMensual * numeroPagos;

        // Mostrar los resultados
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Estado de la solicitud: Aprobada");
        System.out.println("Tasa de interés: " + (tasaInteres * 100) + "%");
        System.out.printf("Cuota mensual: %.2f\n", cuotaMensual);
        System.out.printf("Monto total a pagar: %.2f\n", montoTotal);
    }
}
