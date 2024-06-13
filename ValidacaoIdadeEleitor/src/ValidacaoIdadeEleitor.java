import java.util.Scanner;

public class ValidacaoIdadeEleitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        System.out.println("Por favor, digite sua idade: ");
        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Esperar ter pelo menos 16 anos!");
        } else { 
            System.out.println("Ir até o Cartório Eleitoral mais proximo");
            System.out.println("Votar em outubro");
            scanner.close();
        }

        }
}    


