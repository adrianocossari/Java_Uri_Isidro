public class Uri1059{
    public static void main(String args[]){
        int valor;
        valor = 1;
        
        /* versão com WHILE */
        /*
        while (valor <=100){
            if (valor % 2 == 0){
                System.out.println(valor);
            }
            valor = valor + 1;
        }
        */


        /* versão com DO-WHILE 

        do{
            if (valor %2 == 0){
                System.out.println(valor);
            }
            valor = valor +1;
        } while (valor <= 100);
        */

        /* versão com FOR */
        for (valor=1; valor<=100; valor = valor + 1){
            if (valor % 2 == 0){
                System.out.println(valor);
            }
        }


    }
}