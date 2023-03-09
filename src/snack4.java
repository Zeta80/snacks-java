import java.util.Scanner;

public class snack4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] invitati = {"Carmine", "Mattia", "Cristina", "Fabrizio", "Giovanni", "Valerio"};

        System.out.println("Inserisci il tuo nome:");
        String nome = input.next();

        boolean invitato = false;
        for (String invitatoAttuale : invitati) {
            if (invitatoAttuale.equalsIgnoreCase(nome)) {
                invitato = true;
                break;
            }
        }

        if (invitato) {
            System.out.println("WELLA! benvenuto alla festa di Mirko, prendi da bere e divertiti amicone o amicona mia (se sei cristina)");
        } else {
            System.out.println("VA VIA!!!, non sei stato invitato alla big festa di Mirko, prova ad essere piu simpatico e magari la prossima volta entrerai.");
        }
    }
}
