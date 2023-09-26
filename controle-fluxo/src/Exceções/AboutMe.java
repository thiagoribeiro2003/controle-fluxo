package Exceções;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.print("Digite seu nome:");
            String nome = sc.next();

            System.out.print("Digite seu sobrenome:");
            String sobrenome = sc.next();

            System.out.print("Digite sua idade:");
            int idade = sc.nextInt();

            System.out.print("Digte sua altura:");
            double altura = sc.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            sc.close();
        } catch(java.util.InputMismatchException e) {
            System.out.println("Os campos idade e altura devem ser númericos");
        }
    }
}
