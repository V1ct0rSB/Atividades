import java.util.Scanner;

public class Ex005 {
    // Escrever um programa que leia o nome de um aluno e as notas das três
    // provas que ele obteve no semestre. No final informar o nome do aluno e a
    // sua média (aritmética).

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        double nota1;
        double nota2;
        double nota3;
        double notaFinal;

        System.out.print("Digite o nome do aluno: ");
        nome = input.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = input.nextDouble();

        notaFinal = (nota1 + nota2 + nota3) / 3;

        System.out.format("A média do aluno %s foi de %f", nome, notaFinal);
    }
}
