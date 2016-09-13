package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		GoodsAll goods = new GoodsAll();
		
		System.out.println("상품명 수량 개수를 입력하시오.");
		
		String line = scanner.nextLine();
		String[] infos = line.split( " " );
		
		String name = infos[0];
		int price = Integer.parseInt( infos[1] );
		int countStock = Integer.parseInt( infos[2] );
		
		goods.GoodsAll(name, price, countStock );
		
		goods.showGoods();
		
		scanner.close();
		
		
		
		
		
		
		
		
		/* 완성문 */
//		
//		Goods[] goodsArray = new Goods[3];
//		
//		for( int i = 0; i < goodsArray.length; i++ ) {
//			goodsArray[i] = new Goods();
//			
//			System.out.println("상품명 수량 개수를 입력하시오.");
//			
//			String line = scanner.nextLine();
//			String[] infos = line.split( " " );			
//			
//			goodsArray[i].setName(infos[0]);
//			goodsArray[i].setPrice(Integer.parseInt(infos[1]));
//			goodsArray[i].setCountStock(Integer.parseInt(infos[2]));
//		}
//		
//		for( Goods Value : goodsArray ) {
//			System.out.println(Value.getName() + "(가격:" + Value.getPrice() + "원)이 " + Value.getCountStock() + "개 입고 되었습니다.");		
//		}	
//		
//		scanner.close();
		
		/* 3x3 행렬에 입력해서 실행하기  */ 
//		
//		String[][] lines = new String[3][3];  // 3x3 행렬 생성. 상품명;가격;수량  총 3 상품
//		
//		for( int i = 0; i < 3; i++ ) {
//			System.out.println( (i+1) + "번 상품 이름과 가격 수량을 입력하세요.");
//			lines[i][0] = scanner.nextLine(); // 하나의 상품명 가격 수량을 한 줄로 입력 받기
//			
//			String[] infos = lines[i][0].split(" "); // 한 줄로 입력 받은 하나의 상품을 나누는 작업
//			
//			for( int j = 0; j < 3; j++ ) {
//				lines[i][j] = infos[j];			// 하나의 상품을 상품명, 가격, 수량 나눠서 입력 하기
//			}			
//		}
//		
//		System.out.println();
//		
//		for( int i = 0; i < 3; i++ ) {
//			System.out.println( lines[i][0] + "(가격:" + lines[i][1] + "원)이 " 
//								+ lines[i][2] + "개 입고 되었습니다.");
//		}
//		
//		scanner.close();
			
		
		/* 선생님 코딩 */
//		
//		for( int i = 0; i < 3; i++ ) {
//			String line = scanner.nextLine();
//			String[] infos = line.split( " " );
//			
//			String name = infos[0];
//			int price = Integer.parseInt( infos[1] );
//			int countStock = Integer.parseInt( infos[2] );
//			
//			System.out.println( name );
//			System.out.println( price );
//			System.out.println( countStock );
////		}
//		
//		scanner.close();
	}
}
