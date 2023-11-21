package numerospares1;

import java.util.Scanner;
public class numerospares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=1, i=0;
		
		do {
			i+=x;
			++i;
			
			System.out.println(i);
		}while(i<=500);
		
		scanner.close();

	}

}
