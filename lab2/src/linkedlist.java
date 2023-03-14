
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class linkedlist {
	
	String usn,name;
	int age;
	
	linkedlist(String usn, String name, int age)
	{
		this.usn = usn;
		this.name = name;
		this.age = age;
	}
	
	void display(List<linkedlist> ll)
	{
		Iterator<linkedlist> it = ll.iterator();
		while(it.hasNext())
		{
			linkedlist temp = it.next();
			System.out.println("USN : "+temp.usn);
			System.out.println("NAME : "+temp.name);
			System.out.println("AGE : "+temp.age);
		}
	}

	public static <T> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		linkedlist obj = null;
		List<linkedlist> linked_list = new LinkedList<linkedlist>();
		String usn,name;
		int age,i,n;
 		
		System.out.println("-----MENU-----");
		System.out.println("1. Add student details from beginning");
		System.out.println("2. Add student details from end");
		System.out.println("3. Remove student details from beginning");
		System.out.println("4. Remove student details from end");
		System.out.println("5. Display student details");
		System.out.println("6. Sort student details");
		System.out.println("7. Exit");
		
		while(true)
		{
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:		
				System.out.print("Enter student USN : ");
				usn = sc.next();
				System.out.print("Enter student Name : ");
				name = sc.next();
				System.out.print("Enter student Age : ");
				age = sc.nextInt();	
				obj = new linkedlist(usn,name,age);
				((LinkedList<linkedlist>) linked_list).addFirst(obj);		
				break;
				
			case 2:
				System.out.print("Enter student USN : ");
				usn = sc.next();
				System.out.print("Enter student Name : ");
				name = sc.next();
				System.out.print("Enter student Age : ");
				age = sc.nextInt();	
				obj = new linkedlist(usn,name,age);
				((LinkedList<linkedlist>) linked_list).addLast(obj);	
				break;
				
			case 3:
				
				((LinkedList<linkedlist>) linked_list).removeFirst();
				break;
			case 4:
				((LinkedList<linkedlist>) linked_list).removeLast();
				break;
			case 5:obj.display(linked_list);
				break;
//			case 6:int List;
//				
//				Collections.sort(linked_list);
			
			case 7:System.exit(0);
			default:System.out.println("Invalid choice");			
			}
		}
		

	}

}
