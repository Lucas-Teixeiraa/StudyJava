package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros serao digitados ?");
        int N = sc.nextInt();
        int vet[] = new int[N];

        for(int i = 0; i< vet.length;i++){
            System.out.print("Digite um numero:");
            vet[i] = sc.nextInt();
        }
        System.out.println("NUMERO NEGATIVOS:");
        for (int i = 0; i < vet.length; i++){
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }
    }
}
