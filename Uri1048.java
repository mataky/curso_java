import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int per=0;
        double sal=0.00, novo=0.00, reaj=0.00;

        sal = teclado.nextDouble();

        if (sal >= 0.00 && sal <= 400.00){
            per = 15;
            novo = (sal +(sal * (per/100.00)));
            reaj = ((sal * (per/100.00)));
        }
        else if (sal >=400.01 && sal <=800.00){
            per = 12;
            novo = (sal +(sal * (per/100.00)));
            reaj = ((sal * (per/100.00)));
        }
        else if (sal >=800.01 && sal <=1200.00){
            per = 10;
            novo = (sal +(sal * (per/100.00)));
            reaj = ((sal * (per/100.00)));
        }
        else if (sal >=1200.01 && sal <=2000.00){
            per = 7;
            novo = (sal +(sal * (per/100.00)));
            reaj = ((sal * (per/100.00)));
        }
        else if (sal >=2000.01){
            per = 4;
            novo = (sal +(sal * (per/100.00)));
            reaj = ((sal * (per/100.00)));
        }
        System.out.printf("Novo salario: %.2f\n",novo);
        System.out.printf("Reajuste ganho: %.2f\n",reaj);
        System.out.println("Em percentual: "+ per +" %");
    }
}