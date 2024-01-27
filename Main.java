//quarter  /25 mod25
//dime     /10 mod10
//nickel   /5 mod5
//penny
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollars = sc.nextDouble();
        int cents = (int) (dollars*100);
        int quarter = (cents/25);
        int dime = cents%25/10;
        int nickel = cents%25%10/5;
        int penny = cents%5;

        if (cents == 0)
            System.out.println("No Coins");
        else
            if (quarter == 1)
                System.out.println(quarter +" quarter");
            else if (quarter > 1)
                System.out.println(quarter +" quarters");
            if (dime == 1)
                System.out.println(dime +" dime");
            else if (dime > 1)
                System.out.println(dime +" dimes");
            if (nickel == 1)
                System.out.println(nickel +" nickel");
            if (penny == 1)
                System.out.println(penny +" penny");
            else if (penny > 1)
                System.out.println(penny +" pennies");
        int weight = (int) Math.round(quarter*5.67 + dime*2.268 + nickel*5 + penny*2.5);
        if (weight < 1000)
            System.out.println("Total Weight: " +weight +" grams");
        else if (weight < 1000000)
            if (weight/1000 == 1)
                System.out.println("Total Weight: " +weight/1000 +" kilo gram");
        else
                System.out.println("Total Weight: " +weight/1000 +" kilo grams");
    }
}

