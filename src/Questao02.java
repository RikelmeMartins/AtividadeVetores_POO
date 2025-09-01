import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[]{5, 15, 25, 35, 45};

        System.out.print("Informe um indice: ");
        int ind = leitor.nextInt();

        System.out.println(numeros[ind]);
    }
}
