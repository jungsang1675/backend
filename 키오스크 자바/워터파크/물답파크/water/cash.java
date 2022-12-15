package water;

import java.util.Scanner;

public class cash extends discount{
	

    // 메인 한개. 메인 이동 없음.
    public static void main(String[] args) {
    	discount ch = new discount();
    	System.out.println("------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("현금을 넣어주세요");
		
		System.out.println("\n현금 영수증을 하시겠습니까?");
		System.out.println("[1]네 [2] 아니오");
		int cash = scanner.nextInt();
		ch.discount = cash;
		System.out.println();

		for(;;) {
			if(cash == 1) {
				System.out.println("번호를 입력해 주세요.");
				int phone_number = scanner.nextInt();
				ch.pay2 = phone_number;
				System.out.println("입력하신 번호가 맞습니까? [1] 맞습니다 , [2] 아닙니다");
				int check = scanner.nextInt();
				ch.pay1 = check;
				if(check == 1) {
					System.out.println("현금 영수증을 발급하겠습니다.");  //
					System.out.println("------------------------------------------------------------");
					break;
				}
				System.out.println("번호를 다시 입력해 주세요.");
			}
			System.out.println("결제 완료되었습니다.");
			break;
		} 
	}
}