package pro.kmdo.gamenotification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pro.kmdo.gamenotification.adapter.kafka.ListenersLoggingAspect;
import pro.kmdo.gamenotification.application.ApplicationLoggingAspect;

@Configuration
@EnableAspectJAutoProxy
public class GameEventsNotificationsAppConfig {
	
	@Bean
	public ListenersLoggingAspect listenersLoggingAspect() {
		// Configure properties of the aspect here
		return new ListenersLoggingAspect();
	}
	
	@Bean
	public ApplicationLoggingAspect applicationLoggingAspect() {
		return new ApplicationLoggingAspect();
	}
	
	
}