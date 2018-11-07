import java.util.Scanner;
import java.util.Random;


public class OddsEvens {
    public static void main(String[] args) {
        System.out.println("Let’s play a game called “Odds and Evens”");
        Scanner input = new Scanner(System.in);
        System.out.print("Whats your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + " which do you choose (O)dds or (E)vens? ");
        String choice = input.next().toLowerCase();
        if (choice.equals("o") || choice.equals("odds")) {
            System.out.println(name + " has picked odds! Computer will be evens!");
        }else if (choice.equals("e") || choice.equals("evens")) {
            System.out.println(name + " has picked evens! Computer will be odds!");

        }else{
            System.out.println(name + " You have to pick ODDS or EVENS!!!");
            }

        System.out.println("-----------------------------------------------");
        System.out.print("How many finger you would play? (5 max) ");
        int fingers = 0;
        while((fingers>5) || (fingers<1)){
            System.out.println("Enter number 1 to 5! ");
            fingers = input.nextInt();
        }
        System.out.println("You pick: " + fingers + " fingers");
        Random rand = new Random();
        int computer = rand.nextInt(5) + 1;
        System.out.println("Computer choose: " + computer + " fingers");
        System.out.println("-----------------------------------------------");
        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven){
            System.out.println(sum + " is even!");
        } else{
            System.out.println(sum + " is odd");
        }
        System.out.println("-----------------------------------------------");
        if(sum % 2 == 0){
            if (choice.equals("e") || choice.equals("evens")){
                System.out.println(name + " win!");
            } else {
                System.out.println("Computer win!");
            }
        }else{
            if (choice.equals("o") || choice.equals("odds")){
                System.out.println(name + " wins!");
            }else{
                System.out.println("Computer wins!");
            }
        }


    }

}
