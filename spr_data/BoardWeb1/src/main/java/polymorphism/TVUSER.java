package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUSER {

   public static void main(String[] args) {
      //1. Spring 컨테이너를 구동한다.
      AbstractApplicationContext factory = new GenericXmlApplicationContext("ApplicationContext.xml");
      
      //2. Spring 컨테이너로 부터 필요한 객체를 요청(LookUp)한다.
      TV tv = (TV)factory.getBean("tv");
      tv.powerOff();
      tv.volumeUp();
      tv.volumeDown();
      tv.powerOn();      
      //3. Spring 컨테이너를 종료한다.
      factory.close();
   	}
}