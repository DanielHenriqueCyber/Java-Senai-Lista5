package AtividadeLista5While;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int media = 0;
        double notaOne;
        while (cont != 5) {
            System.out.println("Digite a nota: ");
            notaOne = sc.nextDouble();
            soma += notaOne;
            media = soma/5;
            cont++;
        } System.out.println("A media aritmetica é: " + media);
    }
}
