
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Raven r = new Raven();
        Scanner sc = new Scanner(System.in);
        String again = "y";

        System.out.println("Good morning, how are you feeling today?");

        while(!again.equalsIgnoreCase("n")) {
            String input = sc.nextLine();

            System.out.println(r.answer(input));
            System.out.println("Continue? y/n ");
            again = sc.nextLine();

        }
    }
}
