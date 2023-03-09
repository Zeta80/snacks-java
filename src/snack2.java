import java.util.Scanner;

public class snack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la prima parola:");
        String parola1 = input.next();

        System.out.println("Inserisci la seconda parola:");
        String parola2 = input.next();

        String parolaPiuCorta = (parola1.length() < parola2.length()) ? parola1 : parola2;
        String parolaPiuLunga = (parola1.length() > parola2.length()) ? parola1 : parola2;

        if (parola1.length() == parola2.length()) {
            System.out.println("Le parole hanno la stessa lunghezza.");
        } else {
            System.out.println("La parola più corta è " + parolaPiuCorta);
            System.out.println("La parola più lunga è " + parolaPiuLunga);
        }
    }
}
