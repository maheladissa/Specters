import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 1 to display all contacts");
		System.out.println("Enter 2 to add contact");
		System.out.println("Enter 3 to remove contact");
		System.out.println("Enter 4 to edit contact");
		System.out.println("Enter 5 to load contacts from atext file");
		System.out.println("Enter 6 to save contacts to the text file");
		System.out.println("Enter 7 to exit from the program");
		
		System.out.println("Enter No: ");
		Scanner selectOne = new Scanner(System.in);
		
		int s = selectOne.nextInt();
		

		 switch (s) {
		   case 1:
			   
			   ContactList n = new ContactList();
				n.addContact();
				
				System.out.println("......................................");
			   System.out.println("Enter 1 to display all contacts");
				System.out.println("Enter 2 to add contact");
				System.out.println("Enter 3 to remove contact");
				System.out.println("Enter 4 to edit contact");
				System.out.println("Enter 5 to load contacts from atext file");
				System.out.println("Enter 6 to save contacts to the text file");
				System.out.println("Enter 7 to exit from the program");
				
				
				
		     break;
		   case 2:
		     
		     break;
		   case 3:
		     
		     break;
		   case 4:
		     
		     break;
		   case 5:
		   
		     break;
		   case 6:
		     
		     break;
		   case 7:
		     
		     break;
		 }
	}

}
