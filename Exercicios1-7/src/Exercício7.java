import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Pedimos ao user digitar a quantidade de numeros a ser digitados
        System.out.print("Digite a quantidade de números que você deseja: ");
        int tamanho = entrada.nextInt();

        //Declaramos um vetor do tipo  inteiro com tamanho informado pelo user
        int[] vetor = new int[tamanho];

        float media = 0.0f;
        int contadorM = 0;
        int soma = 0;

        for(int i = 0; i < tamanho; i++){
            //Recebe os valores inteiro informados pelo user
            System.out.print("Digite um valor inteiro e positivo: ");
            int numero = entrada.nextInt();

            //Verifico se o numero digitado é >= 0
            if (numero >= 0) {
                vetor[i] = numero;
                if(vetor[i]%3 == 0){
                    soma = soma + vetor[i];
                    contadorM = contadorM + 1;
                }
            }
        }
        media =((float) soma)/contadorM;
        System.out.println("O valor da média é: " + media);
    }
}
