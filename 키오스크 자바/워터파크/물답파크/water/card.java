package water;

import java.util.Scanner;

public class card extends discount{
	//  메인 두개.
	public static void main(String[] args) {                                    // main1
		totalmoney tomoney = totalmoney.getInstance();
		discount card = new discount();
		System.out.println("결제할 금액은 " + tomoney.getAllmoney() + "원 입니다.\n");
		System.out.println("------------------------------------------------------------");
		System.out.println("[카드 할인 정보] \n* 카드 할인은 1인, 일1회, 연5회 제공됩니다.\n");
		System.out.println("- 삼성카드 : 이용권 30% 할인\n"
				+ "- 하나카드 : 이용권 50% 할인\n"
				+ "- 신한카드 : 이용권 30% 할인\n"
				+ "- 현대카드 : 이용권 30% 할인\n"
				+ "- B  C카드 : 이용권 50% 할인\n");
		System.out.println("[1] 결제취소\n[2] 카드결제");
		Scanner scanner = new Scanner(System.in);
		int card1 = scanner.nextInt();
		card.pay1 = card1;
		if(pay1 == 1) {
			System.out.println("* 결제 수단 선택 *");
			System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");

			int pay1 = scanner.nextInt();
			card.pay2 = pay1;
			if(pay2 == 1) {
				card.main(args);                                       // card로 이동
			}else if(pay2 == 2) {
				cash.main(args);                                       // cash로 이동
			}else {
				gift_card.main(args);                            // gift_card의 첫번째 메인으로 이동
			}
		
		}else {
			try {												// 딜레이 넣음.
				System.out.println("카드를 삽입해 주세요.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("결제가 완료되었습니다.");

		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("* 포인트를 적립하시겠습니까? *");
		System.out.println("[1] 포인트 적립 하기\n[2] 포인트 적립 안 함");

		int card2 = scanner.nextInt();
		card.pay3 = card2;
		if(pay3 == 1) {
			System.out.println("휴대폰 번호를 입력해주세요.  ex)01012341234");
			String phone_number = scanner.next();
			System.out.println("적립이 완료되었습니다.");
			System.out.println("감사합니다.");
			System.out.println("------------------------------------------------------------");
		}else{
			System.out.println("감사합니다.");
		}
	}
}