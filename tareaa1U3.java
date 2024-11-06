import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = "Carlos Martinez";
        String remplazado = nombre.replace("a","1").replace("e", "2").replace("i","3").replace("o","4").replace("u","5");

        //HEXADECIMAL

        int direccion = 192;
        int dirrecionDos = 168;
        int direccionTres = 0;
        int direccionCuatro = 1;

        String hexa = Integer.toHexString(direccion);
        String hexaDos = Integer.toHexString(dirrecionDos);
        String hexaTres = Integer.toHexString(direccionTres);
        String hexaCuatro = Integer.toHexString(direccionCuatro);String heexadecimal = (hexa + "."+ hexaDos + "."+ hexaTres + "."+ hexaCuatro);
        String hexadecimal = (hexa + "."+ hexaDos + "."+ hexaTres + "."+ hexaCuatro);
        ;
        //NUMERO DE CLIENTE

        int numeroCliente = 12345;
        double formula = ((numeroCliente*3)+15)/2;

        System.out.println("Datos Cifrados: " + remplazado + "/"+ hexadecimal + "/" + formula);
    }
}



