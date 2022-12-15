package water;

import java.util.Scanner;

public class Rentalgoods {
	
	int rocker; // 락커선택
	int re_seat; //몇번째 자리
	int towelSmall;
	int towelBig;
	
	public void rent_rocker() {
		Scanner input = new Scanner(System.in);
		System.out.println("락커를 대여하시겠습니까? [4,000원]");
		System.out.println("[1] 네");
		System.out.println("[2] 아니오");
		int rocker = input.nextInt();

		if(rocker == 1) {
			this.rocker = 1;
			System.out.println("락커가 대여되었습니다.");
		}else {
			this.rocker = 0;
			System.out.println("락커를 대여하지 않으셨습니다.");
		}
	}
	public void rent_towel() {
		Scanner input = new Scanner(System.in);
		System.out.println("타월을 대여하시겠습니까? [3,000원~]");
		System.out.println("[1] 네");
		System.out.println("[2] 아니오");
		int rental = input.nextInt();

		if(rental==1) {
			System.out.println("대여하실 소(수건)[3,000원]의 수량을 입력해 주세요.");
			this.towelSmall = input.nextInt();
			System.out.println("대여하실 대(비치타올)[5,000원]의 수량을 입력해 주세요.");
			this.towelBig = input.nextInt();

		}else {
			System.out.println("타월을 대여하지 않으셨습니다.");
		}

	}

}