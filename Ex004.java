import java.util.Scanner;

public class Ex004 {

    // Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
    // total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
    // vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
    // seu nome, o salário fixo e salário no final do mês.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        double salarioFixo;
        int vendas;
        double perc;
        double salarioFinal;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite o sálario fixo: ");
        salarioFixo = input.nextDouble();

        System.out.print("Digite a quantidade de venda(s)");
        vendas = input.nextInt();

        perc = (15 * vendas) / 100;
        salarioFinal = perc + salarioFixo;

        System.out.format("O nome do vendedor é %s \n", nome);

        System.out.format("O salário do mês foi %f \n", salarioFixo);

        System.out.format("A quantidade de vendas foi de %d \n", vendas);

        System.out.format("O sálario final foi de %f", salarioFinal);
    }
}
