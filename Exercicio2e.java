import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    double basemaior, basemenor, altura, area;

    //entrada
    System.out.println("Por favor digite o valor da base maior");
    basemaior = teclado.nextDouble();

    System.out.println("Por favor digite o valor da base menor");
    basemenor = teclado.nextDouble();

    System.out.println("Por favo digite o valor da altura");
    altura = teclado.nextDouble();
    
    // processamento
    area = (basemaior + basemenor) * altura / 2;
    //saida
    System.out.println("A area do trapezio de base maior "+basemaior + " , base menor "+basemenor + "e altura "+altura + " vale "+area);
    }
}