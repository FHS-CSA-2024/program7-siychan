//import stuff here
import java.lang.Math;
import java.util.Scanner;
//Your code here
public class Program7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter schrute-bucks: ");
        int schruteBucks = input.nextInt();
        System.out.print("Enter klevins: ");
        int klevins = input.nextInt();
        System.out.print("Enter stanley-nickles: ");
        double stanleyNickels = input.nextInt();
        System.out.println();
        final double KTOSN = 12.0;
        final double SNTOSND = 100.0/240.0;
        stanleyNickels = stanleyNickels + klevins * KTOSN;
        double stanleyNickelDecimal = stanleyNickels * SNTOSND;
        int sndRound = (int) Math.round(stanleyNickelDecimal);
        if (sndRound > 100);
        {
            schruteBucks += ((sndRound - (sndRound % 100)) / 100);
            sndRound = sndRound % 100;
        }
        System.out.println("Decimal schrute-bucks = $" + schruteBucks + "." + sndRound);
    }
}
//Paste console output below:
/*
Enter schrute-bucks: 7
Enter klevins: 17
Enter stanley-nickles: 9

Decimal schrute-bucks = $7.89

*/
