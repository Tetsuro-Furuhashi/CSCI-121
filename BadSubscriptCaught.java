import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] nameArray = {"Alex", "Ben", "Cathy", "Dennis", "Ellinor", "Fonda", "George", "Henry", "Ivan", "Jannis"};
        try {
            System.out.println("Enter an integer: ");
            Scanner sc = new Scanner(System.in);
            short number = sc.nextShort();
            boolean b = number < 11;
            System.out.println(nameArray[number]);
        }
        catch (Exception e) {
            System.out.println("Error");
        }

    }
}