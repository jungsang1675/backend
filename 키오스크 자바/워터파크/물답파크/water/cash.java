package water;

import java.util.Scanner;

public class cash extends discount{
	

    // ���� �Ѱ�. ���� �̵� ����.
    public static void main(String[] args) {
    	discount ch = new discount();
    	System.out.println("------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �־��ּ���");
		
		System.out.println("\n���� �������� �Ͻðڽ��ϱ�?");
		System.out.println("[1]�� [2] �ƴϿ�");
		int cash = scanner.nextInt();
		ch.discount = cash;
		System.out.println();

		for(;;) {
			if(cash == 1) {
				System.out.println("��ȣ�� �Է��� �ּ���.");
				int phone_number = scanner.nextInt();
				ch.pay2 = phone_number;
				System.out.println("�Է��Ͻ� ��ȣ�� �½��ϱ�? [1] �½��ϴ� , [2] �ƴմϴ�");
				int check = scanner.nextInt();
				ch.pay1 = check;
				if(check == 1) {
					System.out.println("���� �������� �߱��ϰڽ��ϴ�.");  //
					System.out.println("------------------------------------------------------------");
					break;
				}
				System.out.println("��ȣ�� �ٽ� �Է��� �ּ���.");
			}
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
			break;
		} 
	}
}