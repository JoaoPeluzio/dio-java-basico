import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
        selecaoCandidatos();
        
        //analisarCandidato(1900.0);
        //analisarCandidato(2000.0);
        //analisarCandidato(2100.0);
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARIA", "CARLOS"};
        System.out.println("Imprimindo lista de candidatos por índice");

        for (int indice = 0; indice < candidatos.length; indice++) {
            
            System.out.println("O candidato de n°: " + (indice+1) + "é " 
            + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARIA", "CARLOS"
    , "JOÃO", "PEDRO", "ANA", "LECIVALDO", "JORGE",
     "ANGÉLICA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + 
            " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com outra proposta!");
        } else {
            System.out.println("Aguardando os demais candidatos!");
        }
    }

}
