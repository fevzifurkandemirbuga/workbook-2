package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = scan.nextLine();

        String[] text = input.split("\\|");
        String[] score = text[1].split(":");
        int winnerIndex;

        if (Integer.parseInt(score[0]) > Integer.parseInt(score[1])) {
            winnerIndex = 0;
        } else {
            winnerIndex = 1;
        }

        String winner = text[0].split(":")[winnerIndex];
        System.out.println("Winner: " + winner);
    }
}
