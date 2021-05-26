import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

    int NUMBER, horas;
    double valor, SALARY;

    NUMBER = teclado.nextInt();
    horas = teclado.nextInt();
    valor = teclado.nextDouble();
 
    
    SALARY = horas * valor;

    System.out.println("NUMBER = "+NUMBER);
    System.out.printf("SALARY = U$ %.2f\n", SALARY);

    // System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}