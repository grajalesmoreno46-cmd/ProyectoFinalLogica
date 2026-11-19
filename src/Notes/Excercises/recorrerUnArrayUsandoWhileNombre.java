package Notes.Excercises;

import java.util.Scanner;

public class recorrerUnArrayUsandoWhileNombre {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[4];

        int i = 0;

        while (i< 4) {
            System.out.println("ingrese su nombre  " + (i + 1) + ":");
            name[i] = sc.nextLine();
            i++;
        }

        int j = 0;

        System.out.println((j+1)+ ":"+ name[j]);

        j++;













    }
}
