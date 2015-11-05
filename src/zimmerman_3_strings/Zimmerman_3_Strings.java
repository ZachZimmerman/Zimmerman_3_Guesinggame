package zimmerman_3_strings;
import java.util.Random;
import java.util.Scanner;

public class Zimmerman_3_Strings { //Start of program
static Scanner sc = new Scanner(System.in);
static int magicnumber;
static int userguess;
static String username;
static Random randy = new Random();
static boolean playagain;
static int counter = 5;
public static void main(String[] args) { //Start of main class
    playagain = true;
    magicnumber = randy.nextInt(10);
    System.out.println("Hello, would you like to play???");
    System.out.println("Whats your name?");
    username = sc.nextLine();
    System.out.println("Hello " + username + " Let's play a game dude bro!!!");
     
    //runs while the condition is true    
    while (playagain){
        playthegame();
        counter --;
        if(counter < 1) {
            System.out.println("You lose, Uninstall m8");
            playagain = false;
        }
    }
    } // End of main class
    static void playthegame(){
    if (counter > 5);{
   System.out.println("trys left " +  ( counter )); 
   }
    Scanner userinputnumbers = new Scanner(System.in);
    System.out.println("Please pick a number 1-10");
    userguess = sc.nextInt();
    if (magicnumber == userguess){
        System.out.println("YOU WIN!!!");
        playagain = false;
    } else {
        if(magicnumber > userguess) {
            System.out.println("Too low! Try again!");
            playagain = true;
        } else {
        System.out.println("Too high! Try again!");
        playagain = true;
    }

   
    } 
     
    }
} //End of program
