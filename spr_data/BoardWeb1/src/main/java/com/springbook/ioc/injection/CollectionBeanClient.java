package com.springbook.ioc.injection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

   public static void main(String[] args) {
	   
      //1. Spring 컨테이너를 구동한다.
      AbstractApplicationContext factory = new GenericXmlApplicationContext("ApplicationContext4.xml");
      
      CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
      
      Properties addressList = bean.getAddressList();
      
      for(String key : addressList.stringPropertyNames()) {
    	  System.out.println(String.format("키 : %s, 값 : %s", key, addressList.get(key)));
      }
      
      //3. Spring 컨테이너를 종료한다.
      factory.close();
   	}
}