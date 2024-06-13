/*import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        while (soma <= 10) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero > 10) {
                soma += numero;
                System.out.println("Parabéns! Você alcançou o limite! A soma dos números é: " + soma);
                break; // Sai do loop
            } else {
                System.out.println("Tente novamente.");
            }
        }
        scanner.close();
    }
}*/
import java.util.Scanner;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int soma = numero;

        while (soma < 10) {
            soma++;
            System.out.println("Somando 1... Soma atual: " + soma);
        }

        System.out.println("Parabéns! A soma atingiu 10.");
        System.out.println();
        scanner.close();
    }
}

