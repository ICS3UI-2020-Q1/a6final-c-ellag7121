import java.util.Scanner;
/**
 * get 5 numbers from the user that represent "cards", calculate the Hi-Lo count of those cards and tell it to the player
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make the scanner to get user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int count = 0; //the current card count (+1 if low, -1 if high)

    //create the array
    int[] cards = new int[5]; //this will hold the card values

    //ask user for cards
    System.out.println("Please enter the value of 5 cards:");
    //make a loop to store cards in the array
    for(int i = 0; i < cards.length; i++){
      //put the user input in the array
      cards[i] = input.nextInt();

      //add or subtract from the count depending on the card
      if(cards[i] >= 10 || cards[i] == 1){ //if it is a "high" card
        //subtract 1 from the count
        count--;
      }else if(cards[i] <= 6){ //if it is a "low" card
        //add 1 to the count
        count++;
      } //if it is not high or low, do nothing
    }

    //tell the user the card count
    System.out.println("The count would be " + count);  
  }
}
