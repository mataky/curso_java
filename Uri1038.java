import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

    int cod, qte;
  
    cod = teclado.nextInt();
    qte = teclado.nextInt();

    if(cod==1){
        System.out.printf("Total: R$ %.2f\n",qte*4.00);
    }
    if(cod==2){
        System.out.printf("Total: R$ %.2f\n",qte*4.50);
    }
    if(cod==3){
        System.out.printf("Total: R$ %.2f\n",qte*5.00);
    }
    if(cod==4){
        System.out.printf("Total: R$ %.2f\n",qte*2.00);
    }
    if(cod==5){
        System.out.printf("Total: R$ %.2f\n",qte*1.50);
    }
    
    }
}