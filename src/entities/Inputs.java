package entities;

import java.util.Scanner;

public class Inputs {
    public void soma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n1: ");
        int n1 = sc.nextInt();
        System.out.println("n2: ");
        int n2 = sc.nextInt();
        System.out.println("res: " + (n1+n2));


    }

}

