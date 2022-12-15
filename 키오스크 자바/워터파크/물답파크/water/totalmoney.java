package water;

public class totalmoney {
	private static totalmoney singleton = new totalmoney(); //최종 값을 이어받을 객체
	private int allmoney; // 최종값을 넣음
private totalmoney() {}
public static totalmoney getInstance() {  
	return singleton;
}
public static totalmoney getSingleton() {
	return singleton;
}
public static void setSingleton(totalmoney singleton) {
	totalmoney.singleton = singleton;
}
public int getAllmoney() { //최종가격을 받아옴
	return allmoney;
}	
public void setAllmoney(int allmoney) { //최종가격을 저장
	this.allmoney = allmoney;
}
}
