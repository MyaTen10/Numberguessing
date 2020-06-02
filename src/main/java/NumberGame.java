import java.util.Random;

public class NumberGame {
   int guess;
   int input;
    public void playGame(User ComputerPlayer){
        String higher = "higher";
        String lower = "lower";
        String correct = "correct";

ComputerPlayer.computerscore++;
User.userscore++;

         if(guess ==input){
             System.out.println("You are correct. 1 point to you");
             userscore
         }
         else if
            (guess > input){
                System.out.println("Incorrect, too HIGH. 1 point to computer");
            }else if
                (guess < input){
             System.out.println("Inccorect, too LOWw. 1 point to computer");
                }
            }
        }


// while (!input.equals("correct")){
//         if (input.equals("lower")){
//         randomLast = random2;
//         random2 = generator.nextInt(100) + 1;
//         if ((random2 < random) && (random2 < randomLast)){
//        random = random2;
//        cntr += 1;
//        System.out.println("Is your number: " + random);
//        System.out.println("Input if number should be higher, lower, or correct: ");
//        input = reader.next();
//        } else {
//        input = lower;