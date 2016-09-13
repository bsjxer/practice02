package prob1;

public class Prob1 {
	public static void main(String[] args) {
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int count = 0;
		int sum = 0;
		
		// System.out.println(data.length);  // data 배열 길이 확인
		for( int i = 0; i < data.length; i++ ) {
			if( data[i] % 3 == 0 ) {
				count++;		// 3의 배수일 때 count 1 증가
				sum += data[i];	// 3의 배수일 때 sum에 더함
			}
		}
		
		System.out.println( "주어진 배열에서 3의 배수의 개수=>" + count );
		System.out.println( "주어진 배열에서 3의 배수의 합=>" + sum );
	}
}