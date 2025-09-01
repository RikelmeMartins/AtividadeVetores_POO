public class Questao03 {

    public static void main(String[] args) {

        int[] numeros = new int[]{3, 7, 1, 9, 12};
        int soma = 0;

        for (int numero : numeros){
            soma = soma + numero;
        }

        System.out.println(soma);
    }
}
