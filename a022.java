// a022.java
import java.util.Scanner;

public class a022{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str;
		while(scanner.hasNext())
		{
			str = scanner.next();
			int size = str.length();
			int flag = 1;
			for(int i=0; i<size; i++)
			{
				if(str.charAt(i) != str.charAt(size-1-i))
				{
					flag = 0;
					break;
				}
			}
			if(flag ==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	
	}
}