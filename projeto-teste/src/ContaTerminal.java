import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

            
            double saldo = 237.48;
            
            System.out.println("Por favor, digite o seu nome: ");
            String nomeTitular = scanner.nextLine();
            
            System.out.println("Por favor, digite o número da sua conta: ");
            int numeroConta = scanner.nextInt();
            
            System.out.println("Por favor, digite o número da sua Agência: ");
            String numeroAgencia = scanner.next();
            
            System.out.println("OLá, " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e o seu saldo de R$" + saldo + " já está disponível para saque.");
            
        scanner.close();

    }
}
