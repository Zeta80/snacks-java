import java.util.Scanner;

public class snack1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il primo numero:");
        int numero1 = input.nextInt();

        System.out.println("Inserisci il secondo numero:");
        int numero2 = input.nextInt();

        int maggiore = Math.max(numero1, numero2);
        System.out.println("Il numero maggiore è " + maggiore);


    }
}
