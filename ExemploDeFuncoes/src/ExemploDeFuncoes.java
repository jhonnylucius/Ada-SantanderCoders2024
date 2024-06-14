import java.util.ArrayList;
import java.util.Scanner;

public class ExemploDeFuncoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int soma = numero;
        
        ArrayList<Integer>somaArrayList = new ArrayList<>(); // Criando uma lista para armazenar os pares

        while (soma < 10) {
            soma++;
            System.out.println("Somando 1... Soma atual: " + soma);
            
            somaArrayList.add(soma); 
            
        } 

    System.out.println("Parabéns! A soma atingiu 10.");

    System.out.println("Números encontrados: " + somaArrayList);
   System.out.println();
    scanner.close();
}

}


