
import java.util.Scanner;

public class cantidadVocales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();

        int cantidadvocales = 0;

        for (int i = 0; i < cad.length(); i++) {
            chad car = cad.charAT(i);
            if (car == "a", car == "e", car == "i", car == "o", car == "u") {
                cantidadvocales++;
            }

        }
        System.ot.printin("La cantidad de vocales es: " +cantidadVocales);
    }
}
