package com.springexample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Aspect // AOP Aspect濡� 吏��젙 -> IoC 而⑦뀒�씠�꼫�뿉 鍮덉쓣 �벑濡앺븯�뒗 �꽕�젙�� �븘�떂 -> @Component瑜� 媛숈씠 �뜥�빞�빀�땲�떎.
@Component
public class Logger {	
	
	@Pointcut("execution(* *..*A.*(..))") public void pointcutA() {}
	@Pointcut("execution(* *..*B.*(..))") public void pointcutB() {}
	
	//@Before("bean(testA)")
	@Before("pointcutA()")
	public void logBefore(JoinPoint joinPoint) { //JoinPoint �쟾�떖�씤�옄 : �쁽�옱 �떎�뻾�릺�뒗 硫붿꽌�뱶 �젙蹂�		
		System.out.println(String.format("======> Logging.logBefore %s.%s <=======",
				joinPoint.getSignature().getDeclaringTypeName(),
				joinPoint.getSignature().getName()));
	}	
	
	//@After("within(*..*B"))
	@After("pointcutB()")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println(String.format("======> Logging.logAfter %s.%s <=======",
				joinPoint.getSignature().getDeclaringTypeName(),
				joinPoint.getSignature().getName()));
	}
	
//	@Around("execution(* *..*.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable { //Around Advice�뒗 諛섎뱶�떆 ProceedingJoinPoint �쟾�떖�씤�옄瑜� 媛��졇�빞 �빀�땲�떎.
		
		long begin = System.nanoTime(); //�떆�옉�떆媛� - Before Advice
		
		Object returnValue = null;
		returnValue = joinPoint.proceed(); //�떎�젣 硫붿꽌�뱶 �샇異�
		long end = System.nanoTime(); //醫낅즺�떆媛� - After Advice
		
		System.out.printf("[[[ %s.%s �떎�뻾 �냼�슂�떆媛� : %d ]]]\n", 
				joinPoint.getSignature().getDeclaringTypeName(),
				joinPoint.getSignature().getName(),
				end - begin);
		
		return returnValue;
		
	}
	
	@AfterReturning("execution(* *(..))")
	public void logAfterReturning() {
		System.out.println("######### After Returning ###########");
	}
	
	@AfterThrowing("execution(* *(..))")
	public void logThrowing() {
		System.out.println("######### After Throwing ###########");
	}
}


























