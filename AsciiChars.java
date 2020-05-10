import java.util.*;

public class AsciiChars {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name");
        String name = input.next();
        System.out.println("Hello " + name);
        AsciiChars.game();

    }

    public static void game() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to continue survey? Please select y/n");
        String answer = input.next();
        if (answer.equals("y") || answer.equals("yes")) {
            System.out.println("Do you have car? Please type yes or no");
            String carAns = input.next();
            System.out.println("What's your favorite pet's name?");
            String pet = input.next();
            System.out.println("How old is your favorite pet?");
            int age = input.nextInt();
            System.out.println("What's your lucky number?");
            int number = input.nextInt();
            System.out.println("Do you have a favorite quarterback? ");
            String ansQB = input.next();
            int QB = 0;
            if (ansQB.equals("yes") || ansQB.equals("y")) {
                System.out.println("What is their jersey number?");
                QB = input.nextInt();
            }
            System.out.println("What is two-digit model year of their car?");
            int carYear = input.nextInt();
            System.out.println("What is the first name of the their favorite actor or actress?");
            String celebName = input.nextLine();
            celebName = input.nextLine();
            System.out.println("Enter random number between 1-50");
            int randNum = input.nextInt();
            int randNumber1 = (int) (Math.random() * 75);
            int randNumber2 = (int) Math.random() * 65;
            int magicBall = 0;
            if (QB != 0) {
                magicBall = QB;
            } else {
                magicBall = number + randNumber1;// I didn't do multiplication this step because even though, i do
                                                 // substraction it gave me more than 75.
                if (magicBall > 75) {
                    magicBall -= 75;
                }
            }

            int number1 = pet.charAt(2);
            ;
            if (number1 > 65) {
                number1 -= 65;
            }
            int number2 = number + carYear;
            if (number2 > 65) {
                number2 -= 65;
            }
            int number3 = randNum - randNumber2;
            if (number3 > 65) {
                number3 -= 65;
            } else if (number3 < 0) {
                number3 += 65;
            }
            int number4 = celebName.charAt(0);
            if (number4 > 65) {
                number4 -= 65;
            }
            int number5 = QB + age + number;
            if (number5 > 65) {
                number5 -= 65;
            }
            System.out.print("Lottery Numbers : " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", "
                    + number5 + " Magic Ball: " + magicBall + "\n");
            System.out.println("Would you like to play again? Please, type y/n");
            String ans = input.next();
            if (ans.equals("yes") || ans.equals("y")) {
                game();
            } else {
                System.out.println("Have a nice day!");
            }
        } else {
            System.out.println("Please return later to complete the survey.");
        }
    }

    private static Object main() {
        return null;
    }

    public static void printNumbers() {

        for (int i = 0; i <= 255; i++) {
            if (i >= 48 && i <= 57) {
                System.out.println(" The ASCII value of " + i + "  =  " + (char) i);
            }
        }
    }

    public static void printLowerCase() {

        for (int i = 0; i <= 255; i++) {
            if (i >= 97 && i <= 122) {
                System.out.println(" The ASCII value of " + i + "  =  " + (char) i);
            }
        }
    }

    public static void printUpperCase() {

        for (int i = 0; i <= 255; i++) {
            if (i >= 65 && i <= 90) {
                System.out.println(" The ASCII value of " + i + "  =  " + (char) i);
            }
        }
    }
}