import java.util.Locale;
import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        // comentario de uma linha

        /*
        comentario de multiplas linhas
         */

        /**
         * JAVADOC
         */

        // Criando um tipo primitivo
        int idade = 20;

        // criando uma classe
        String nome = "Pedro";
        /*
        System.out.println("Meu nome eh "+ nome + " e minha idade eh "+ idade);
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        double d = 15;
        int i = (int) d; //casting para guardar a parte inteira do double no i
        System.out.println(i);


        //como fazer entrada de dados
        //usandeo a classe Scanner
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o seu nome");
        nome = leitor.nextLine();

        System.out.println("nome:" + nome);

        */

        int ano1 = 0;
        int ano2 = 0;
        int ano3 = 0;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantos viloes foram derrotados no ano 1?");
        ano1 = leitura.nextInt();

        System.out.println("Quantos viloes foram derrotados no ano 2?");
        ano2 = leitura.nextInt();

        System.out.println("Quantos viloes foram derrotados no ano 3?");
        ano3 = leitura.nextInt();

        System.out.printf("Presos: Ano1: %d, Ano2: %d, Ano3: %d inimigos derrotados", ano1, ano2, ano3);



    }


}
