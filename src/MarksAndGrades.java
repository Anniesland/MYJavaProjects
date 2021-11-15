import java.util.Scanner;

/**
 * Created by Abigail Elder-Mullan on 18/10/2021
 * A program to read in names and marks and convert the marks to a grade
 */
class MarksandGrades2
{// declared here so as to be accessible to the whole class
 static int mark;
 static String name;
 static char grade;

 // method to read in the name and mark
 static void readNameandMark()
 { Scanner keyboard = new Scanner(System.in);
  System.out.println("Please enter next name");
  name = keyboard.next();
  System.out.println("Please enter a mark for " + name);
  //note how we can make the 2nd prompt personalised
  mark = keyboard.nextInt();
 } // readNameandMark
 //method to convert the mark to grade
 static void convertMarktoGrade()
 { if (mark >= 70)
  grade = 'D';
 else if (mark >= 40)
  grade = 'P';
 else grade = 'F';
 } // convertMarktoGrade
 // method to display the three lists
 static void displayDetails()
 { // to display list of Distinctions

  if (grade == 'D')
  { System.out.println("The following Passed with Distinction");
   System.out.println(name + " " + mark);
  }//if
  else if (grade == 'P')
  { System.out.println("The following Passed ");
   System.out.println(name + " " + mark);
  }//if
  else if (grade == 'F')
  { System.out.println("The following Failed ");
   System.out.println(name + " " + mark);
  }//if
 } // displayDetails

 public static void main(String [] arguments)
 { readNameandMark();
  // call method readNameandMark
  convertMarktoGrade();
  // call method convertMarktoGrade
  displayDetails();
  // call method displayDetails
 }// main method
}//MarksandGrades2