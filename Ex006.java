import java.util.Scanner;

public class Ex006 {

    // Escrever uma programa em que leia dois valores para as variáveis A e B, e
    // efetuar as trocas dos valores de forma que a variável A passe a possuir o
    // valor da variável B e a variável B passe a possuir o valor da variável A.
    // Apresentar os valores trocados.
    
    // Lembrando que temos que ter 3 variáveis para que uma haja como variável
    // de armazenamento, ou seja, para evitar que o valor original de a se perca é
    // necessário associar a uma outra variável (denominada usualmente de
    // variável auxiliar) tal valor, estabelecer uma associação de a com o valor em b
    // e, por último, associar b ao valor "salvo" na variável auxiliar.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite o número de A: ");
        a = input.nextInt();

        System.out.print("Digite o número de B: ");
        b = input.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println(" O valor de A é:" + a);

        System.out.println(" O valor de B é:" + b);

    }
}
