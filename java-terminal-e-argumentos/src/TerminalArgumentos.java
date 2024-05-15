import java.util.Locale;
import java.util.Scanner;


public class TerminalArgumentos {
    public static void main(String[] args) throws Exception {
        

        //iniciando o scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //imprimindo os dados do usuário

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("e também tenho " + altura + "cm ");


    }

}
