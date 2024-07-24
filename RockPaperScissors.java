import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            System.out.println("Enter your move (rock, paper, scissors). To exit the game, type \"exit\":");
            String userMove = scanner.nextLine().toLowerCase();

            if (userMove.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int computerMoveIndex = random.nextInt(3);
            String computerMove = choices[computerMoveIndex];

            System.out.println("Computer move: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equals("rock") && computerMove.equals("scissors") ||
                       userMove.equals("paper") && computerMove.equals("rock") ||
                       userMove.equals("scissors") && computerMove.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
    }
}