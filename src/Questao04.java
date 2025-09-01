import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[6];


        System.out.print("Informe um numero: ");
        int nFor = leitor.nextInt();
        numeros[0] = nFor;
        int maior = nFor;
        int menor = nFor;

        for (int i = 1; i < numeros.length; i++){
            System.out.print("Informe um numero: ");
            nFor = leitor.nextInt();
            numeros[i] = nFor;
            if (numeros[i] > maior){
                maior = numeros[i];
            }

            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println(maior);
        System.out.println(menor);

    }
}
