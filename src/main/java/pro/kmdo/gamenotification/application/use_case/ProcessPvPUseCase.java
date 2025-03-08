package pro.kmdo.gamenotification.application.use_case;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.PvPEventMessage;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class ProcessPvPUseCase extends ProcessEventBaseUseCase<BaseGamingEvent<PvPEventMessage>> {
	public ProcessPvPUseCase(NotificationServiceInterface<Notification> notificationService) {
		super(notificationService);
	}
	
	@Override
	protected Notification buildNotification(BaseGamingEvent<PvPEventMessage> event) {
		return null;
	}
}
