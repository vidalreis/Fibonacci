package Fibonacci;

import java.util.Scanner;

public class FibonacciVers4 {

    public static void main(String[] args) {
        //Scanner é um import para que se consiga inserir um numero no algoritmo com ele executando
        Scanner sc = new Scanner(System.in);

        //Variáveis utilizadas
        int atual, entrada, inic = 0, prox = 1, cont = 1;

        //Aqui o código vai escrever essa frase em aspas
        System.out.println("introduza um limite de repetições para o Fibonacci");
        //Aqui declarei que a variável "entrada" receba o valor que irá ser intoduzido
        entrada = sc.nextInt();
        //Pula linha para ficar bonito
        System.out.println();

        //Aqui vai mostrar a varável contadora
        System.out.print("(" + cont + ")");
        //aqui vai mostrar o valor da variável "inic" antes do laço acontecer, que no momento o valor do "inic" é 0
        System.out.println(inic);

        //Contador vai se somar uma vez antes de acontecer o laço
        cont++;

        //laço de repetição While e condição a frente dele
        //O While (enquanto) vai se repetir enquanto o contador for menor que a variável "entrada", quando ele for maior, o algoritmo se encerra 
        while (cont <= entrada) {
            
            //aqui a variável atual vai receber os próximos valores "inic" + "prox"
            //inic que é a variável onde o 0 começa 
            //atual onde o valor começa com 1
            //e o prox que vai receber o número anterior
            atual = inic + prox;

            //aqui vai mostrar o contador e depois o numero atual
            //Assim:
            //(1)0
            //(2)1
            //(3)1
            //(4)2
            //(5)3
            System.out.print("(" + (cont) + ")");
            System.out.println(atual);

            //aqui onde a mágica acontece
            prox = inic;
            inic = atual;

            //aqui toda vez que o laço atual for se acabar ele soma mais um para que no próximo laço o valor fique correto
            cont++;
            //aqui ele volta pro laço até a condição ser satisfeita
        }
    }
}
