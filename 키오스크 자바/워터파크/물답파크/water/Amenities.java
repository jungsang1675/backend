package water;

public class Amenities {
	int additional_facilities; // 부대시설
	int re_seat; //몇번째 좌석
	String amenities[] = {"선베드","평상","카바나"};
	public Amenities(int additional_facilities,int re_seat) {
		this.additional_facilities = additional_facilities;
		this.re_seat = re_seat;
	}
	public void status(int[] seat) {
		System.out.println("예약되었습니다.");
		System.out.println("------------------------------");
		System.out.println("현재 "+amenities[this.additional_facilities-1]+" 예약상태는 다음과 같습니다.");
		System.out.println("------------------------------");

		for (int i = 0; i < 10; i++) {      // 좌석 번호를 반복문을 통해 표현
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