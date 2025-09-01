public class Questao08 {

    public static void main(String[] args) {

        int[] numeros = new int[]{1, 2, 3, 4, 5};
        int[] numerosInversos = new int[5];
        int ind = 4;
        for (int i = 0; i < numeros.length; i++){
            numerosInversos[ind] = numeros[i];
            ind--;
        }

        for (int numero : numerosInversos){
            System.out.println(numero);
        }

    }
}
