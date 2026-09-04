import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) return "Draw";
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        int wins = 0, losses = 0, draws = 0;

        for (int round = 1; round <= 5; round++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String player = sc.nextLine();
            player = player.substring(0, 1).toUpperCase() + player.substring(1).toLowerCase();
            String computer = moves[random.nextInt(3)];
            String result = playRound(player, computer);
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            System.out.println("Round " + round + " | Player: " + player + " | Computer: " + computer + " | " + result);
        }
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, wins * 100.0 / 5);
    }
}
