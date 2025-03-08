package pro.kmdo.gamenotification.application.use_case;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.ChallengeCompletedEventMessage;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service()
@Scope(SCOPE_PROTOTYPE)
public class ProcessChallengeCompletedUseCase extends ProcessEventBaseUseCase<BaseGamingEvent<ChallengeCompletedEventMessage>> {
	public ProcessChallengeCompletedUseCase(NotificationServiceInterface<Notification> notificationService) {
		super(notificationService);
	}
	
	@Override
	protected Notification buildNotification(BaseGamingEvent<ChallengeCompletedEventMessage> event) {
		return null;
	}
}
