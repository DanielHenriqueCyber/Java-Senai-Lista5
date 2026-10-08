package AtividadeLista5While;

public class Atividade4 {
    public static void main(String[] args) {
        int number = 0;
        while(number < 50){
            number += 1;
            if(number % 2 != 0){
                System.out.println(number);
            }
        }
    }
}
