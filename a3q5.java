import java.util.Scanner;
public class a3q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= (int)Math.pow(b, 2)- 4*a*c;
		
		int r1=(-b+  ((int)Math.sqrt  (Math.pow(b,2) -d))/2*a);
		int r2=(-b-  ((int)Math.sqrt  (Math.pow(b,2) -d))/2*a);

		if(d>0)
		{
			System.out.println("The equation has two roots"+r1+"and"+r2);
		}
		else if(d==0)
		{
			System.out.println("The equation has one root"+r1);
		}
		else
		{
			System.out.println("The equation has no real roots");
		}
		
	}

}
