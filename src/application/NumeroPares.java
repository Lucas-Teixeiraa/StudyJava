package application;

import java.util.Locale;
import java.util.Scanner;

public class NumeroPares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cont = 0;
        System.out.print("Quantos numeros voce vai digitar ? ");
        int N = sc.nextInt();
        sc.nextLine();
        int vet[] = new int[N];

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
            if (vet[i]%2==0){
                cont++;
            }
        }
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vet.length; i++){
            if (vet[i]%2==0){
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + cont);

    }
}
