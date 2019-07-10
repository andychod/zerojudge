// a002.java
import java.util.Scanner;

public class a002{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		long a, b;

		while(scanner.hasNext())
		{
			a = scanner.nextLong();
			b = scanner.nextLong();
			System.out.println(a+b);
		}
	}
}