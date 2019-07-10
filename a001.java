// a001.java
import java.util.Scanner;
public class a001{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		String str;
		while(scanner.hasNext())
		{
			str = scanner.next();
			System.out.println("hello, " + str);
		}
	}
}