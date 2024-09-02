package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros serao digitados ?");
        int N = sc.nextInt();
        double vet[] = new double[N];
        double soma = 0.0;
        double media = 0.0;

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero:");
            vet[i] = sc.nextDouble();
            soma+= vet[i];
        }
        System.out.print("Valores = ");
        for (int i = 0; i< vet.length;i++){
            System.out.printf(" %.2f ", vet[i]);
            System.out.print(" ");
        }
        System.out.println();
        media = soma/ vet.length;
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n",media);


    }
}
