import java.util.Scanner;

public class Exercicio2h2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    double raio, altura, volume, diametro;
    
    //entrada
    System.out.println("Por favor digite o diametro e altura do cilindro");
    diametro = teclado.nextDouble();
    altura = teclado.nextDouble();
    
    raio = diametro / 2;
    volume = 3.14 * raio * raio * altura;

    //saida
    System.out.printf("O volume do cilindro vale %.2f\n",+volume);

    }
}