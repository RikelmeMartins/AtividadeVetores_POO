import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[]{2, 2, 2, 2, 2};

        System.out.print("Informe um numero: ");
        int numeroMult = leitor.nextInt();

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = numeros[i] * numeroMult;
        }

        for (int numero : numeros){
            System.out.println(numero);
        }
    }
}
