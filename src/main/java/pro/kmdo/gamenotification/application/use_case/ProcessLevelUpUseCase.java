package pro.kmdo.gamenotification.application.use_case;

import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.LevelUpEventMessage;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

@Service
public class ProcessLevelUpUseCase extends AbstractBaseUseCase<BaseGamingEvent<LevelUpEventMessage>> {
	public ProcessLevelUpUseCase(NotificationServiceInterface<Notification> notificationService) {
		super(notificationService);
	}
	
	@Override
	protected Notification buildNotification(BaseGamingEvent<LevelUpEventMessage> event) {
		return Notification.builder()
				.id(event.getMessageId())
				.userId(event.getUserId())
				.body("Prueba Body")
				.title(String.valueOf(event.getEventMessage().getNewLevel()))
				.build();
	}
}
