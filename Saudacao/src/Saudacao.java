import java.time.LocalTime;
import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour();

        String saudacao;
        if (hora >= 5 && hora < 12) {
            saudacao = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        System.out.println(saudacao + ", " + nome + "!");
        scanner.close();
    }
}