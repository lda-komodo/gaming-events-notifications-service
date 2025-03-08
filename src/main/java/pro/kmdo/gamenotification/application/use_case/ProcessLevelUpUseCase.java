package pro.kmdo.gamenotification.application.use_case;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.LevelUpEventMessage;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class ProcessLevelUpUseCase extends ProcessEventBaseUseCase<BaseGamingEvent<LevelUpEventMessage>> {
	
	private static final Logger logger = LoggerFactory.getLogger(ProcessLevelUpUseCase.class);
	
	public ProcessLevelUpUseCase(NotificationServiceInterface<Notification> notificationService) {
		super(notificationService);
	}
	
	@Override
	protected Notification buildNotification(BaseGamingEvent<LevelUpEventMessage> event) {
		logger.info("Event {}", event);
		return Notification.builder()
				.id(event.getMessageId())
				.userId(event.getUserId())
				.body("Prueba Body")
				.title(Integer.toString(event.getEventMessage().getNewLevel()))
				.build();
	}
}
