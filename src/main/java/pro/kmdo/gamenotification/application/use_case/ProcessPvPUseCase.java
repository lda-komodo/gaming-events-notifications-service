package pro.kmdo.gamenotification.application.use_case;

import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.PvPEventMessage;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

@Service
public class ProcessPvPUseCase extends AbstractBaseUseCase<BaseGamingEvent<PvPEventMessage>> {
	public ProcessPvPUseCase(NotificationServiceInterface<Notification> notificationService) {
		super(notificationService);
	}
	
	@Override
	protected Notification buildNotification(BaseGamingEvent<PvPEventMessage> event) {
		return null;
	}
}
