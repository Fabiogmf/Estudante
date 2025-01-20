import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = in.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = Integer.parseInt(in.nextLine());

        System.out.println("Qual a sua nota no exame final?");
        double notaExame = Double.parseDouble(in.nextLine());

        System.out.println("Seja Bem Vind@ " + nome);
        System.out.println("Idade: " + idade);

        if (notaExame < 0 || notaExame > 10) {
            System.out.println("VALOR INCORRETO! A nota deve estar entre 0 e 10.");
        }

        else if (notaExame >=7) {
            System.out.println("Sua nota é: " + notaExame +" e Você está APROVADO");
        }

        else {
            System.out.println("Sua nota é: " + notaExame + " e Você está REPROVADO");
        }


    }
}