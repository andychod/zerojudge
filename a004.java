// a004.java
import java.util.Scanner;

public class a004{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int years;
		while(scanner.hasNext())
		{
			years = scanner.nextInt();
			// 閏年 或 平年
			if(years%4==0 && years%100!=0)
				System.out.println("閏年");
			else if(years%400==0 )
				System.out.println("閏年");
			else
				System.out.println("平年");
		}
	}
}