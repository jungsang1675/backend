package water;

import java.util.Scanner;

public class Answer {
	public static int choice1;
	public static int choice2;
	public static int choice3;
	public static int choice4;
	public static void main(String[] args) {
		totalmoney tomoney = totalmoney.getInstance();
		int Youth;
		int Adult;
		int free_Youth;
		int free_Adult;
		int total = 0; //�߰�
		String offline = null;
		String online = null;
		reservation rv = new reservation(online, offline);

		Scanner admission = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("-                 ���� ������ũ�� ���� ���� ȯ���մϴ�.               -");
		System.out.println("------------------------------------------------------------");
		System.out.println("������ ����� ���Ź���� ������ �ּ���.");
		System.out.println("[1] �¶���");
		System.out.println("[2] ��������");
		int on = admission.nextInt();
		if(on == 1) {
			for(;;) {

				System.out.println("��ȣ�� �Է��� �ּ���.");
				Scanner sc1 = new Scanner(System.in);
				int number = admission.nextInt();
				System.out.println("�Է��Ͻ� ��ȣ�� �½��ϱ�?");
				System.out.println("[1] ��");
				System.out.println("[2] �ƴϿ�");
				int bbbb = admission.nextInt();
				if(bbbb==1) {
					System.out.println("�¶��� Ƽ���� �߱��ϰڽ��ϴ�.");  //
					System.out.println("------------------------------------------------------------");
					break;
				}
				System.out.println("��ȣ�� �ٽ� �Է��� �ּ���.");
			}System.out.println("�Ϸ�Ǿ����ϴ�.");

		}else {

			int age;
			String[] play={"[1]�����", "[2]�����÷���", "[3]�θ޶���", "[4]������", "[5]���̽�", "[6]����̵�", "[7]�ް�����", "[8]Ʃ����̵�", "[9]���ζ��̵�"};
			Scanner inp = new Scanner(System.in);
			System.out.println("�����Ͻ� ��ǰ�� ������ �ּ���.");
			System.out.println("[1]�����̿��	\n  [���� 60,000�� / û�ҳ� 48,000��]"); // ���� 60000�� / 48000��
			System.out.println("[2]BIG 3 \n  [���� 35,000�� / û�ҳ� 23,000��]"); // ���� 35000�� / 23000��
			System.out.println("[3]BIG 5 \n  [���� 40,000�� / û�ҳ� 28,000��]"); // ���� 40000�� / 28000��
			int ticket = inp.nextInt();

			if (ticket == 1) {
				//�����̿���� ��! // ���� 60000�� / 48000��
				free_Adult = 60000;
				free_Youth = 48000;
				System.out.println("������ �ο����� �Է��� �ּ���.");
				Scanner number = new Scanner(System.in);
				Adult = number.nextInt();
				System.out.println("û�ҳ��� �ο����� �Է��� �ּ���.");
				Scanner number1 = new Scanner(System.in);
				Youth = number.nextInt();
				System.out.println("������ " + Adult + "��, " + "û�ҳ��� " + Youth + "��, " +
						"�� �ο����� " + (Adult + Youth) + "���̰�, " + "������ " + (( free_Adult * Adult ) + ( free_Adult * Youth )) + "�� �Դϴ�." );
				total = ( free_Adult * Adult ) + ( free_Adult * Youth );

			}//BIG3�� ��

			else if (ticket == 2) {
				System.out.println("�̿��Ͻ� ��Ʈ������ ������ �ּ���. ");
				Scanner num =new Scanner(System.in);
				System.out.printf(play[0] + "\t" + play[1] + "\t" + play[2] + "\n");
				System.out.printf(play[3] + "\t" + play[4] + "\t"+"\t" + play[5] + "\n");
				System.out.printf(play[6] + "\t" + play[7] + "\t" + play[8] + "\n");
				int Ride1 = num.nextInt();
				int Ride2 = num.nextInt();
				int Ride3 = num.nextInt();
				System.out.println("�����Ͻ� �ⱸ��: " + play[Ride1-1] + ", " + play[Ride2-1] + ", " + play[Ride3-1] + " �Դϴ�.");
				int Big3_Adult = 35000;
				int Big3_Youth = 23000;
				System.out.println("������ �ο����� �Է��� �ּ���.");
				Scanner number = new Scanner(System.in);
				Adult = number.nextInt();
				System.out.println("û�ҳ��� �ο����� �Է��� �ּ���.");
				Scanner number1 = new Scanner(System.in);
				Youth = number.nextInt();
				System.out.println("������ " + Adult + "��, " + "û�ҳ��� " + Youth + "��, " +
						"�� �ο����� " + ( Adult + Youth ) + "���̰�, " + "������ " + (( Big3_Adult * Adult ) + ( Big3_Youth * Youth )) + "�� �Դϴ�." );
				total = ( Big3_Adult * Adult ) + ( Big3_Youth * Youth );
			} else if (ticket == 3) { // BIG5�� ��
				System.out.println("�̿��Ͻ� ��Ʈ������ ������ �ּ���. ");
				Scanner numb =new Scanner(System.in);
				System.out.printf(play[0] + "\t" + play[1] + "\t" + play[2] + "\n");
				System.out.printf(play[3] + "\t" + play[4] + "\t"+"\t" + play[5] + "\n");
				System.out.printf(play[6] + "\t" + play[7] + "\t" + play[8] + "\n");
				int Ride4 = numb.nextInt();
				int Ride5 = numb.nextInt();
				int Ride6 = numb.nextInt();
				int Ride7 = numb.nextInt();
				int Ride8 = numb.nextInt();
				System.out.print("�����Ͻ� �ⱸ��: " + play[Ride4-1] + ", " +  play[Ride5-1] + ", " + play[Ride6-1] + ", " + play[Ride7-1] + ", " + play[Ride8-1] + " �Դϴ�.");
				// BIG5�� �� // ���� 40000�� / 28000��
				int Big5_Adult = 40000;
				int Big5_Youth = 28000;
				System.out.println("������ �ο����� �Է��� �ּ���.");
				Scanner number = new Scanner(System.in);
				Adult = number.nextInt();
				System.out.println("û�ҳ��� �ο����� �Է��� �ּ���.");
				Scanner number1 = new Scanner(System.in);
				Youth = number.nextInt();
				System.out.println("������ " + Big5_Adult + "��, " + "û�ҳ��� " + Youth + "��, " +
						"�� �ο����� " + ( Big5_Adult + Youth ) + "���̰�, " + "�� ������ " + (( Big5_Adult * Adult ) + ( Big5_Youth * Youth )) + "�� �Դϴ�." );
				total = ( Big5_Adult * Adult ) + ( Big5_Youth * Youth );
			} else {
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
		}
		//�����
		
		
		//�δ�ü� �� �뿩��ǰ ���� ����
		int price[] = {20000,40000,70000};
		int seat[] = new int[10];
		int re_seat;
		int additional_facilities=0;
		int total1=0;
		int total2=0;
		Rentalgoods rg = new Rentalgoods();
		
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("-                     �δ�ü� �� �뿩��ǰ                       -");
		System.out.println("------------------------------------------------------------");

		System.out.println("�̿��Ͻ� ��ǰ�� ��ȣ�� �Է��� �ּ���.");
		System.out.println("[1] �δ�ü� & �뿩��ǰ");
		System.out.println("[2] �̿����");
		int Howenter = input.nextInt();
		if(Howenter==2) {
			System.out.println("�δ�ü� �� �뿩��ǰ�� �̿����� �����̽��ϴ�.");
		}else{		
			System.out.println("�δ�ü��� �����Ͻðڽ��ϱ�?");
			System.out.println("[1] ��");
			System.out.println("[2] �ƴϿ�");
			int facilities = input.nextInt();
			if(facilities==1){
				System.out.println("�̿��Ͻ� �δ�ü��� ������ �ּ���.");
				System.out.println("[1] ������ [20,000��]");
				System.out.println("[2] ��� [40,000��]");
				System.out.println("[3] ī�ٳ� [70,000��]");
				additional_facilities = input.nextInt();
				for (int i = 0; i < 10; i++) {      // �¼� ��ȣ�� �ݺ����� ���� ǥ��
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				for (int i : seat) {            
					System.out.print(i + " ");  
				}                           
				System.out.println();
				System.out.print("�����Ͻ� �¼��� ������ �ּ���.");
				re_seat = input.nextInt();
				if (seat[re_seat - 1] == 0) {
					seat[re_seat - 1] = 1;
					Amenities am1 = new Amenities(additional_facilities,re_seat); 
					am1.status(seat);
	
					total1 = (price[additional_facilities-1]);
				} 
			}
			
			//�뿩��ǰ
			System.out.println("�뿩��ǰ �����Ͻðڽ��ϱ�?");
			System.out.println("[1] ��");
			System.out.println("[2] �ƴϿ�");
			int good = input.nextInt();
			
			if(good==1){
				rg.rent_rocker();
				rg.rent_towel();
				total2 = rg.rocker*4000+(rg.towelSmall*3000) +(rg.towelBig*5000);
			
			}
		}

		System.out.println("------------------------------------------------------------");
		System.out.println("�����Ͻ� ���� ��ǰ�� �Ʒ��� �����ϴ�.��ǰ�� �´��� �ٽ� �� �� Ȯ���� �ּ���.");
		System.out.println("------------------------------------------------------------");
		System.out.println("\t1.�δ�ü� ��ǰ ���");
		System.out.println("------------------------------------------------------------");
		if(additional_facilities == 0) {
			System.out.println("����� �δ�ü��� �����ϴ�.");
		}else if(additional_facilities == 1) {
			System.out.println("������ : "+total1+"���� �����Ͽ����ϴ�.");
		}else if(additional_facilities==2) {
			System.out.println("��� : "+total1+"���� �����Ͽ����ϴ�.");
		}else {
			System.out.println("ī�ٳ� : "+total1+"���� �����Ͽ����ϴ�.");
		}
		System.out.println("\t2.�뿩�ϴ� ��ǰ ���");
		System.out.println("------------------------------------------------------------");
		System.out.println("��Ŀ : "+ rg.rocker +"��"+" / "+"Ÿ�� ��(����) : "+rg.towelSmall+"��"+" / "+"Ÿ�� ��(��ġŸ��) : "+rg.towelBig+"��");
				

		int total3=total+total1+total2;

		System.out.println("����Ǳ��� ������ �� �ݾ��� "+total3+"�� �Դϴ�.");
		if(total3 == 0) {
			System.out.println("�ݾ��� 0���̹Ƿ� ���񽺸� �����մϴ�.");
			
		}else {
			System.out.println("��� �� ���� â���� �̵��մϴ�.");
			tomoney.setAllmoney(total3);
			discount.main(args);
		}
	}
}