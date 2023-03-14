import java.util.*;

public class arraylist {
	
	String usn,name;
	int age;
	
	arraylist(String usn, String name, int age)
	{
		this.usn = usn;
		this.name = name;
		this.age = age;
	}
	
	void display(List<arraylist> al)
	{
		Iterator<arraylist> it = al.iterator();
		while(it.hasNext())
		{
			arraylist temp = it.next();
			System.out.println("USN : "+temp.usn);
			System.out.println("NAME : "+temp.name);
			System.out.println("AGE : "+temp.age);
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arraylist obj = null;
		List<arraylist> arr_list = new ArrayList<arraylist>();
		String usn,name;
		int age,i,n;
 		
		System.out.println("-----MENU-----");
		System.out.println("1. Add student details");
		System.out.println("2. Update student details");
		System.out.println("3. Remove student details");
		System.out.println("4. Total Students");
		System.out.println("5. Display student details");
		System.out.println("6. Clear student details");
		System.out.println("7. Exit");
		
		while(true)
		{
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.print("Enter the number of students you want to enter : ");
				n = sc.nextInt();
				for(i=0;i<n;i++)
				{
					System.out.print("Enter student USN : ");
					usn = sc.next();
					System.out.print("Enter student Name : ");
					name = sc.next();
					System.out.print("Enter student Age : ");
					age = sc.nextInt();	
					obj = new arraylist(usn,name,age);
					arr_list.add(obj);
				}
				break;
				
			case 2:
				System.out.print("Enter the index you want to update : ");
				i = sc.nextInt();
				System.out.print("Enter student USN : ");
				usn = sc.next();
				System.out.print("Enter student Name : ");
				name = sc.next();
				System.out.print("Enter student Age : ");
				age = sc.nextInt();
				
				obj = new arraylist(usn,name,age);
				arr_list.set(i,obj);
				break;
				
			case 3:
				System.out.print("Enter the index you want to delete : ");
				i = sc.nextInt();
				arr_list.remove(i);
				break;
			case 4:
				System.out.println("The total number of students are : "+arr_list.size());
				break;
			case 5:obj.display(arr_list);
				break;
			case 6:arr_list.clear();
				break;

			case 7:System.exit(0);
			default:System.out.println("Invalid choice");			
			}
		}
		

	}

}
