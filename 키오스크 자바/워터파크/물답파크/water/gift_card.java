package water;

import java.util.Scanner;

// ��ǰ�� ���� â
public class gift_card extends discount{


	// ���� �ΰ�
	public static void main(String[] args){                   // main1
		discount gift = new discount();
		Scanner scanner = new Scanner(System.in);
	
		for(;;) {
			System.out.println("��ǰ���� ������ �ּ���.");
			System.out.println("[1] �Ե� ��ǰ�� \n[2] ��ȭ ��ǰ��");
			int gift_cash_1 = scanner.nextInt();
			gift.pay1 = gift_cash_1;
			if(pay1 == 1) {
				System.out.println("�Ե� ��ǰ���� �����ϼ̽��ϴ�.");
				break;
			}else if(pay1 == 2){
				System.out.println("��ȭ ��ǰ���� �����ϼ̽��ϴ�.");
				break;
			}else {
				System.out.println("���ڸ� �ٽ� �Է��� �ּ���.");
				System.out.println("------------------------------------------------------------");
			}
		}

		System.out.println("�ݾױ��� ������ �ּ���.");
		System.out.println("[1] 100,000�� \n[2] 50,000��");
		totalmoney tomoney = totalmoney.getInstance();  //  -------------------------------- ���߿� �����ϱ�^^^^^^^
		int gift_cash_2 = scanner.nextInt();
		discount gift2 = new discount();
		gift2.pay2 = gift_cash_2;
		if(pay2 == 1) {
			gift_cash_2 = 100000;
		}else {
			gift_cash_2 = 50000;
		}
		if(gift_cash_2 == tomoney.getAllmoney()){
			System.out.println(tomoney.getAllmoney() + " - " + gift_cash_2 + " = " + "0" +"��� ������ �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("------------------------------------------------------------");
			System.out.println("�ܾ���: " + (tomoney.getAllmoney() - gift_cash_2) + "�� �Դϴ�.");
			System.out.println("�ܾ� ���� ������ ������ �ּ���.");
			gift_card.main_gift_card2(args);                       // gift_card �ι�° �������� �̵�
		}

	}
	public static void main_gift_card2(String[] args) {                 // main2  �̰Ŵ� ��ǰ���� �ƴϰ� ��ǰ�� ���� �� �ܾ� ����ϴ� �κ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] ī�� ����\n[2] ���� ����");

		int left = scanner.nextInt();

		if(left == 1) {
			try {
				System.out.println("ī�带 ������ �ּ���.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			// �� �޾Ƽ� ���� �ֱ�. ����.2

		}else{
			cash.main(args);                                       // cash�� �̵�
		}
	}
}