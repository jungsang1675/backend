package water;

import java.util.Scanner;

public class card extends discount{
	//  ���� �ΰ�.
	public static void main(String[] args) {                                    // main1
		totalmoney tomoney = totalmoney.getInstance();
		discount card = new discount();
		System.out.println("������ �ݾ��� " + tomoney.getAllmoney() + "�� �Դϴ�.\n");
		System.out.println("------------------------------------------------------------");
		System.out.println("[ī�� ���� ����] \n* ī�� ������ 1��, ��1ȸ, ��5ȸ �����˴ϴ�.\n");
		System.out.println("- �Ｚī�� : �̿�� 30% ����\n"
				+ "- �ϳ�ī�� : �̿�� 50% ����\n"
				+ "- ����ī�� : �̿�� 30% ����\n"
				+ "- ����ī�� : �̿�� 30% ����\n"
				+ "- B  Cī�� : �̿�� 50% ����\n");
		System.out.println("[1] �������\n[2] ī�����");
		Scanner scanner = new Scanner(System.in);
		int card1 = scanner.nextInt();
		card.pay1 = card1;
		if(pay1 == 1) {
			System.out.println("* ���� ���� ���� *");
			System.out.println("[1] ī�� ����\n[2] ���� ����\n[3] ��ǰ�� ����");

			int pay1 = scanner.nextInt();
			card.pay2 = pay1;
			if(pay2 == 1) {
				card.main(args);                                       // card�� �̵�
			}else if(pay2 == 2) {
				cash.main(args);                                       // cash�� �̵�
			}else {
				gift_card.main(args);                            // gift_card�� ù��° �������� �̵�
			}
		
		}else {
			try {												// ������ ����.
				System.out.println("ī�带 ������ �ּ���.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");

		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("* ����Ʈ�� �����Ͻðڽ��ϱ�? *");
		System.out.println("[1] ����Ʈ ���� �ϱ�\n[2] ����Ʈ ���� �� ��");

		int card2 = scanner.nextInt();
		card.pay3 = card2;
		if(pay3 == 1) {
			System.out.println("�޴��� ��ȣ�� �Է����ּ���.  ex)01012341234");
			String phone_number = scanner.next();
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("�����մϴ�.");
			System.out.println("------------------------------------------------------------");
		}else{
			System.out.println("�����մϴ�.");
		}
	}
}