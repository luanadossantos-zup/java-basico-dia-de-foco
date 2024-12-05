public class Main {
    public static void main(String[] args) {
        //Atividades da aula de foco do dia 05/12/24

        somaDeNumeros(5);

    }

    public static void somaDeNumeros(int n) {
        //1 - Escreva um programa que receba um número inteiro n e calcule a soma dos números de 1 a n usando um loop for.
        int soma = n;

        for (int i = 1; i < n; i++) {
            soma = soma +i;

        }
        System.out.println(soma);
    }
}