public class Questao05 {

    public static void main(String[] args) {

        int[] numeros = new int[]{2, 5, 8, 15, 18};
        int cont = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                cont++;
            }
        }

        System.out.printf("Tem %d numeros pares", cont);
    }
}
