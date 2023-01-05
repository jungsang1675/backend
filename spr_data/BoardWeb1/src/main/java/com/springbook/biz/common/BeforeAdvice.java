package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class BeforeAdvice {
	
	
		@Pointcut("execution(* com.springboot.biz..*Impl.*(..))")
		public void allPoint() {}
		
		@Before("allPointcut()")
		public void pointLog(JoinPoint jp) {
			String method = jp.getSignature().getName();
			Object[] args= jp.getArgs();
		
			System.out.println("[사전처리 ]" + method + "() 메소드 AROS 정보 : " + args[0].toString());
		}
	}