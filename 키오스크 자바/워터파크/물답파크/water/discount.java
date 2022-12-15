package water;

import java.util.Scanner;

public class discount extends Answer{
	public static int discount;
	public static int pay1;
	public static int pay2;
	public static int pay3;
  
    
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("* 할인 안내 *");
		System.out.println("- 카드 할인: 삼성, 하나, 신한, 현대, BC카드 최대 50% 할인"
				+ "\n- 통신사 할인: LG U+ 멤버십 30% 할인"
				+ "\n- 학생(중~고등학생, 대학(원)생) 할인: 입장권 20,000원"
				+ "\n- 우대 할인: 65세 이상 / 장애인 / 국가유공자"
				+ " 입장권 30,000원");
		System.out.println("------------------------------------------------------------");

		System.out.println("혜택 방법을 선택해 주세요.");
		System.out.println("[1] 카드할인\n[2] 통신사 할인\n[3] 학생 할인\n[4] 우대 할인");
		Answer ch = new Answer();
		int discount = scanner.nextInt();
		ch.choice1 = discount;
		System.out.println("------------------------------------------------------------");
		for(;;) {
			if(choice1 == 1) {
				card.main(args);                             // card로 이동.
				break;
			}else if(choice1 == 2) {
				System.out.println("------------------------------------------------------------");
				try {												// 딜레이 넣음.
					System.out.println("LG U+ 멤버십 바코드를 스캔해 주세요.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("확인이 완료되었습니다.\n");
				System.out.println("------------------------------------------------------------");
				
				System.out.println("* 결제 수단 선택 *");
				System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");
				int pay2 = scanner.nextInt();
				ch.choice2 = pay2;
				if(choice2 == 1) {
					card.main(args);                                        // card로 이동
				}else if(choice2 == 2) {
					cash.main(args);                                       // cash로 이동
				}else {
					gift_card.main(args);                            // gift_card의 첫번째 메인으로 이동
				}
				break;
		
			}else if(choice1 == 3) {
				try {												// 딜레이 넣음.
					System.out.println("학생증을 스캔해 주세요.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}

				System.out.println("\n확인이 완료되었습니다.");
				System.out.println("------------------------------------------------------------");
				System.out.println("* 결제 수단 선택 *");
				System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");

				int pay2 = scanner.nextInt();
				ch.choice3 = pay2;
				if(choice3 == 1) {
					card.main(args);                                       // card로 이동
				}else if(choice3 == 2) {
					cash.main(args);                                       // cash로 이동
				}else {
					gift_card.main(args);                            // gift_card의 첫번째 메인으로 이동
				}
				break;
				
			}else if(choice1 == 4) {
				try {												// 딜레이 넣음.
					System.out.println("확인 가능한 신분증을 스캔해 주세요.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("\n확인이 완료되었습니다.");
				System.out.println("------------------------------------------------------------");
				System.out.println("* 결제 수단 선택 *");
				System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");

				int pay2 = scanner.nextInt();
				ch.choice4 =pay2;
				if(choice4 == 1) {
					card.main(args);                                       // card로 이동
				}else if(choice4 == 2) {
					cash.main(args);                                       // cash로 이동
				}else {
					gift_card.main(args);                            // gift_card의 첫번째 메인으로 이동
				}
				break;
			}
		}
	}
}