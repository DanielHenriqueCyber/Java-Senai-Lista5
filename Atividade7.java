package AtividadeLista5While;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, cont, soma;
        soma = 0;
        cont = 0;
        System.out.println("Digite um numero limite: ");
        number = sc.nextInt();
        while (soma < number){
            cont++;
            System.out.println(cont+"+"+soma);
            soma += cont;
            System.out.println(soma);
        }
    }
}
