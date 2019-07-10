// a005.java
import java.util.Scanner;

public class a005{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int times;
		times = scanner.nextInt();

		while(times!=0)
		{
			times--;

			int[] arr;
			arr = new int[5];
			for(int i=0; i<4; i++)
				arr[i] = scanner.nextInt();
			if((arr[1]-arr[0]) == (arr[2] - arr[1]))
				arr[4] = 2*arr[3]-arr[2];
			else
				arr[4] = arr[3]*arr[3]/arr[2];
			System.out.print(arr[0]);
			for(int i=1; i<5; i++)
				System.out.print(" " + Integer.valueOf(arr[i]));
			System.out.println("");

			
		}
	}
}