import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

    int codigo, qte;
    double valor, total;

    codigo = teclado.nextInt();
    qte = teclado.nextInt();
    valor = teclado.nextDouble();
    total = valor * qte;
    
    codigo = teclado.nextInt();
    qte = teclado.nextInt();
    valor = teclado.nextDouble();
    total += valor * qte;
  

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}