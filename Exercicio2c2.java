import java.util.Scanner;

public class Exercicio2c2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    double base, altura, area;

    //entrada
    System.out.println("Por favor digite o valor da base");
    base = teclado.nextDouble();
    altura = teclado.nextDouble();

    // processamento
    area = base * altura /2;

    //saida
    System.out.println("A area do triangulo de base "+ base + " e altura "+altura + " vale "+area);
    }
}