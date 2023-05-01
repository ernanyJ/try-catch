package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {
    public void soma() {
        Scanner sc = new Scanner(System.in);
        boolean continua = false;

        do {
            try {
                System.out.println("n1, n2:");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                System.out.println(n1 + n2);
                continua = false;
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("input error");
                sc.nextLine();
                continua = true;
            }
        }while(continua == true);

        System.out.println("program end");
    }
}

