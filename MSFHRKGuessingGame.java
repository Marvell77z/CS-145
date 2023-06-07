// Programmer: Marvell Suhali, Farrel Harten, Rachit Khunderwal
// Class: CS& 145
// Date:4/11/2023
// Assignment: Lab 1 Guessing game
// Purpose: To create guessing game with methods, if else statements, and while statements

import java.util.Scanner;
import java.util.Random;
   
public class MSFHRKGuessingGame 
{

   public static void main(String[] agrs) 
   {  
   
      Scanner input = new Scanner(System.in);
      
      //main method
      
      instruction(); //print out the instruction from the main method
     
      // Initalizing the variables
      int playGuess = playGame();
      int totalGuesses = playGuess;
      
      // Ask if user wants to play again
      System.out.print("Do you want to play again? (y/n) ");
      char answer = userAnswer();
      int totalGames = 1;
      int bestGame = totalGuesses;

   
      // Ask to play the game
       while(answer == 'y'); 
       {
       
          totalGames++;        
          int guess = playGame();
          totalGuesses = totalGuesses + guess;
          if(guess < totalGuesses); 
          {
       
           bestGame = guess;  
               
          } //end of if statement 
        
        
         System.out.println("Do you want to play again");
         answer = userAnswer();
         
        } // end of while statement
        
       // user input if they do not want to play
       if (answer == 'n')
      {
         printResult(totalGames,totalGuesses, bestGame);
      }
      else 
      {
         System.out.println("Invalid input, run the program again.");
      } //end of if else statement
      
   } // end of main method
   
     // method for the playAgain statement
      public static char userAnswer()
   {
      Scanner userDecision = new Scanner(System.in);
      String decision = userDecision.next();
      char answer = decision.charAt(0);
      return answer; 

   }
   
      //playGame method
      
      public static int playGame()
      {
         // Random guess ranging from 1-100
         Random rand = new Random();
         final int maxLimit = 101;
         int target = rand.nextInt(maxLimit) + 1;
         System.out.println();
         System.out.println("I'm thinking of a number between 1 and " + (maxLimit-1));
         System.out.print("What is your guess? ");
         
         
         // User to guess the number
         Scanner sc = new Scanner(System.in);
         int currentGuess = sc.nextInt();
         int totalGuesses = 1; 
         
         while (currentGuess != target) 
         {
           
           // To find out if it is higher, lower, or an invalid input
           
           totalGuesses++;
           
         if (currentGuess < 1 || currentGuess > (maxLimit-1)) 
         {
            System.out.println("Invalid input.");
         }
            
               if (currentGuess < target) {
                  System.out.println("Higher"); 
                  }
                  
               else if (currentGuess > target) {
                  System.out.println("Lower"); 
                  
                  } // end of if else
                  
                  System.out.print("What is your guess? ");
                  currentGuess = sc.nextInt();
                  
             } //End of while loop
             
        // if the user match the number given by the computer then it will print out the total guesses
         if (currentGuess == target)
         {
            if (totalGuesses == 1)
            {
            System.out.println("You got it right in " + totalGuesses + " guess");
            }
            else
            {
            System.out.println("You got it right in " + totalGuesses + " guesses.");
            }
         }
      return totalGuesses;
   }   
              
       
              
      // Method for printintg out Results
      
      public static void printResult(int games, double playGuesses, int bestGame) 
      {
      
      double guessAverage = playGuesses/games;
      
      System.out.println("Stats: ");
      System.out.println("Total Games =  "+games);
      System.out.println("Total Guesses =  "+playGuesses);
      System.out.println("Guess Average =  "+guessAverage);
      System.out.println("Best Game =  "+bestGame);
      
      }
      
      //Instruction method
      
      public static void instruction() {
      
      final int maxLimit = 101;
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and");
      System.out.println("100 and will allow you to guess until");
      System.out.println("you get it. For each guess, I will tell you");
      System.out.println("whether the right answer is higher or lower");
      System.out.println("than your guess.");

      }
      
   }
      
      
