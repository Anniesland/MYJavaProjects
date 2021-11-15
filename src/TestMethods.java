import java.util.Scanner;
/** Created by Abigail Elder-Mullan on 28/10/2021
 * Program to test various methods without parameters
 */
public class TestMethods
{
 static Scanner keyboard = new Scanner(System.in);

 // Method to read in and return an integer
 public static int readInteger() {
  System.out.println("Enter a number: ");
  return keyboard.nextInt();
 }//readInteger

 // Method to read in and return a name
 public static String whoAmI() {
  System.out.println("What is your name? ");
  return keyboard.nextLine();
 }//whoAmI

 // Method to read in a number then test if a number has been guessed

 public static boolean goodGuess() {
  final int CORRECTNUMBER = 7;
  int guess;

  guess = readInteger();
  return (guess == CORRECTNUMBER);
 }//goodGuess

 // Method to read in 2 integers and return their sum
 static int sumOfNumbers()
 {
  int number1, number2, numberSum;
  System.out.println("Please enter a number");
  number1= keyboard.nextInt();
  System.out.println("Enter another number");
  number2= keyboard.nextInt();

  numberSum = (number1 + number2);
  return numberSum;
 }


 // Method to read in 2 integers and return their product

 static int productOfNumbers()
 {
  int number1, number2, numberProduct;
  System.out.println("Please enter a number");
  number1= keyboard.nextInt();
  System.out.println("Enter another number");
  number2= keyboard.nextInt();

  numberProduct = (number1 * number2);
  return numberProduct;
 }

 // Method to read in 2 integers and return the larger

 static int max() {
  int number1, number2, maxNumber;
  System.out.println("Please enter a number");
  number1= keyboard.nextInt();
  System.out.println("Enter another number");
  number2= keyboard.nextInt();

  // prints the maximum of two numbers
  maxNumber = (Math.max(number1, number2));
  return maxNumber;
 }

 public static void main(String[] args) {
  String name;
  boolean correct;
  int sum, product, largerNumber;

  System.out.println("Testing whoAmI()");
  System.out.println("****************");
  name = whoAmI();
  System.out.println("Your name is " + name + "\n");

  System.out.println("Testing goodGuess()");
  System.out.println("*******************");
  correct = goodGuess();
  if (correct) {
   System.out.println("You have guessed correctly\n");
  }//if
  else {
   System.out.println("You have guessed incorrectly\n");
  }//else

  System.out.println("Testing sumOfNumbers()");
  System.out.println("**********************");
  sum = sumOfNumbers();
  System.out.println("The sum of the two numbers is " + sum + "\n");
  System.out.println("Testing productOfNumbers()");
  System.out.println("**************************");
  product = productOfNumbers();
  System.out.println("The product of the two numbers is " + product + "\n");

  System.out.println("Testing max()");
  System.out.println("*************");
  largerNumber = max();
  System.out.println("The larger of the two numbers is " +
        largerNumber);
 }//main
}//class
