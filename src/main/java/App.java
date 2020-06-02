import java.util.Random;

public class App {


    public static void main(String args[]) {

        User user = new User("name", 0);
        ComputerPlayer computerPlayer = new ComputerPlayer(0);
        NumberGame numberGame = new NumberGame();
        user.setName("What's your name?");

        user.setGuess("Whats your guess?");
        numberGame.playGame();

    }
}
