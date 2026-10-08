package AtividadeLista5While;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = 0;
        System.out.println("Digite um numero limite: ");
        int varOne = sc.nextInt();
        while (begin < varOne) {
            begin += 1;
            if (begin % 5 == 0) {
                System.out.println(begin + " é multiplo de 5");
            }
        }
    }
}