import java.util.Scanner;

/**
 * Created by Abigail Elder-Mullan on 28/10/2021
 * A Program to classify scores
 */
public class SportScores {

 public static void main(String[] args) {

  final String BRONZE = "10%", SILVER = "30%", GOLD = "50%", VENUE ="UNIVERSAL GYM";
  final int GOLDNUMBER = 60, SILVERNUMBER = 20, BRONZENUMBER =10;
  Scanner keyboard = new Scanner(System.in);
  String initials;
  int pinNumber, swimNumbers, gymNumbers, totalSessions;

  char answer;

  System.out.println(VENUE);

  do
  {

   System.out.println("Please enter initials");
   initials = keyboard.nextLine();


   System.out.println(initials + " please enter your PIN");
   pinNumber = keyboard.nextInt();

   System.out.println(initials + " please enter number of swims");
   swimNumbers = keyboard.nextInt();

   System.out.println(initials + " please enter number of gym sessions");
   gymNumbers = keyboard.nextInt();

   totalSessions = swimNumbers + gymNumbers;



   System.out.println("CLIENT ID\t\t SWIMS\t\tGYM\t\tOverall Activities");
   System.out.println(initials + " " + pinNumber + "\t\t" + swimNumbers + "\t\t" + gymNumbers + "\t\t" + totalSessions);


   if (totalSessions >= GOLDNUMBER)
   {   System.out.println("Congratulations, you have been awarded Gold discount of  " + GOLD);
   }//if
   else if ((gymNumbers >= SILVERNUMBER) && (swimNumbers >= SILVERNUMBER))
   {   System.out.println("Congratulations, you have been awarded Silver discount of  " + SILVER);
   }//if
   else if ((gymNumbers >= BRONZENUMBER) && (swimNumbers >=BRONZENUMBER))
   {   System.out.println("Congratulations, you have been awarded Bronze discount of  " + BRONZE);
   }//if

   System.out.println("Do you want to enter another member? – Y for yes or N for no");
   answer = keyboard.nextLine().charAt(0);

  }while(answer == 'Y');

 }//main
}//class