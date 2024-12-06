import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Atividades da aula de foco do dia 05/12/24

        somaDeNumeros(5);
        fatorial(5);
        contagemDeDigitos(12345);
        numerosPrimos(29);
        inversaoDeNumero(1234);
        potencia(3,4);
        palindromo(123321);
        multiploDeUmNumero(3,15);


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

    public static void inversaoDeNumero(int n) {
        //5 - Escreva um programa que inverta os dígitos de um número inteiro.

        int reverso = 0;
        int resto = 0;

        while (n != 0)
        {
            resto = n % 10;
            reverso = reverso * 10 + resto;
            n = n / 10;
        }

        //output
        System.out.println (reverso);
    }

    public static void potencia (int base, int expoente) {
        //6 - Escreva um programa que calcule a potência de um número base
        //elevado a expoente usando um loop for.

        int soma = base;

        for (int i = 1; i < expoente; i++) {
            soma = soma * base;
        }
        System.out.println(soma);
    }

    public static void palindromo(int n) {
        //7 - Escreva um programa que verifique se um número inteiro é um
        //palíndromo (lê-se da mesma forma de trás para frente).

        int resto = 0;
        int somaReverso = 0;
        int temp = n;

        while(n != 0) {
            resto = n % 10;
            somaReverso=(somaReverso * 10) + resto;
            n = n / 10;
        }
        if(temp == somaReverso)
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static void multiploDeUmNumero(int n, int m) {
        // 8 - Escreva um programa que imprima todos os múltiplos de um número n
        //até um limite m.


        ArrayList<Integer> valores = new ArrayList<>();

        for (int i = n; i <= m; i += n) {
            valores.add(i);
        }

        System.out.println(valores);
    }

}

