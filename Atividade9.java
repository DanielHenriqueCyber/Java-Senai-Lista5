package AtividadeLista5While;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, cont, soma;
        soma = 0;
        cont = 0;
        System.out.println("a soma de todos os numeros entre 1 e 50 é ");
        while (cont < 50){

            cont+=2;

            soma += cont;
            System.out.println("soma do numero par: "+cont+ " pelo numero "+ soma);
            System.out.println(soma);
        }
    }
}
