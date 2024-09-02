package application;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantos pessoas serao digitadas ? ");
        int N = sc.nextInt();
        sc.nextLine();
        double sumHeight = 0.0, media = 0.0, percentual = 0.0, contAge = 0.0;
        String names[] = new String[N];
        int age[] = new int[N];
        double height[] = new double[N];


        for(int i = 0; i < N; i++){
            System.out.print("Nome: ");
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("\n");
            if(age[i] < 16){
                contAge++;
            }
            sumHeight += height[i];
        }
        media = sumHeight/N;
        percentual = (contAge/N) * 100;

        System.out.printf("Altura media: %.2f\n", media);
        System.out.printf("Porcentagem das pessoas com menos de 16 anos: %.2f\n", percentual);
        System.out.println("Pessoas com menos de 16 anos: ");

        for(int i = 0; i < N; i++){
            if(age[i] < 16){
                System.out.println(names[i]);
            }
        }


        sc.close();
    }


}
