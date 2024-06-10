import java.util.Scanner;

public class numgame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int chances = 7;
        int finals = 0;
        boolean playagain = true;
        System.out.println("Welcome Buddy");
        System.out.println("Hey Buddy you have about" + chances + "to win the game ! ");

        while (playagain) {
            int random = getrandom(1, 100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) {
                System.out.print("chances" + (i + 1) + "  Enter your guess : ");
                int user = sc.nextInt();
                if (user == random) {
                    guess = true;
                    finals += 1;
                    System.out.println("yehh! you did it.");
                    break;
                } else if (user > random) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            }

            if (guess == false) {
                System.out.println("sorry you lost the chances. the number is " + random);
            }

            System.out.println("Do you want to play again(y/n)");
            String pA = sc.next();
            playagain = pA.equalsIgnoreCase("y");
        }

        System.out.println("that's it hope you enjoyed it");
        System.out.println("Here is your score" + finals);
    }

    public static int getrandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }
}