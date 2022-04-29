import java.util.Scanner;

public class Ex002 {

    // Escrever um programa que receba dois números e ao final mostre a soma,
    // subtração, multiplicação e a divisão dos números lidos

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int sum, subt, div, mult;

        System.out.print("Digite o primeiro número: ");
        x = input.nextInt();

        System.out.print("Digite o segundo número: ");
        y = input.nextInt();

        sum = x + y;
        subt = x - y;
        div = x / y;
        mult = x * y;

        System.out.format("O resultado da soma é %d \n", sum);
        System.out.format("O resultado da subtração é  %d \n", subt);
        System.out.format("O resulatado da divisão é  %d \n", div);
        System.out.format("O resultado da multipliacação  é %d ", mult);
    }
}
