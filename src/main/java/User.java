import java.util.Scanner;

public class User {
    private String name;
    private int guess;
    int userscore =0;
    Scanner user_input = new Scanner(System.in);
    public User(String name, int guess){
        this.name=name;
        this.guess=guess;
    }


    public void setName(String message){
        System.out.println(message);
        this.name = user_input.next();
    }

    public void setGuess(String message){
        System.out.println(message);
        this.guess = user_input.nextInt();
    }

    public String getName (){
        return name;
    }

    public int getGuess(){
        return guess;
    }



}
