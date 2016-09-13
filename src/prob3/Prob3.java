package prob3;
import java.util.Scanner;


public class Prob3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		char[] a = s.toCharArray();

		for( int i = 0 ; i < a.length; i++ ) {
			if( 'a' <= a[i] && a[i] <= 'z' ) {
				a[i] -= 32;
			}
			
			for( int j = 0; j <= i; j++ ) {
				System.out.print(a[j]);
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
