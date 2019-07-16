// a038.java
import java.util.Scanner;

public class a038{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		String str;
		while(scanner.hasNext())
		{
			str = scanner.next();
			int isZero = 1;
			for(int i=str.length()-1; i>=0; i--)
			{
				if(str.charAt(i) != '0')
				{
					isZero = 0;
				}
				if(isZero == 0)
					System.out.print(str.charAt(i));
			}
			if(isZero ==1 )
				System.out.print("0");
			System.out.println("");
		}
	}
}