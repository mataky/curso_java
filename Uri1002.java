import java.util.Scanner;

public class Uri1002{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

double r, pi, area;

r = teclado.nextDouble();
pi = 3.14159;

area = (r * r) * pi;


    System.out.printf("A=%.4f\n",area);
    }
}