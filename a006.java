// a006.java
import java.util.Scanner;

public class a006{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		while(scanner.hasNext())
		{
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();

			// b^2 -4ac
			if((b*b - 4*a*c) < 0)
				System.out.println("No real root");
			else if((b*b - 4*a*c) == 0)
			{
				double ans;
				ans = (b*(-1) + Math.sqrt(b*b - 4*a*c))/(2*a);
				System.out.println("Two same roots x=" + String.format("%.0f",ans));
			}
			else
			{
				double ans1, ans2;
				ans1 = (b*(-1) + Math.sqrt(b*b - 4*a*c))/(2*a);
				ans2 = (b*(-1) - Math.sqrt(b*b - 4*a*c))/(2*a);
				// Two different roots x1=2 , x2=-5
				System.out.println("Two different roots x1=" + String.format("%.0f",ans1)
					+ " , x2=" + String.format("%.0f",ans2));
			}
		}
	}
}