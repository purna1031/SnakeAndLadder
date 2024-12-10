package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Entities entities = Entities.getInstance();

        // Reading number of snakes
        System.out.println("Enter the number of snakes:");
        int noOfSnakes = scan.nextInt();
        System.out.println("Enter the snake positions (start and end):");
        while (noOfSnakes > 0) {
            int startPosition = scan.nextInt();
            int endPosition = scan.nextInt();
            entities.setSnake(startPosition, endPosition);
            noOfSnakes--;
        }

        // Reading number of ladders
        System.out.println("Enter the number of ladders:");
        int noOfLadders = scan.nextInt();
        System.out.println("Enter the ladder positions (start and end):");
        while (noOfLadders > 0) {
            int startPosition = scan.nextInt();
            int endPosition = scan.nextInt();
            entities.setLadder(startPosition, endPosition);
            noOfLadders--;
        }

        // Reading number of players
        System.out.println("Enter the number of players:");
        int noOfPlayers = scan.nextInt();
        scan.nextLine(); // Consume the remaining newline after the integer input
        System.out.println("Enter the player names:");
        int i = 0;
        while (noOfPlayers > 0) {
            String playerName = scan.nextLine();
            entities.setPlayer(i++, playerName);
            noOfPlayers--;
        }

        // Play the game
        PlaySnakeAndLadder playSnakeAndLadder = new PlaySnakeAndLadder(6);
        System.out.println(playSnakeAndLadder.PlayGame() + " wins the game");

        scan.close();
    }
}
