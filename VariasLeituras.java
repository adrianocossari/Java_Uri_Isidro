import java.util.Scanner;
public class VariasLeituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String strCodigo, strPreco;
        int codigo;
        String nome;
        float preco;

        
        System.out.println("Digite o codigo do produto");
        strCodigo = teclado.nextLine();          // leio o valor como String
        codigo    = Integer.parseInt(strCodigo);    // realizo a conversão de String para INT
        System.out.println("Digite o nome do produto");
        nome      = teclado.nextLine();
        System.out.println("Digite o preço do produto");
        strPreco  = teclado.nextLine();
        preco     = Float.parseFloat(strPreco);

        System.out.println("Produto Cadastrado: "+codigo+"/"+nome+"/R$ "+preco);

        System.out.println("Agora digite seu nome");
        nome = teclado.next();
        System.out.println("Seu nome vale = "+nome);
    }
}