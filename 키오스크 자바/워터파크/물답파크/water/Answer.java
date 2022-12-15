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
		int total = 0; //추가
		String offline = null;
		String online = null;
		reservation rv = new reservation(online, offline);

		Scanner admission = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("-                 물답 워터파크에 오신 것을 환영합니다.               -");
		System.out.println("------------------------------------------------------------");
		System.out.println("고객님의 입장권 구매방법을 선택해 주세요.");
		System.out.println("[1] 온라인");
		System.out.println("[2] 오프라인");
		int on = admission.nextInt();
		if(on == 1) {
			for(;;) {

				System.out.println("번호를 입력해 주세요.");
				Scanner sc1 = new Scanner(System.in);
				int number = admission.nextInt();
				System.out.println("입력하신 번호가 맞습니까?");
				System.out.println("[1] 네");
				System.out.println("[2] 아니오");
				int bbbb = admission.nextInt();
				if(bbbb==1) {
					System.out.println("온라인 티켓을 발급하겠습니다.");  //
					System.out.println("------------------------------------------------------------");
					break;
				}
				System.out.println("번호를 다시 입력해 주세요.");
			}System.out.println("완료되었습니다.");

		}else {

			int age;
			String[] play={"[1]블라스터", "[2]워터플렉스", "[3]부메랑고", "[4]더블스핀", "[5]레이싱", "[6]토네이도", "[7]메가스톰", "[8]튜브라이드", "[9]서핑라이드"};
			Scanner inp = new Scanner(System.in);
			System.out.println("구매하실 상품을 선택해 주세요.");
			System.out.println("[1]자유이용권	\n  [성인 60,000원 / 청소년 48,000원]"); // 성인 60000원 / 48000원
			System.out.println("[2]BIG 3 \n  [성인 35,000원 / 청소년 23,000원]"); // 성인 35000원 / 23000원
			System.out.println("[3]BIG 5 \n  [성인 40,000원 / 청소년 28,000원]"); // 성인 40000원 / 28000원
			int ticket = inp.nextInt();

			if (ticket == 1) {
				//자유이용권일 때! // 성인 60000원 / 48000원
				free_Adult = 60000;
				free_Youth = 48000;
				System.out.println("성인의 인원수를 입력해 주세요.");
				Scanner number = new Scanner(System.in);
				Adult = number.nextInt();
				System.out.println("청소년의 인원수를 입력해 주세요.");
				Scanner number1 = new Scanner(System.in);
				Youth = number.nextInt();
				System.out.println("성인은 " + Adult + "명, " + "청소년은 " + Youth + "명, " +
						"총 인원수는 " + (Adult + Youth) + "명이고, " + "가격은 " + (( free_Adult * Adult ) + ( free_Adult * Youth )) + "원 입니다." );
				total = ( free_Adult * Adult ) + ( free_Adult * Youth );

			}//BIG3일 때

			else if (ticket == 2) {
				System.out.println("이용하실 어트랙션을 선택해 주세요. ");
				Scanner num =new Scanner(System.in);
				System.out.printf(play[0] + "\t" + play[1] + "\t" + play[2] + "\n");
				System.out.printf(play[3] + "\t" + play[4] + "\t"+"\t" + play[5] + "\n");
				System.out.printf(play[6] + "\t" + play[7] + "\t" + play[8] + "\n");
				int Ride1 = num.nextInt();
				int Ride2 = num.nextInt();
				int Ride3 = num.nextInt();
				System.out.println("선택하신 기구는: " + play[Ride1-1] + ", " + play[Ride2-1] + ", " + play[Ride3-1] + " 입니다.");
				int Big3_Adult = 35000;
				int Big3_Youth = 23000;
				System.out.println("성인의 인원수를 입력해 주세요.");
				Scanner number = new Scanner(System.in);
				Adult = number.nextInt();
				System.out.println("청소년의 인원수를 입력해 주세요.");
				Scanner number1 = new Scanner(System.in);
				Youth = number.nextInt();
				System.out.println("성인은 " + Adult + "명, " + "청소년은 " + Youth + "명, " +
						"총 인원수는 " + ( Adult + Youth ) + "명이고, " + "가격은 " + (( Big3_Adult * Adult ) + ( Big3_Youth * Youth )) + "원 입니다." );
				total = ( Big3_Adult * Adult ) + ( Big3_Youth * Youth );
			} else if (ticket == 3) { // BIG5일 때
				System.out.println("이용하실 어트랙션을 선택해 주세요. ");
				Scanner numb =new Scanner(System.in);
				System.out.printf(play[0] + "\t" + play[1] + "\t" + play[2] + "\n");
				System.out.printf(play[3] + "\t" + play[4] + "\t"+"\t" + play[5] + "\n");
				System.out.printf(play[6] + "\t" + play[7] + "\t" + play[8] + "\n");
				int Ride4 = numb.nextInt();
				int Ride5 = numb.nextInt();
				int Ride6 = numb.nextInt();
				int Ride7 = numb.nextInt();
				int Ride8 = numb.nextInt();
				System.out.print("선택하신 기구는: " + play[Ride4-1] + ", " +  play[Ride5-1] + ", " + play[Ride6-1] + ", " + play[Ride7-1] + ", " + play[Ride8-1] + " 입니다.");
				// BIG5일 때 // 성인 40000원 / 28000원
				int Big5_Adult = 40000;
				int Big5_Youth = 28000;
				System.out.println("성인의 인원수를 입력해 주세요.");
				Scanner number = new Scanner(System.in);
				Adult = number.nextInt();
				System.out.println("청소년의 인원수를 입력해 주세요.");
				Scanner number1 = new Scanner(System.in);
				Youth = number.nextInt();
				System.out.println("성인은 " + Big5_Adult + "명, " + "청소년은 " + Youth + "명, " +
						"총 인원수는 " + ( Big5_Adult + Youth ) + "명이고, " + "총 가격은 " + (( Big5_Adult * Adult ) + ( Big5_Youth * Youth )) + "원 입니다." );
				total = ( Big5_Adult * Adult ) + ( Big5_Youth * Youth );
			} else {
				System.out.println("다시 입력해 주세요.");
			}
		}
		//입장권
		
		
		//부대시설 및 대여용품 예매 시작
		int price[] = {20000,40000,70000};
		int seat[] = new int[10];
		int re_seat;
		int additional_facilities=0;
		int total1=0;
		int total2=0;
		Rentalgoods rg = new Rentalgoods();
		
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("-                     부대시설 및 대여용품                       -");
		System.out.println("------------------------------------------------------------");

		System.out.println("이용하실 상품의 번호를 입력해 주세요.");
		System.out.println("[1] 부대시설 & 대여용품");
		System.out.println("[2] 이용안함");
		int Howenter = input.nextInt();
		if(Howenter==2) {
			System.out.println("부대시설 및 대여용품은 이용하지 않으셨습니다.");
		}else{		
			System.out.println("부대시설을 예약하시겠습니까?");
			System.out.println("[1] 네");
			System.out.println("[2] 아니오");
			int facilities = input.nextInt();
			if(facilities==1){
				System.out.println("이용하실 부대시설을 선택해 주세요.");
				System.out.println("[1] 선베드 [20,000원]");
				System.out.println("[2] 평상 [40,000원]");
				System.out.println("[3] 카바나 [70,000원]");
				additional_facilities = input.nextInt();
				for (int i = 0; i < 10; i++) {      // 좌석 번호를 반복문을 통해 표현
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				for (int i : seat) {            
					System.out.print(i + " ");  
				}                           
				System.out.println();
				System.out.print("예약하실 좌석을 선택해 주세요.");
				re_seat = input.nextInt();
				if (seat[re_seat - 1] == 0) {
					seat[re_seat - 1] = 1;
					Amenities am1 = new Amenities(additional_facilities,re_seat); 
					am1.status(seat);
	
					total1 = (price[additional_facilities-1]);
				} 
			}
			
			//대여용품
			System.out.println("대여용품 예약하시겠습니까?");
			System.out.println("[1] 네");
			System.out.println("[2] 아니오");
			int good = input.nextInt();
			
			if(good==1){
				rg.rent_rocker();
				rg.rent_towel();
				total2 = rg.rocker*4000+(rg.towelSmall*3000) +(rg.towelBig*5000);
			
			}
		}

		System.out.println("------------------------------------------------------------");
		System.out.println("선택하신 최종 상품은 아래와 같습니다.상품이 맞는지 다시 한 번 확인해 주세요.");
		System.out.println("------------------------------------------------------------");
		System.out.println("\t1.부대시설 상품 목록");
		System.out.println("------------------------------------------------------------");
		if(additional_facilities == 0) {
			System.out.println("예약된 부대시설이 없습니다.");
		}else if(additional_facilities == 1) {
			System.out.println("선베드 : "+total1+"원을 선택하였습니다.");
		}else if(additional_facilities==2) {
			System.out.println("평상 : "+total1+"원을 선택하였습니다.");
		}else {
			System.out.println("카바나 : "+total1+"원을 선택하였습니다.");
		}
		System.out.println("\t2.대여하는 상품 목록");
		System.out.println("------------------------------------------------------------");
		System.out.println("락커 : "+ rg.rocker +"개"+" / "+"타월 소(수건) : "+rg.towelSmall+"개"+" / "+"타월 대(비치타올) : "+rg.towelBig+"개");
				

		int total3=total+total1+total2;

		System.out.println("입장권까지 포함한 총 금액은 "+total3+"원 입니다.");
		if(total3 == 0) {
			System.out.println("금액이 0원이므로 서비스를 종료합니다.");
			
		}else {
			System.out.println("잠시 후 결제 창으로 이동합니다.");
			tomoney.setAllmoney(total3);
			discount.main(args);
		}
	}
}