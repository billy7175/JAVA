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

@Aspect // AOP Aspect로 지정 -> IoC 컨테이너에 빈을 등록하는 설정은 아님 -> @Component를 같이 써야합니다.
@Component
public class Logger {	
	
	@Pointcut("execution(* *..*A.*(..))") public void pointcutA() {}
	@Pointcut("execution(* *..*B.*(..))") public void pointcutB() {}
	
	//@Before("bean(testA)")
	@Before("pointcutA()")
	public void logBefore(JoinPoint joinPoint) { //JoinPoint 전달인자 : 현재 실행되는 메서드 정보		
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
	
	@Around("execution(* *..*.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable { //Around Advice는 반드시 ProceedingJoinPoint 전달인자를 가져야 합니다.
		
		long begin = System.nanoTime(); //시작시간 - Before Advice
		
		Object returnValue = null;
		returnValue = joinPoint.proceed(); //실제 메서드 호출
		long end = System.nanoTime(); //종료시간 - After Advice
		
		System.out.printf("[[[ %s.%s 실행 소요시간 : %d ]]]\n", 
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


























