// Fig. 7.2: HeartRatesTest.java
// Creating and manipulating an HeartRates object.
import java.util.Scanner;
import java.time.Year;
public class HeartRatesTest {
   public static void main(String[] args) { 
      // create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      // create an HeartRates object and assign it to myHeartRates
      HeartRates myHeartRates = new HeartRates("Bob", "Nguyen", 2006, Year.now().getValue()); 

      // display initial value of name (null)
      System.out.printf("Initial name is: %s%n", myHeartRates.getfirstName());

      // prompt for and read name
      System.out.println("Please enter the first name:");
      String firstName = input.nextLine(); // read a line of text
      myHeartRates.setfirstName(firstName); // put theName in myHeartRates
      System.out.println(); // outputs a blank line

      System.out.println("Please enter the last name:");
      String lastName = input.nextLine(); // read a line of text
      myHeartRates.setlastName(lastName); // put theName in myHeartRates
      System.out.println(); // outputs a blank line

      System.out.println("Please enter the birthYear:");
      int birthYear = input.nextInt(); // read a line of text
      myHeartRates.setbirthYear(birthYear); // put theName in myHeartRates
      System.out.println(); // outputs a blank line

      int currentYear = Year.now().getValue();
      myHeartRates.setcurrentYear(currentYear);



      // display the name stored in object myHeartRates
      System.out.printf("Person Information is:");
      System.out.println();
      System.out.printf("Name : " +
         myHeartRates.getfirstName() + " " + myHeartRates.getlastName() ) ;
         System.out.println();

         System.out.printf("birth year:" + myHeartRates.getbirthYear() );
         System.out.println();

         System.out.printf("current year:" + myHeartRates.getcurrentYear() );
         System.out.println();

         System.out.printf("Age:" + myHeartRates.caculateAge() );
         System.out.println();

         System.out.printf("Heart rate maximum :" + myHeartRates.caculateMaximumHeartRate() );
         System.out.println();

         System.out.printf("target Heart Rate :" + myHeartRates.caculateTargetHeartRate() );
         System.out.println();

   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
