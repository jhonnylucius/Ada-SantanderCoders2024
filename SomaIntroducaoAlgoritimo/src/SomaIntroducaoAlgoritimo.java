import java.util.Scanner;

public class SomaIntroducaoAlgoritimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        

        System.out.println("Digite o primeiro nº: "); 
        numero1  = scanner.nextInt();

        System.out.println("Digite o segundo nº: "); 
        numero2  = scanner.nextInt();
        int soma = numero1+numero2;
        System.out.println("Resultado é: " +  soma);
        scanner.close();
    }

   
    }
   

