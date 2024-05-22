public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++) {
            if(numero == 3) {
                break; // continue aqui irá desconsiderar o 3 e ir até o 5;
            }

            System.out.println(numero);
        }
    }
}
