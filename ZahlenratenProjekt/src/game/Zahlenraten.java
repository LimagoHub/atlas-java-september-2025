package game;

import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int zufallszahl = 623;
        int versuch;

        do {
            System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 1000 ein.");
            versuch = input.nextInt();

            if(versuch < zufallszahl) {
                System.out.println("Ihre zahl ist zu klein");
            }

            if(versuch > zufallszahl) {
                System.out.println("Ihre zahl ist zu klein");
            }

        } while(versuch != zufallszahl);
        System.out.println("Sie haben die Zahl geraten");
    }
}
