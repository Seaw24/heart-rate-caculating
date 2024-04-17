// Fig. 7.2: HeartRatesTest.java
// Creating and manipulating an HeartRates object.
import java.util.Scanner;
import java.time.Year;
import java.io.*;
import java.util.*;
public class HeartRatesTestFiles {
   public static void main(String[] args) throws FileNotFoundException { 
      // create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      // create an HeartRates object and assign it to myHeartRates
      HeartRates myHeartRates = new HeartRates("Bob", "Nguyen", 2006, Year.now().getValue()); 

      // display initial value of name (null)
      System.out.printf("Initial name is: %s%n", myHeartRates.getfirstName());

      // prompt for and read name
      System.out.println("Please enter the file name:");
      String inputFile = input.nextLine(); // read a line of text
      System.out.println();
      File f1 = new File(inputFile);

while( !f1.exists()){
   System.out.println("file not found!");
   System.out.println("Please enter other file name:");
   inputFile = input.nextLine();
   System.out.println();
}
System.out.println("Please enter the out file name:");
      String outputFile = input.nextLine(); // read a line of text
      System.out.println();
      File out = new File(outputFile);
      PrintStream output = new PrintStream(out);

      Scanner inputScanner = new Scanner(f1);
      while(inputScanner.hasNextLine()){
         String lines = inputScanner.nextLine();

         Scanner readWord = new Scanner(lines);
         while(readWord.hasNext()){
            String firstName = readWord.next();
            String lastName = readWord.next();
            int birthYear = readWord.nextInt();
            int currentYear = Year.now().getValue();

            
            myHeartRates.setfirstName(firstName);
            myHeartRates.setlastName(lastName);
            myHeartRates.setbirthYear(birthYear);
            myHeartRates.setcurrentYear(currentYear);


            output.printf("Person Information is:");
            output.printf("Name : " +
               myHeartRates.getfirstName() + " " + myHeartRates.getlastName() ) ;
      
               output.printf("birth year:" + myHeartRates.getbirthYear() );
      
               output.printf("current year:" + myHeartRates.getcurrentYear() );
      
               output.printf("Age:" + myHeartRates.caculateAge() );
      
               output.printf("Heart rate maximum :" + myHeartRates.caculateMaximumHeartRate() );
      
               output.printf("target Heart Rate :" + myHeartRates.caculateTargetHeartRate() );
      


         }

      }
      
      



      // display the name stored in object myHeartRates
     
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
