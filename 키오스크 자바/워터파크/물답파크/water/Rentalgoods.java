package water;

import java.util.Scanner;

public class Rentalgoods {
	
	int rocker; // ��Ŀ����
	int re_seat; //���° �ڸ�
	int towelSmall;
	int towelBig;
	
	public void rent_rocker() {
		Scanner input = new Scanner(System.in);
		System.out.println("��Ŀ�� �뿩�Ͻðڽ��ϱ�? [4,000��]");
		System.out.println("[1] ��");
		System.out.println("[2] �ƴϿ�");
		int rocker = input.nextInt();

		if(rocker == 1) {
			this.rocker = 1;
			System.out.println("��Ŀ�� �뿩�Ǿ����ϴ�.");
		}else {
			this.rocker = 0;
			System.out.println("��Ŀ�� �뿩���� �����̽��ϴ�.");
		}
	}
	public void rent_towel() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ÿ���� �뿩�Ͻðڽ��ϱ�? [3,000��~]");
		System.out.println("[1] ��");
		System.out.println("[2] �ƴϿ�");
		int rental = input.nextInt();

		if(rental==1) {
			System.out.println("�뿩�Ͻ� ��(����)[3,000��]�� ������ �Է��� �ּ���.");
			this.towelSmall = input.nextInt();
			System.out.println("�뿩�Ͻ� ��(��ġŸ��)[5,000��]�� ������ �Է��� �ּ���.");
			this.towelBig = input.nextInt();

		}else {
			System.out.println("Ÿ���� �뿩���� �����̽��ϴ�.");
		}

	}

}