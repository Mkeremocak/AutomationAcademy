package week2;

import java.util.Random;

public class DiceGame {
    public int randomDice()
    {
        Random random = new Random();
        return random.nextInt(6)+1;
    }

    public static void main (String[] args)
    {
        DiceGame diceGame = new DiceGame();
        int prize = 0;

        while (prize < 50)
        {
            System.out.println("Price : " + prize );
            int diceRoll = diceGame.randomDice();
            System.out.println("Dice : "+ diceRoll );

            if(diceRoll == 4 || diceRoll ==5 || diceRoll ==6)
            {
                prize = prize + diceRoll;
            }
            else if (diceRoll == 3)
            {
                System.out.println("Try Again");
            }
            else
            {
                System.out.println("Game Over");
                break;
            }
            System.out.println("You have won : " + prize );
        }

    }
}
