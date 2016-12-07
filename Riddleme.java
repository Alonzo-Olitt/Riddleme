//add import to get user input
import java.util.Scanner;

public class Riddleme{
  
  //this is main method
  //this is where the program starts
  //this should look super familiar
  public static void main(String[] args){
    
    //set up Scanner to get user input
    Scanner input = new Scanner(System.in);
    
    //start the game
    System.out.println("What to play a game?");
    
    //prompt the user for an input
    System.out.println("Enter Y or N");
    
    //get the answer from user and save into a variable
    String answer = input.next();
    
    //check if the user said yes
    //Note: the equalsIgnoreCase sees no difference between 'y' and 'Y'
    //Note: the equalsIgnoreCase checks if the input from user is equal to "Y"
    
    if(answer.equalsIgnoreCase("Y")){ 
      System.out.println("Fantastic! Here's a riddle, what is brown and sticky? One Word.");
    
      String answer2 = input.next();
      System.out.println("Your answer: " + answer2);

      if(answer2.equalsIgnoreCase("Stick")){
        System.out.println("Correct!!!");
      }
      else{

        System.out.println("You're a failure!");
      }
    
    }
    else{
      System.out.println("Awwww...");
    }

  
    
    //To-do: use conditionals (if-else) and input from user (like above) to continue on this riddle game   
    
  }
 
}
