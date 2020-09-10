import java.util.Scanner;
public class TabuadaComum{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, contador;
        System.out.println("Digite o valor da tabuadada");
        valor = teclado.nextInt();

        contador = 1;  // inicialização
        while (contador <= 10){  // condição lógica para o código continuar executando
            System.out.println(valor + " x " +contador+ " = "+ (valor * contador)); // o que eu quero executar
            contador = contador + 1; // aqui eu modifico a variável que faz parte da condição
        }



        /* -- VERSAO INEFICIENTE -- 
        System.out.println(valor + " x 1 = "+ (valor *1));
        System.out.println(valor + " x 2 = "+ (valor *2));
        System.out.println(valor + " x 3 = "+ (valor *3));
        System.out.println(valor + " x 4 = "+ (valor *4));
        System.out.println(valor + " x 5 = "+ (valor *5));
        System.out.println(valor + " x 6 = "+ (valor *6));
        System.out.println(valor + " x 7 = "+ (valor *7));
        System.out.println(valor + " x 8 = "+ (valor *8));
        System.out.println(valor + " x 9 = "+ (valor *9));
        */

    }
}