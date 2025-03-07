package pro.kmdo.gamenotification.application.use_case;

import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.ItemAcquiredEventMessage;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

@Service
public class ProcessItemAcquiredUseCase extends AbstractBaseUseCase<BaseGamingEvent<ItemAcquiredEventMessage>> {
	public ProcessItemAcquiredUseCase(NotificationServiceInterface<Notification> notificationService) {
		super(notificationService);
	}
	
	@Override
	protected Notification buildNotification(BaseGamingEvent<ItemAcquiredEventMessage> event) {
		return null;
	}
}
