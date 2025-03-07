package pro.kmdo.gamenotification.application.use_case;

import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.ChallengeCompletedEventMessage;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

@Service
public class ProcessChallengeCompletedUseCase extends AbstractBaseUseCase<BaseGamingEvent<ChallengeCompletedEventMessage>> {
	public ProcessChallengeCompletedUseCase(NotificationServiceInterface<Notification> notificationService) {
		super(notificationService);
	}
	
	@Override
	protected Notification buildNotification(BaseGamingEvent<ChallengeCompletedEventMessage> event) {
		return null;
	}
}
