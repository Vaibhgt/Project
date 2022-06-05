package packA;
import java.util.Scanner;

public class mainDemo {
	
	static void menu()
	{
		System.out.println("1.Add contact ");
		System.out.println("2.Display all contacts ");
		System.out.println("3.Search contact(By number) ");
		System.out.println("4.Search contact(By name) ");
		System.out.println("5.Edit contact");
		System.out.println("6.Delete contact");
		System.out.println("7.Clear all record ");
		System.out.println("8.Terminate");
		System.out.println("Enter choice: ");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		phoneDirectory obj = new phoneDirectory();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\n\t\t\t\tPHONE DIRECTORY");
		System.out.println("\n--------------------------------------------------------------------------------");
		
		int ch;
		while (true )
		{
			menu();
			ch=sc.nextInt();
			switch (ch)
			{
				case 1:
					System.out.println("Enter Name :");
						String name =sc.next();
					System.out.println("Enter number :");
					String number = sc.next();
					boolean matched_complete = obj.check_Number(number);
					if(matched_complete)
						obj.add_Contact(name,number);
					else
						System.out.println("\t\t\tNumber not valid..!\n\t\t\tTry again...!");
					break;
				case 2:
		 
					obj.display();
					break;
				case 3:
					System.out.println("Enter number to find: ");
					String data_Number= sc.next();
					obj.search_By_Number(data_Number);
					break;
				case 4:
					System.out.println("Enter name to find: ");
					String data_Name= sc.next();
					obj.search_By_Name(data_Name);
					break;
				case 5:
					System.out.println("Enter name to edit contact number:");
					String name_edit=sc.next();
					
					System.out.println("Enter number to update:");
					String number_update=sc.next();
					boolean isMatched = obj.check_Number(number_update);
					if(isMatched)
						obj.edit_Contact(name_edit,number_update);
					else
						System.out.println("\t\t\tNumber not valid..!\n\t\t\tTry again...!");
					break;
				case 6:
					System.out.println("Enter the contact name or number to delete:");
					String delete_data=sc.next();
					obj.delete_Contact(delete_data);
					break;
				case 7:
				    obj.clear_all();
					break;
				case 8 :
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Option....! ");
			}
		}
	}
}