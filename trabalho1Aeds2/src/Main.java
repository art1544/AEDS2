import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ex;
        do{
        System.out.println("Digite qual exercicio voce quer executar: ");
        ex = teclado.nextInt();
            switch (ex) {
                case 1:
                    System.out.println("Escreva um limite: ");
                    int limite = teclado.nextInt();
                    double soma = SomarNumerosParesComBaseEmUmLimite(limite);
                    System.out.println(soma);
                    break;
                case 2:
                    System.out.println();
                    break;
            }
        }
        while(ex != 0);
    }

    private static double SomarNumerosParesComBaseEmUmLimite(int limite)
    {
        if(limite <= 0)
            return 0;

        if(limite % 2 == 0){
            return limite + SomarNumerosParesComBaseEmUmLimite(limite - 2);
        }
        else{
            return SomarNumerosParesComBaseEmUmLimite(limite - 1);
        }
    }

    private static double SomarVetor(double[] vetor, int indiceDoVetor){

        if(indiceDoVetor < 0) {
            return 0;
        }
        else{
            return vetor[indiceDoVetor] + SomarVetor(vetor, indiceDoVetor - 1);
        }
    }
}