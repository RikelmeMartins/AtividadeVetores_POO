import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[]{4, 8, 15, 16, 23, 42};

        System.out.print("Informe um numero: ");
        int n = leitor.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == n){
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Numero encontrado!");
        } else {
            System.out.println("Não encontrado!");
        }
    }
}
