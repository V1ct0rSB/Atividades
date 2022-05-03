import java.util.Scanner;

public class Ex007 {

    // Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
    // Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a
    // temperatura em Fahrenheit e C a temperatura em Celsius.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int C;
        int F;

        System.out.print("Digite a temperatura em Celsius: ");
        C = input.nextInt();

        F = (9 * C + 160) / 5;

        System.out.format("%d° graus Celsius em Fahrenheit é de %d° graus.", C, F);
    }
}
