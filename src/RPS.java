import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Player1 = "";
        String Player2 = "";
        boolean donePlay1 = false;
        boolean donePlay2 = false;

        do {
            System.out.print("Player 1 enter your move [RPS]: ");
            Player1 = in.nextLine();
            if (Player1.equals("R") || Player1.equals("P") || Player1.equals("S"))
            {
                donePlay1 = true;
            }
            else
            {
                System.out.println("Invalid input! You must enter RPS not " + Player1);
            }
        } while (!donePlay1);

        do {
            System.out.print("Player 2 enter your move [RPS]: ");
            Player2 = in.nextLine();
            if (Player2.equals("R") || Player2.equals("P") || Player2.equals("S"))
            {
                donePlay2 = true;
            }
            else
            {
                System.out.println("Invalid input! You must enter RPS not " + Player2);
            }
        } while (!donePlay2);

        if (Player1.equals("R") && Player2.equals("R"))
        {
            System.out.println("Rock vs Rock it's a tie!");
        }
        else if (Player1.equals("R") && Player2.equals("S"))
        {
            System.out.println("Rock breaks Scissors! Player 1 wins!");
        }
        else if (Player1.equals("S") && Player2.equals("P"))
        {
            System.out.println("Scissors cuts Paper! Player 1 wins!");
        }
        else if (Player1.equals("S") && Player2.equals("S"))
        {
            System.out.println("Scissors vs Scissors it's a tie!");
        }
        else if (Player1.equals("P") && Player2.equals("R"))
        {
            System.out.println("Paper covers Rock! Player 1 wins!");
        }
        else if (Player1.equals("P") && Player2.equals("P"))
        {
            System.out.println("Paper vs Paper it's a tie!");
        }
        else
        {
            if (Player2.equals("R") && Player1.equals("S"))
            {
                System.out.println("Rock breaks Scissors! Player 2 wins!");
            }
            else if (Player2.equals("S") && Player1.equals("P"))
            {
                System.out.println("Scissors cuts Paper! Player 2 wins!");
            }
            else if (Player2.equals("P") && Player1.equals("R"))
            {
                System.out.println("Paper covers Rock! Player 2 wins!");
            }
        }

    }
}
