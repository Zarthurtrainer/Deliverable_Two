import java.util.Scanner;
import java.util.Random;
public class CoinFlip
{
    public static void main(String[] args)
    {
    	int correctCount = 0;
        int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Guess which one will have more: Heads or Tails? ");
        String headsOrTailsGuess = scnr.nextLine();
         
        System.out.print("How many times will the coin be flipped? ");
        int numberOfFlips = scnr.nextInt();
         
        while(counter <= numberOfFlips)
        {
            randNum = Math.random();
                         
            if(randNum < .5)
            {
                heads++;
                System.out.println("heads");
            }
            else
            {
                tails++;
                System.out.println("tails");
               }
            counter++;   
        
        }
        if(headsOrTailsGuess.equalsIgnoreCase("heads"))
        {
        	correctCount = heads++;
        }
        if(headsOrTailsGuess.equalsIgnoreCase("tails"))
        {
        	correctCount = tails++;
        
        }
        System.out.println("Your guess " + headsOrTailsGuess + " was correct " + correctCount + " times.");
        int x = correctCount;
        int y = numberOfFlips;
        int z = (x * 100 / y);
        System.out.println("That's " + z + "%");
        System.out.println();
       
         
         
         
    }
}
