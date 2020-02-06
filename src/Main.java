
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Raven r = new Raven();
        Invoice invoice = new Invoice();
        Scanner sc = new Scanner(System.in);
        String again = "y";
        int questionsC = 0;

        System.out.println("Good morning, how are you feeling today?");

        while(!again.equalsIgnoreCase("n")) {
            String input = sc.nextLine();

            System.out.println(r.answer(input));
            System.out.println("Continue? y/n ");
            again = sc.nextLine();
            questionsC++;
        }

        //String name, String address, String contactInformation,int session, int questions
        System.out.println(invoice.invoice("Dave Wolf", "12 S. Summit Ave\n Gaithersburg, MD 20877"));
        System.out.println(invoice.items(1,questionsC));
    }
}
