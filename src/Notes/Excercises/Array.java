package Notes.Excercises;

import java.util.Scanner;

public class Array {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[]names={"maria" , "luis", "juan"};

        int ages[]= new int [4];

        //Vamos a mandar valores al array

        ages [0]= 23;

        ages [1]= 26;

        ages [2]= 34;

        ages [3]= 28;

        // si quiero imprimir, puedo llamar la variable con la posición

        System.out.println("posición 1: " + ages [0]);

        System.out.println("posición 2: " + ages [1]);

        System.out.println("posición 3: " + ages [2]);

        System.out.println("posición 4: " + ages [3]);

        // podemos usar Scanner para capturar los datos de la consola

        double [] salaries = new double[3];


        salaries[0]= scanner.nextDouble();
        System.out.println("ingrese salario");

        salaries[1]= scanner.nextDouble();
        System.out.println("ingrese salario");

        salaries[2]= scanner.nextDouble();
        System.out.println("ingrese salario");

        System.out.println(salaries [0] + "\n" +
                salaries [1] + "\n" +
                salaries [2]);



    }
}
