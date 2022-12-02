package Fibonacci;

import java.util.Scanner;

public class RecursivoVers3 {
    //função abaixo, onde esta declarado que vai ser inteiro "int" e o nome da função passando um parametro no qual nesse
    //parametro que vai acontecer o return
    public static int Fibonacci(int A) {
        
        //introduzir...
        Scanner sc = new Scanner(System.in);

        //variáveis...
        int atual = 0, entrada, inic = 0, prox = 1, cont = 1;

        System.out.println("introduza um limite de repetições para o Fibonacci");
        entrada = sc.nextInt();
        System.out.println();

        System.out.print("(" + cont + ")");
        System.out.println(inic);

        cont++;

        while (cont <= entrada) {

            atual = inic + prox;

            System.out.print("(" + (cont) + ")");
            System.out.println(atual);

            prox = inic;
            inic = atual;

            cont++;

        }
        //aqui ele vai voltar o valor para a função recursiva
        return atual;
    }
    //código main
    public static void main(String[] args) {
        //declarando a variável na main que vai receber o parametro da função e não pode ter valor nulo
        int result = 0;
        //aqui esta chamando a função Fibonacci e a variável entre parênteses que vai receber o parametro
        Fibonacci(result);
    }
}
