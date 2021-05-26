import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    double raio1, raio2, altura, volume, pi;
    
    //entrada
    System.out.println("Por favor digite o valor do raio1");
    raio1 = teclado.nextDouble();
    
    System.out.println("Por favor digite o valor do raio2");
    raio2 = teclado.nextDouble();
    
    System.out.println("Por favor digite o valor da altura");
    altura = teclado.nextDouble();
    
    System.out.println("Por favor digite o valor da pi");
    pi = teclado.nextDouble();
    
    //processamento
    volume = pi * raio1 * raio2 * altura;

    //saida
    System.out.println("O volume do cilindo de raio1 "+raio1 + ", raio2 "+raio2 + " e altura "+altura + "vale "+volume);

    }
}