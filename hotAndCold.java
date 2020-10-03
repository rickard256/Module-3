import java.util.Random;
import java.util.Scanner;

class hotAndCold
{
    int colPos;
    int rowPos;
    int colGuess;
    int rowGuess;
    int randBound;
    Random rand = new Random();
    static public void main(String[] args)
    {
        hotAndCold grid;
        System.out.println("Welcome to  a game of Hot and Cold!");
        System.out.println("The objective of this game is to guess where I'm hiding in a 5x5 grid.");
        String command;
        Scanner input = new Scanner(System.in);
        grid = new hotAndCold();
        do
        {
            System.out.print("Input a command ('guess', newBoard' and 'exit'): ");
            command = input.nextLine();
            switch (command)
            {
                case "guess":
                System.out.println("Type a column number between 1 and 5");
                grid.colGuess = input.nextInt() - 1;
                System.out.println("Type a row number between 1 and 5");
                grid.rowGuess = input.nextInt() - 1;
                if (grid.colGuess == grid.colPos && grid.rowGuess == grid.rowPos)
                {
                    System.out.println("You found me! Good job!");
                }
                else if (grid.colGuess == grid.colPos)
                {
                    System.out.println("You're getting close! We're in the same column.");
                }
                else if (grid.rowGuess == grid.rowPos)
                {
                    System.out.println("You're getting close! We're in the same row.");
                }
                else
                {
                    System.out.println("Nope! You haven't found me yet!");
                }
                command = input.nextLine();
                break;

                case "newBoard":
                System.out.println("Are you sure you want to start over? (yes/no)");
                System.out.print("> ");
                command = input.nextLine();
                if (command == "yes");
                {
                    grid = new hotAndCold();
                    System.out.println("Game reset");
                }
                break;

                case "exit":
                System.out.println("Thank you for playing!");
                command = "exit";
                break;
            }
        }
        while (command != "exit");
    }

    public hotAndCold()
    {
        randBound = 5;
        colPos = rand.nextInt(randBound);
        rowPos = rand.nextInt(randBound);
    }
}