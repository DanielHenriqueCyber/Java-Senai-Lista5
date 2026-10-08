package AtividadeLista5While;
import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        int cont,mult;
        cont=1;
        mult=0;
        System.out.println("a taboada de sete é:");
        while (cont<=10){
            mult=7 * cont;
            System.out.println("7 X " + cont + " = " + mult );

            cont++;
        }

    }
}
