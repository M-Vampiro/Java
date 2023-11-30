import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {

        int target = new Random().nextInt(3) + 1;
        System.out.println("random number = " + target); // 0 , 1 , 2
        int target2 = (new Random().nextInt(100) + 1); // 1 , 2 , 3

        Scanner scanner = new Scanner(System.in);
        // while loop
        // if user input the same as target -> exit
        // otherwise, keep asking
        // Game
        // 1 - 100 (Random target)
        // If the input number is out of range being asked, keep asking
        int input = 0;
        int max = 100;
        int min = 1;
        int chance = 10;

        System.out.println("Guess the correct number between 1 - 100!!!");
        System.out.println("You have 10 chances !!!");
        System.out.print("Your Guess =  ");
        input = scanner.nextInt();
        while (input >= max || input <= min) {
        System.out.println("Input a number within " + min + " - " + max + " !!!");
        System.out.print("Your Guess =  ");
        input = scanner.nextInt();
        }
        chance--;
        while (input != target2 && chance > 0) {
            if (chance == 0) {
            System.out.println("You have no more chance !!!");
            break;
            } else if (chance == 1) {
            System.out.println("You still have " + chance + " chance !!!");
            } else {
            System.out.println("You still have " + chance + " chances !!!");
            }
            if (input < target2 && input > min) {
                min = input;
                chance--;
                System.out.print("Range: " + min + " - " + max + " : ");
            } else if (input > target2 && input < max) {
                max = input;
                chance--;
                System.out.print("Range: " + min + " - " + max + " : ");
            } else if (input <= min || input >= max) {
                System.out.print("Input a number within " + min + " - " + max + " !!! Number : ");
            }
            input = scanner.nextInt();
        }
        if (chance == 0) {
             System.out.println("You lose !!!");
             System.out.println("You lose !!!");
             System.out.println("You lose !!!");

        } else {
             System.out.println("You win !!!");
             System.out.println("You win !!!");
             System.out.println("You win !!!");
        }

}}
