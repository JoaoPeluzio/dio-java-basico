## Operadores

- `String nome = "João!";`
- `int idade = 22;`
- `double peso = 68.5;`
- `char sexo = 'M';`
- `boolean doadorOrgao = false;`
- `Date dataNascimento = new Date();`

## Operações aritmeticas

- `double soma = 10.5 + 15.7;`
- `int subtração = 113 - 5;`
- `int multiplicacao = 30 * 7;`
- `int divisao = 15 / 3;`
- `int modulo = 18 % 3;` //resto da divisão
- `double resultado = (10 * 7) + (20 / 4);`

## Operadores unários

- Valor positivo `+`
- Valor negativo `-`
- Valor de incremento `++`
- Valor de decremento `--`
- Valor de negação `!`

- Tornando um número positivo: `numero = numero * -1;` (Se a variavel numero for (-5), por exemplo. Retorna 5).


## Operador ternário

- `?:`
- Exemplo: `a==b ? "verdadeiro : "falso";`

- Uma forma resumida para definir uma condição e escolher por entre dois valores.

## Operadores relacionais

Avalia relaçção entre duas variáveis ou expressões. 

- `==` verifica se há igualdade da esquerda para direita;
- `!=` verifica se uma variável é diferente uma da outra;
- `>` Verifica se uma variável é maior que a outra;
- `>=` Verifica se uma variável é maior ou igual a outra;
- `<` Verifica se uma variável é menor que a outra;
- `<=` Verifica se uma variável é menor ou igual a outra;

- OBS: `Ao usar comparação (==) com objetos, usaremos o método "equals", que nos trará uma comparação assertiva. Com números utilizamos (==)... `

- Exemplo: `Sytem.out.printIn(nomeUm.equals(nomeDois));` - A variável (string) está sendo comparada a variável nomeDois, que é um objeto. Então a varável nomeUm tem valor de "Gleyson" e a dois um objeto que também tem valor de "Gleyson";

## Operadores lógicos

Representam recurso que permite criar expressões lógicas maiores a partir de duas ou outras expressões.

- `&&` - operador lógico &&, que só é verdade quando as duas expressões são verdade;
- `||` - operador lógico OU, que só é verdade se pelo menos um for verdade.
