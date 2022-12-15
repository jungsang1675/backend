package water;

import java.util.Scanner;

// 상품권 선택 창
public class gift_card extends discount{


	// 메인 두개
	public static void main(String[] args){                   // main1
		discount gift = new discount();
		Scanner scanner = new Scanner(System.in);
	
		for(;;) {
			System.out.println("상품권을 선택해 주세요.");
			System.out.println("[1] 롯데 상품권 \n[2] 문화 상품권");
			int gift_cash_1 = scanner.nextInt();
			gift.pay1 = gift_cash_1;
			if(pay1 == 1) {
				System.out.println("롯데 상품권을 선택하셨습니다.");
				break;
			}else if(pay1 == 2){
				System.out.println("문화 상품권을 선택하셨습니다.");
				break;
			}else {
				System.out.println("숫자를 다시 입력해 주세요.");
				System.out.println("------------------------------------------------------------");
			}
		}

		System.out.println("금액권을 선택해 주세요.");
		System.out.println("[1] 100,000원 \n[2] 50,000원");
		totalmoney tomoney = totalmoney.getInstance();  //  -------------------------------- 나중에 수정하기^^^^^^^
		int gift_cash_2 = scanner.nextInt();
		discount gift2 = new discount();
		gift2.pay2 = gift_cash_2;
		if(pay2 == 1) {
			gift_cash_2 = 100000;
		}else {
			gift_cash_2 = 50000;
		}
		if(gift_cash_2 == tomoney.getAllmoney()){
			System.out.println(tomoney.getAllmoney() + " - " + gift_cash_2 + " = " + "0" +"모두 결제가 완료되었습니다.");
		}else {
			System.out.println("------------------------------------------------------------");
			System.out.println("잔액은: " + (tomoney.getAllmoney() - gift_cash_2) + "원 입니다.");
			System.out.println("잔액 결제 수단을 선택해 주세요.");
			gift_card.main_gift_card2(args);                       // gift_card 두번째 메인으로 이동
		}

	}
	public static void main_gift_card2(String[] args) {                 // main2  이거는 상품권은 아니고 상품권 결제 후 잔액 계산하는 부분
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 카드 결제\n[2] 현금 결제");

		int left = scanner.nextInt();

		if(left == 1) {
			try {
				System.out.println("카드를 삽입해 주세요.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("결제가 완료되었습니다.");
			// 값 받아서 결제 넣기. 수정.2

		}else{
			cash.main(args);                                       // cash로 이동
		}
	}
}