import java.util.Scanner;

public class StudentRegister {




public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
 System.out.println("Enter the Student Name:");
 String sName = sc.nextLine();
 
 System.out.println("Enter the Student ID: ");
 int sId = Integer.parseInt(sc.nextLine());
 
 System.out.println("Enter the Student Age: ");
 int sAge = Integer.parseInt(sc.nextLine());
 
 System.out.println("Enter the Student Grade: ");
 int sGrade = Integer.parseInt(sc.nextLine());
 
 
 System.out.println("Enter the Student Gender: ");
 String sGender = sc.nextLine();
 
 System.out.println("Enter the Student Address: ");
 String sAddress = sc.nextLine();
 
 System.out.println("Enter the Student Phone:");
 int phone = Integer.parseInt(sc.nextLine());

 System.out.println("Enter the Student Email:");
 String email = sc.nextLine();
 
 System.out.println("The Student Name " +sName);
 System.out.println("The Student ID "+sId);
 System.out.println("The Student Age "+sAge);
 System.out.println("The Student Grade "+sGrade);
 System.out.println("The Student Gender"+sGender);
 System.out.println("The Student Address "+sAddress);
 System.out.println("The Student Phone "+phone);
 System.out.println("The Student Email "+email);
 
}
}
 
 
 
 

 