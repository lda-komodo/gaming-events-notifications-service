package pro.kmdo.gamenotification.application.use_case;

import org.springframework.beans.factory.annotation.Autowired;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.port.inbound.ProcessEventUserNotifications;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

public abstract class AbstractBaseUseCase<T> implements ProcessEventUserNotifications<T> {
	
	NotificationServiceInterface<Notification> notificationService;
	
	@Autowired
	public AbstractBaseUseCase(NotificationServiceInterface<Notification> notificationService) {
		this.notificationService = notificationService;
	}
	
	@Override
	public void execute(T event) {
		Notification notification = this.buildNotification(event);
		Notification n = notificationService.processUserNotifications(notification);
	
	}
	
	protected abstract Notification buildNotification(T event);
}
