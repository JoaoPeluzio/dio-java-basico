// toda classe dever ser em primeira letra maiuscula, pois e uma convenção do java
// nomes compostos a primeira e segunda palavra devem ser maiusculas.
// toda classe começa com o prefixo public class;
// o nome da classe tem que ser o mesmo nome do arquivo;

//se a classe é um executável, ela precisa ter um método principal, como "main".
// ele deve seguir um padrão : public status void (que não irá retornar nada)
// para imprimir uma informação: system.out

/**
 * Variáveis:
 * 
 * toda variável deve começar com a letra minúscula;
 * se a variável possuir nome composto, seguimos o padrão camelCase;
 *  - se temos uma variável final em maiúsculo, significa que ela não pode sofrer alteração ao longo do programa. 
 *  - Exemplo: "final String BR = "Brasil"; "
 * 
 * Para declarar variáveis não se pode utilizar caracteres, números e símbolos. 
 *  - Algumas regras:
 *   -Deve conter apenas letras, underline(_), $ ou os números de 0 a 9;
 *   -Inicia por uma letra, ou underline, ou $, jamais com número;
 *   -inicia no padrão camelCase;
 *   -Não pode ter espaços;
 *   -Não pode usar palavra chave;
 *   -Nome deve ser único dentro de um escopo.
 * 
 */

 
  
 public class MinhaClasse {
 
     public static void main (String [] args) {
        
         System.out.print ( "Olá, João!" );
     
     }
 
 }
 