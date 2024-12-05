public class Main {
    public static void main(String[] args) {
        //Atividades da aula de foco do dia 05/12/24

        //somaDeNumeros(5);
        //fatorial(5);
        //contagemDeDigitos(12345);
        numerosPrimos(29);



    }

    public static void somaDeNumeros(int n) {
        //1 - Escreva um programa que receba um número inteiro n e calcule a soma dos números de 1 a n usando um loop for.
        int soma = n;

        for (int i = 1; i < n; i++) {
            soma = soma +i;

        }
        System.out.println(soma);
    }

    public static void fatorial (int n) {
        //2 - Escreva um programa que receba um número inteiro n e calcule o
        //fatorial de n usando um loop while.

        int soma = n;
        int i = n -1;

        while (i >= 1) {
            soma = soma * i;

            i--;
        }
        System.out.println(soma);

    }

    public static void contagemDeDigitos(int n) {
        //3 - Escreva um programa que receba um número inteiro e conte quantos
        //dígitos ele possui.

        String numeroConvertido = Integer.toString(n);
        System.out.println(numeroConvertido.length());

    }

    public static void numerosPrimos (int n) {
        //4 - Escreva um programa que verifique se um número inteiro é primo.

        if (n / n == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}