import java.util.Scanner;

public class StudentTester {
   
   public static void main(String[] args) {
      // Create an object of Student class
      Student student = new Student();
      
      // Use Scanner to take input from the user
      Scanner scanner = new Scanner(System.in);
      
      // Use setter methods to set the values
      System.out.print("Enter Student Name: ");
      student.setStudentName(scanner.nextLine());

      System.out.print("Enter Student Id: ");
      student.setStudentId(scanner.nextInt());

      System.out.print("Enter Qualifying Marks: ");
      student.setQualifyingMarks(scanner.nextDouble());

      System.out.print("Enter Year of Engineering: ");
      student.setYearOfEngineering(scanner.nextInt());

      System.out.print("Enter Residential Status ('H' for Hostellers, 'D' for Day Scholars): ");
      student.setResidentialStatus(scanner.next().charAt(0));

      // Close the scanner after taking input
      scanner.close();

      // Use getter methods with proper escape sequences to display values
      System.out.println("Student Name       :   " + student.getStudentName());
      System.out.println("Student Id         :   " + student.getStudentId());
      System.out.println("Qualifying marks   :   " + student.getQualifyingMarks());
      System.out.println("Year of Engineering:   " + student.getYearOfEngineering());

      // Displaying Residential status with proper conversion
      String residentialStatus = (student.getResidentialStatus() == 'H') ? "Hostellers" : "Day Scholars";
      System.out.println("Residential status :   " + residentialStatus);
   }
}

