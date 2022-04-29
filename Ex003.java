import java.util.Scanner;

public class Ex003 {

    // Escrever um programa para determinar o consumo médio de um automóvel sendo
    // fornecida a distância total percorrida pelo automóvel e o total de
    // combustível gasto.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double veloc01;
        double veloc02;
        double l;
        double veloFinal;
        double consumo;
        

        System.out.print("Digite o valor da primeira km: ");
        veloc01 = input.nextDouble();

        System.out.print("Digite o valor da segunda km: ");
        veloc02 = input.nextDouble();

        System.out.print("Digite a quantidade de litros consumidos: ");
        consumo = input.nextDouble();


        veloFinal = veloc02 - veloc01;


        consumo = veloFinal / consumo;


        System.out.format("O total percorrido foi de %f \n", veloFinal);

        System.out.format("A taxa média de consumo foi de %f", consumo);
    }
}
