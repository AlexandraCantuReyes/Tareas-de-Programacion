import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fórmula 1

        double resultadoUno = ((12 + 8) * (5 - 3) - (6.0 / 2)) / ((3 * 4) + (8.0 / 2));

        //Fórmula 2

        double parteUno = ((9 * 5) - (15 + 3) + (8 * 2));
        double parteDos = (((12.0 / 4) * (7 + 2)) - ((6 * 3) / 2.0)) / (2 + ((8 + 2.0) / (5 + 1.0)));
        double numerador = parteUno - parteDos;
        double denominadorParteUno = ((15 - 3) / (2.0 + 1)) + ((3 * 2) - (5 + 1)) * (6.0 / 2);
        double denominadorParteDos = (3 + (8 + 1.0) / (3 + 4.0));
        double resultadoDos = numerador / denominadorParteUno / denominadorParteDos;

        //Fórmula 3

        double resultadoTres = (((6 + 4) * 3) - (18.0 / 2)) / ((8 - 5) + (3 * 2));

        //Mostrar los resultados con formato

        System.out.println("-");
        System.out.println("Resultados: ");
        System.out.println("-");

        System.out.println("| Fórmula 1: ((12 + 8) * (5 - 3) - (6/2)) / ((3 * 4) + (8/2))");
        System.out.printf("| Resultado: %.4f\n", resultadoUno);
        System.out.println("-");

        System.out.println("| Fórmula 2: (((9 * 5) - (15 + 3) + (8 * 2)) - ((12/4 * (7+2) - ((6 * 3)/2)) / (2 + (8+2)/(5+1))))");
        System.out.printf("| Resultado: %.4f\n", resultadoDos);
        System.out.println("-");

        System.out.println("| Fórmula 3: ((6 + 4) * 3 - (18/2)) / ((8 - 5) + (3 * 2))");
        System.out.printf("| Resultado: %.4f\n", resultadoTres);
        System.out.println("-");

    }
}
