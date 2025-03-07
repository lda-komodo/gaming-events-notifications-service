package pro.kmdo.gamenotification.domain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class DomainLoggingAspect {
	private static final Logger logger = LoggerFactory.getLogger(DomainLoggingAspect.class);
	
	@Around("execution(* pro.kmdo.gamenotification.domain.service.impl.NotificationsService.processUserNotifications(..))")
	public Object logEvent(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		logger.info("Entering method: {} with arguments: {}", proceedingJoinPoint.getSignature(), proceedingJoinPoint.getArgs());
		Object result = proceedingJoinPoint.proceed();
		logger.info("Exiting method: {} with result: {}", proceedingJoinPoint.getSignature(), result);
		return result;
	}
}
