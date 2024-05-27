import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class TryCatch {
    public static void main(String[] args) throws Exception {
        
        try {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario

        System.out.println("Olá! Me chamo" + nome.toUpperCase() + " " + sobrenome.toUpperCase()); 
        System.out.println("Tenho " + idade + " anos " );
        System.out.println("Minha altura é " + altura + " cm.");

        scanner.close();

        } 
        
        catch (InputMismatchException e) {
            System.out.println("Digite apenas números!");
        }
    }
}
