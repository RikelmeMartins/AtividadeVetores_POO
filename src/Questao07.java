import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float[] mediaA = new float[5];
        float soma = 0;
        for (int i = 0; i < mediaA.length; i++){
            System.out.printf("Nota %d: ", i+1);
            float notas = leitor.nextFloat();

            mediaA[i] = notas;
            soma = soma + mediaA[i];
        }
        float media = soma/5;

        if (media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
