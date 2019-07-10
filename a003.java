// a003.java
import java.util.Scanner;

public class a003{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int m, d, s;
		while(scanner.hasNext())
		{
			m = scanner.nextInt();
			d = scanner.nextInt();
			s=(m*2+d)%3;
			// 普通、吉、大吉
			if(s==0)
				System.out.println("普通");
			else if(s==1)
				System.out.println("吉");
			else
				System.out.println("大吉");

		}
	}
}