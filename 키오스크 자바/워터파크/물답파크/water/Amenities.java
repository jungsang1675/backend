package water;

public class Amenities {
	int additional_facilities; // �δ�ü�
	int re_seat; //���° �¼�
	String amenities[] = {"������","���","ī�ٳ�"};
	public Amenities(int additional_facilities,int re_seat) {
		this.additional_facilities = additional_facilities;
		this.re_seat = re_seat;
	}
	public void status(int[] seat) {
		System.out.println("����Ǿ����ϴ�.");
		System.out.println("------------------------------");
		System.out.println("���� "+amenities[this.additional_facilities-1]+" ������´� ������ �����ϴ�.");
		System.out.println("------------------------------");

		for (int i = 0; i < 10; i++) {      // �¼� ��ȣ�� �ݺ����� ���� ǥ��
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		for (int i : seat) {              // => for(int i = 0; i < seat.length; i++) {
			System.out.print(i + " ");
			//       System.out.println(seat[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------------");
	}
}