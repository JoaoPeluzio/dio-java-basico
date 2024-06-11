import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro: ");
        int param1 = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int param2 = terminal.nextInt();
        
        
        try {
        
            contar(param1, param2);
        
        }catch (ParametrosInvalidosException exception) {

            System.out.println(exception.getMessage());

        }

        terminal.close();

    }
    
    static void contar(int param1, int param2) throws ParametrosInvalidosException {
            
            if(param1 > param2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
            };
        
            int contagem = param2 - param1;

            for(int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
    };
};

