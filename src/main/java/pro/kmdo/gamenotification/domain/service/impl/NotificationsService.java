package pro.kmdo.gamenotification.domain.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class NotificationsService implements NotificationServiceInterface<Notification> {
	@Override
	public Notification processUserNotifications(Notification notification) {
		return notification;
	}
}
