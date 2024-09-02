package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar?");
        int N = sc.nextInt();
        sc.nextLine();
        double vet[] = new double[N];
        double max = 0 ;
        int savePosition = 0;

        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            if(vet[i] > max){
                max = vet[i];
                savePosition = i;
            }
        }

        System.out.printf("Maior Valor: %.2f\n",max);
        System.out.println("Posicao do maior valor: " + savePosition);
    }
}
