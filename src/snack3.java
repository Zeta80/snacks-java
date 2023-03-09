import java.util.Scanner;

public class snack3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Inserisci il " + i + "° numero:");
            int numero = input.nextInt();
            somma += numero;
        }

        System.out.println("La somma di tutti i numeri è " + somma);
    }
}
