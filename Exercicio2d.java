import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    double diagonal1, diagonal2, area;

    //entrada
    System.out.println("Por favor digite o valor da diagonal1");
    diagonal1 = teclado.nextDouble();


    diagonal2 = teclado.nextDouble();

    // processamento
    area = diagonal1 * diagonal2;

    //saida
    System.out.println("A area do losango de diagonal1 "+ diagonal1 + " e diagonal2 "+diagonal2 + " vale "+area);
    }
}