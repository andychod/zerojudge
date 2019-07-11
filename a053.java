// a053.java
/*
答對題數在 0~10 者，每題給6分。
題數在 11~20 者，從第11題開始，每題給2分。(前10題還是每題給6分)
題數在 21~40 者，從第21題開始，每題給1分。
題數在 40 以上者，一律100分。
*/
import java.util.Scanner;

public class a053{
	public static void main(String[] args)
	{
		Scanner scanner =  new Scanner(System.in);
		int points;

		while(scanner.hasNext())
		{
			points = scanner.nextInt();
			if(points<=10)
				System.out.println(points*6);
			else if(points<=20)
				System.out.println(60 + (points-10)*2);
			else if (points <=40)
				System.out.println(80 + (points-20));
			else
				System.out.println(100);
		}
	}
}