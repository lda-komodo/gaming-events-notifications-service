package pro.kmdo.gamenotification.application;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class ApplicationLoggingAspect {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationLoggingAspect.class);
	
	@Around("execution(* pro.kmdo.gamenotification.application.use_case.AbstractBaseUseCase.execute(..))")
	public Object logEvent(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		logger.info("Entering method: {} with arguments: {}", proceedingJoinPoint.getSignature(), proceedingJoinPoint.getArgs());
		Object result = proceedingJoinPoint.proceed();
		logger.info("Exiting method: {} with result: {}", proceedingJoinPoint.getSignature(), result);
		return result;
	}
}
