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
		System.out.println("* ���� �ȳ� *");
		System.out.println("- ī�� ����: �Ｚ, �ϳ�, ����, ����, BCī�� �ִ� 50% ����"
				+ "\n- ��Ż� ����: LG U+ ����� 30% ����"
				+ "\n- �л�(��~����л�, ����(��)��) ����: ����� 20,000��"
				+ "\n- ��� ����: 65�� �̻� / ����� / ����������"
				+ " ����� 30,000��");
		System.out.println("------------------------------------------------------------");

		System.out.println("���� ����� ������ �ּ���.");
		System.out.println("[1] ī������\n[2] ��Ż� ����\n[3] �л� ����\n[4] ��� ����");
		Answer ch = new Answer();
		int discount = scanner.nextInt();
		ch.choice1 = discount;
		System.out.println("------------------------------------------------------------");
		for(;;) {
			if(choice1 == 1) {
				card.main(args);                             // card�� �̵�.
				break;
			}else if(choice1 == 2) {
				System.out.println("------------------------------------------------------------");
				try {												// ������ ����.
					System.out.println("LG U+ ����� ���ڵ带 ��ĵ�� �ּ���.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("Ȯ���� �Ϸ�Ǿ����ϴ�.\n");
				System.out.println("------------------------------------------------------------");
				
				System.out.println("* ���� ���� ���� *");
				System.out.println("[1] ī�� ����\n[2] ���� ����\n[3] ��ǰ�� ����");
				int pay2 = scanner.nextInt();
				ch.choice2 = pay2;
				if(choice2 == 1) {
					card.main(args);                                        // card�� �̵�
				}else if(choice2 == 2) {
					cash.main(args);                                       // cash�� �̵�
				}else {
					gift_card.main(args);                            // gift_card�� ù��° �������� �̵�
				}
				break;
		
			}else if(choice1 == 3) {
				try {												// ������ ����.
					System.out.println("�л����� ��ĵ�� �ּ���.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}

				System.out.println("\nȮ���� �Ϸ�Ǿ����ϴ�.");
				System.out.println("------------------------------------------------------------");
				System.out.println("* ���� ���� ���� *");
				System.out.println("[1] ī�� ����\n[2] ���� ����\n[3] ��ǰ�� ����");

				int pay2 = scanner.nextInt();
				ch.choice3 = pay2;
				if(choice3 == 1) {
					card.main(args);                                       // card�� �̵�
				}else if(choice3 == 2) {
					cash.main(args);                                       // cash�� �̵�
				}else {
					gift_card.main(args);                            // gift_card�� ù��° �������� �̵�
				}
				break;
				
			}else if(choice1 == 4) {
				try {												// ������ ����.
					System.out.println("Ȯ�� ������ �ź����� ��ĵ�� �ּ���.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("\nȮ���� �Ϸ�Ǿ����ϴ�.");
				System.out.println("------------------------------------------------------------");
				System.out.println("* ���� ���� ���� *");
				System.out.println("[1] ī�� ����\n[2] ���� ����\n[3] ��ǰ�� ����");

				int pay2 = scanner.nextInt();
				ch.choice4 =pay2;
				if(choice4 == 1) {
					card.main(args);                                       // card�� �̵�
				}else if(choice4 == 2) {
					cash.main(args);                                       // cash�� �̵�
				}else {
					gift_card.main(args);                            // gift_card�� ù��° �������� �̵�
				}
				break;
			}
		}
	}
}