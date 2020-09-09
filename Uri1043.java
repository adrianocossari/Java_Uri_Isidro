import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float A,B,C;

        float res; // pode servir tanto para a área quanto para o perímetro

        /* como eu sei se as 3 medidas formam um triângulo?
           A soma de 2 lados quaisquer tem que ser maior que o 3o
           A+B > C
           A+C > B
           B+C > A
        */
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();
        if (A+B>C && B+C>A && A+C>B){
            res = A+B+C;
            System.out.printf("Perimetro = %.1f\n",res);
        }
        else{
            res = (A+B)*C/2;
            System.out.printf("Area = %.1f\n",res);
        }
    }
}