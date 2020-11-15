import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
class ContactList
{
    String name[]=new String[10];//to input name of contact
    String PhoneNo[]=new String[10];//to input no of contact
    static int i=0;//to save contacts in array
    
     void addcontact()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the name:");
        name[i]=sc.nextLine();
        System.out.print("Please enter the contact:");
        PhoneNo[i++]=sc.nextLine();
    }
     
     
    void displayContact(int n)
    {
        for(i=0;i<n;i++)
        System.out.println(name[i]+" "+PhoneNo[i]);
    }  
    
    
    void editContact(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the name of the contact you want to change:");
        String nameChange=sc.nextLine();
        for(int x=0;x<n;x++)
        {
            if(nameChange.equals(name[x]))
            {
                System.out.print("Please enter the new phone number:");
                String number=sc.nextLine();
                PhoneNo[x]=number;
            }
        }
    }
    
    
    void deleteContact(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the name of the contact you want to delete:");
        String nameChange=sc.nextLine();
        for(int x=0;x<n;x++)
        {
            if(nameChange.equals(name[x]))
            {
                name[x]="";
                PhoneNo[x]="";
            }
        }
    }
    
    
    void saveContact(int n)
    {
        try
        {           
            FileWriter W=new FileWriter("1.txt");
                for(i=0;i<n;i++)
                    W.write(name[i]+" "+PhoneNo[i]);
                W.close();
        }
        catch(Exception e)
        {
            
        }
    }
    
    
     void loadContact()
    {
        try
        {           
            File myfile=new File("1.txt");
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine())
            {
            String a=sc.nextLine();
            System.out.println(a);
            }
        }
        catch(Exception e)
        {
            
        }
    }
    public static void main(String args[])
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        
        ContactList contact=new ContactList();
        
        loop1://naming the for loop to break;
        for(;;)//infinite loop until enter 7
        {
           System.out.println("Enter 1 to display all contacts");
           System.out.println("Enter 2 to add contact ");
           System.out.println("Enter 3 to remove contact ");
           System.out.println("Enter 4 to edit a contact");
           System.out.println("Enter 5 to load contacts from a text file. ");
           System.out.println("Enter 6 to save contacts to the text file.");
           System.out.println("Enter 7 to exit from the program ");
           
           int input=sc.nextInt();//forinput the number
           
           switch(input)//to call funtion and exit
           {
                case 1:
                    contact.displayContact(i);
                   break;
                    
                case 2:
                    contact.addcontact();
                   break;
                    
                case 3:
                    contact.deleteContact(i);
                   break;
                    
                case 4:
                    contact.editContact(i);
                   break;
                    
                case 5:
                    contact.loadContact();
                   break;
                    
                case 6:
                    contact.saveContact(i);
                   break;
                    
                case 7:
                    break loop1;//to exit from loop
                    
                default://for input unwanted number 
                    System.out.println("Invalid Number\n Try again");
                    break;   
                    
           }
        }
    }
}