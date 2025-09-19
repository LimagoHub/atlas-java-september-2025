package app;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = input.nextInt();

        System.out.print("Alter + " + alter);

    }
}
