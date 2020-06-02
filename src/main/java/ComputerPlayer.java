import java.util.Random;

public class ComputerPlayer {
   private int input ;
    int computerscore = 0;
   public ComputerPlayer(int input){
       this.input=input;
   }

   public void setInput(){
       Random rand = new Random();
       int upperbound = 25;
       int random = rand.nextInt(upperbound);

       this.input = random;
   }


}
