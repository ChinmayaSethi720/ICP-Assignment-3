import java.util.Scanner;
public class a3q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of Rahul: ");
		int x=sc.nextInt();
		System.out.println("Enter the age of Ayush: ");
		int y=sc.nextInt();
		System.out.println("Enter the age of Ajay: ");
		int z=sc.nextInt();
		if((x>y)&&(x>z))
		{
			System.out.println("Rahul is elder than Ayush and Ajay");
		}
		else if((y>x)&&(y>z))
		{
			System.out.println("Ayush is elder than Rahul and Ajay");
		}
		else if((z>x)&&(z>y))
		{
			System.out.println("Ajay is elder than Ayush and Rahul");
		}

	}

}