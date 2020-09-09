import java.util.Scanner;

public class Uri1036{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C;
        double delta, R1, R2;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        delta = Math.pow(B,2) - 4 * A * C; /// Math.pow(B,2) = B * B

        if (A == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }
        else{
            R1 = (-B + Math.sqrt(delta) ) / (2*A);
            R2 = (-B - Math.sqrt(delta) ) / (2*A);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}