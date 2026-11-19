package Notes.Excercises;

import java.util.Scanner;

public class recorrerUnArrayUsandoWhile {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] ages = new int[7];

        int i = 0;

        while (i< 7){
            System.out.println("ingrese la edad  " + (i+1));


            ages [i]= sc.nextInt();
            i++;

        }
        i= 0;
        System.out.println("la edades ingresadas son : " );
        while (i< 7){
            System.out.println("edad" + (i+1) +" : "+ ages [i]);
            i++;
        }
















    }
}
