import java.util.*;
public class a3q4 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		char ch;
		System.out.println("Enter the charecter: ");
		ch=c.next().charAt(0);
		if((ch>=65)&&(ch<=90))
		{
			System.out.println("Capital letter");
		}
		else if((ch>=97)&&(ch<=122))
		{
			System.out.println("Small letter");
		}
		else if((ch>=48)&&(ch<=57))
		{
			System.out.println("char is a number");
		}
		else
		{
			System.out.println("Special symbol");
		}

	}

}