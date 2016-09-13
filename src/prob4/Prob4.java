package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		/* 구현코드 */ //배열쓰면 더 작아짐
		Scanner scan = new Scanner( System.in );
		int[] p = { 50000, 10000, 5000, 1000, 50, 10, 5, 1 };
		
		System.out.print( "금액:" );
		int Cash = scan.nextInt();
		
		for( int i = 0; i < p.length; i++ ) {
			int n; // 화폐 개수
			
			n = Cash / p[i];
			Cash = Cash % p[i]; // 잔액 계산
			
			System.out.println(p[i] + "원:" + n + "개");
		}
	}
}

