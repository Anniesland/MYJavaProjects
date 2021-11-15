/**
       * Created by Abigail Elder-Mullan on 25/10/2021
       * A program for testing strings
       */
public class StringTesting {

   public static void main(String[] args)
         {
            String myString = "abcDEFMNopqrstYZ";
            String message = "HELLO you!";
            char letter1, letter2, letter3;
            int result;
            String yourString, newString;
            boolean same;

            result   = myString.length();
            System.out.println("result: " + result);

            letter2  = myString.charAt(2);
            System.out.println("letter2: " + letter2);

            myString = myString.toUpperCase();
            System.out.println("myString: " + myString);

            letter1  = myString.charAt(2);
            System.out.println("letter1: " + letter1);

            letter2  = myString.charAt(13);
            System.out.println("letter2: " + letter2);

            yourString = myString.substring(2, 9);
            System.out.println("yourString: " + yourString);

            letter3  = myString.charAt(0);
            System.out.println("letter3: " + letter3);

            myString   = yourString.substring(5);
            System.out.println("myString: " + myString);

            myString = "abcDEFMNopqrstYZ$%&";
            message = "HELLO you!";


            int size = message.length();
            System.out.println("size: " + size);

            letter1 = myString.charAt(4);
            System.out.println("letter1: " + letter1);

            letter2 = message.charAt(6);
            System.out.println("letter2: " + letter2);

            same = myString.equals(message);
            System.out.println("same: " + same);

            same = myString.equalsIgnoreCase(message);
            System.out.println("same: " +same);

            same = message.equalsIgnoreCase("hello you!");
            System.out.println("same: " + same);

            newString = myString.toLowerCase();
            System.out.println("newString: " + newString);

            String lower = message.toLowerCase();
            System.out.println("lower: " + lower);

            newString = myString.toUpperCase( );
            System.out.println("newString: " + newString);

            newString = message.replace('L', '*');
            System.out.println("newString: " + newString);

            message = message.replace('L', '*');
            System.out.println("message: " + message);

            String name = "   John   ";
            System.out.println(name);
            String newName = name.trim();
            System.out.println(newName);

            String aSubString = myString.substring(3,12);
            System.out.println("aSubString: " + aSubString);

            String start = message.substring(0,5);
            System.out.println("***start: " + start);

            String bSubString = message.substring (4);
            System.out.println(bSubString);

            String finish = message.substring(6);
            System.out.println(finish);

            String newmessage = message.concat("!!!");
            System.out.println(newmessage);

            name = "John";
            name = name.concat(" Smith");
            System.out.println(name);

         }//main
      }//class