import java.util.Scanner;
public class a3q10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int td= sc.nextInt();
		int el= sc.nextInt();
		
		if (td==1)
			
		{
			System.out.println("Today is Monday and the future day is "+(td+el));
		}
		else if (td==2)
			System.out.println("Today is Tuesday and the future day is "+td+el);

	}

}
